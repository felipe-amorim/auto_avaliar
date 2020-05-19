package support;

import intern.Instances;
import org.apache.commons.io.FileUtils;
//import org.apache.log4j.Level;
//import org.apache.log4j.LogManager;
//import org.apache.log4j.Logger;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

public class MTT {

    private final static int[] localMaximumThreads = {1};
    public static Class<?> invokedStepdef = null;
    public static Method invokedExecutionMethod = null;

    private File[] getFilesFromDirectory(String path) {
        File folder = new File(path);
        return folder.listFiles();
    }

    private LinkedHashMap<File, StringBuilder> getContentOfFiles(File[] files) {
        LinkedHashMap<File, StringBuilder> contentsOfFiles = new LinkedHashMap<>();
        for (File file : files) {
            try {
                StringBuilder content = new StringBuilder();
                BufferedReader br;
                br = new BufferedReader(new FileReader(file));
                String st;
                while ((st = br.readLine()) != null) {
                    if (st.trim().length() > 0) {
                        content.append(st).append("\n");
                    }
                }
                br.close();
                contentsOfFiles.put(file, content);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return contentsOfFiles;
    }

    private LinkedHashMap<String, List<String>> getScenariosFromFileContent(List<String> linhasDeScenarios) {
        LinkedHashMap<String, List<String>> scenarios = new LinkedHashMap<>();
        for (String linhaDoScenario : linhasDeScenarios) {
            if (linhaDoScenario.trim().startsWith("Scenario:")) {
                List<String> metodos = new ArrayList<>();
                int i = linhasDeScenarios.indexOf(linhaDoScenario) + 1;
                while (!linhasDeScenarios.get(i).contains("Scenario:")) {
                    metodos.add(linhasDeScenarios.get(i).trim());
                    if (i >= linhasDeScenarios.size() - 1) {
                        break;
                    }
                    i++;
                }
                scenarios.put(linhaDoScenario.trim(), metodos);
            }
        }
        return scenarios;
    }

    private LinkedHashMap<Class<?>, Method> getFindMethod(LinkedHashMap<File, StringBuilder> stepdefsNoClass, LinkedHashMap<Class<?>, List<Method>> stepdefs, String step) {
        LinkedHashMap<Class<?>, Method> result = new LinkedHashMap<>();
        String rawMethodLine = "";
        for (Map.Entry<File, StringBuilder> entrySStepDef : stepdefsNoClass.entrySet()) {
            String[] linesContent = entrySStepDef.getValue().toString().split("[\n;]");
            String[] stepParts = step.split("\"");
            List<String> stepPartsToSearch = new ArrayList<>();
            for (int i = 0; i < stepParts.length; i++) {
                if (i % 2 == 0) {
                    stepPartsToSearch.add(stepParts[i]);
                }
            }
            for (String line : linesContent) {
                boolean found = true;
                for (String part : stepPartsToSearch) {
                    if (!line.contains(part)) {
                        found = false;
                        break;
                    }
                }
                if (found) {
                    //System.out.println("method: " + linesContent[Arrays.asList(linesContent).indexOf(line) + 1]);
                    rawMethodLine = linesContent[Arrays.asList(linesContent).indexOf(line) + 1];
                    break;
                }
            }
        }
        for (Map.Entry<Class<?>, List<Method>> entrySStepDef : stepdefs.entrySet()) {
            boolean found = false;
            String[] arrayOfStringsRawMethodLine = rawMethodLine.split("[ (]");
            for (String partRaw : arrayOfStringsRawMethodLine) {
                for (Method method : entrySStepDef.getValue()) {
                    if (method.getName().equals(partRaw)) {
                        result.put(entrySStepDef.getKey(), method);
                        found = true;
                        break;
                    }
                }
                if (found) {
                    break;
                }
            }
            if (found) {
                break;
            }
        }
        return result;
    }

    private void removeLog4J()
    {
        //List<Logger> loggers = Collections.<org.testng.log4testng.Logger>list(LogManager.getCurrentLoggers());
        //loggers.add(LogManager.getRootLogger());
        //for (Logger logger : loggers) {
        //    logger.setLevel(Level.OFF);
        //}
    }

    public void run(String stepDefs, String features, int maxInstances) {
        removeLog4J();
        System.out.println("-------INICIANDO TESTES-------");
        System.out.println("Usuário de execução: "+System.getProperty("user.name"));

        //............class....list of methods.........
        LinkedHashMap<Class<?>, List<Method>> stepdefs = new LinkedHashMap<>();

        File[] arrayOfFilesStepDefs = getFilesFromDirectory(System.getProperty("user.dir") + stepDefs);

        //............file....content.........
        LinkedHashMap<File, StringBuilder> stepdefsNoClass = getContentOfFiles(arrayOfFilesStepDefs);
        for (Map.Entry<File, StringBuilder> entrySStepDef : stepdefsNoClass.entrySet()) {
            Class<?> act = null;
            try {
                act = Class.forName(entrySStepDef.getKey().getPath().split("\\\\java\\\\")[1].replace(".java", "").replace("\\", "."));
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            stepdefs.put(act, Arrays.asList(act != null ? act.getMethods() : new Method[0]));
        }

        File[] arrayOfFilesFeatures = getFilesFromDirectory(System.getProperty("user.dir") + features);
        LinkedHashMap<File, StringBuilder> contentsOfFiles = getContentOfFiles(arrayOfFilesFeatures);
        //Report.createInstance();
        //foreach feature file
        for (Map.Entry<File, StringBuilder> entryContentsOfFiles : contentsOfFiles.entrySet()) {

            //Instances.setFeature(entryContentsOfFiles.getKey().getName());
            //Instances.createFeatureSection();

            //............file....list of scenarios.........
            LinkedHashMap<String, List<String>> scenarios = getScenariosFromFileContent(Arrays.asList(entryContentsOfFiles.getValue().toString().split("[\n;]")));
            LinkedHashMap<Integer, Boolean> openThreads = new LinkedHashMap<>();
            int threadCount = 0;
            localMaximumThreads[0] = maxInstances;

            for (Map.Entry<String, List<String>> entryScenarios : scenarios.entrySet()) {
                threadCount++;
                openThreads.put(threadCount, true);
                while (localMaximumThreads[0] == 0) {
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                int finalThreadCount = threadCount;

                localMaximumThreads[0]--;

                //String[] partesScenarioTitle = entryScenarios.getKey().split("Author:");
                //String title = partesScenarioTitle[0].replace(",", "").trim();
                //String[] partesScenarioAuthorAndCategory = partesScenarioTitle[1].split("Category:");
                //String author = partesScenarioAuthorAndCategory[0].replace(",", "").trim();
                //String[] partesScenarioCategoryAndEnvironment = partesScenarioAuthorAndCategory[1].split("Environment:");
                //String category = partesScenarioCategoryAndEnvironment[0].replace(",", "").trim();
                //String environment = partesScenarioCategoryAndEnvironment[1].replace(",", "").trim();
//
                ////System.out.println(author);
                ////System.out.println(category);
                ////System.out.println(environment);
//
                //Instances.setAuthor(author);
                //Instances.setEnvironment(environment);
                //Instances.setCategory(category);
                //Instances.setScenario(title);

                //new Thread(() -> {
                /*-----------------------------
                BLOCO DE INICIO DE TESTE
                 */



                String title = "Não definido";
                String author = "Não definido";
                String category = "Não definido";
                String environment = "Não definido";
                String[] path = entryContentsOfFiles.getKey().toPath().toString().split("\\\\");

                String[] productPathArray = features.split("/produtos/");
                String[] productNameArray = productPathArray[1].split("/");
                Instances.setProduct(productNameArray[0]);

                try {
                    String[] partesScenarioTitle = entryScenarios.getKey().split("Author:");
                    title = partesScenarioTitle[0].replace(",", "").trim();
                    String[] partesScenarioAuthorAndCategory = partesScenarioTitle[1].split("Category:");
                    author = partesScenarioAuthorAndCategory[0].replace(",", "").trim();
                    String[] partesScenarioCategoryAndEnvironment = partesScenarioAuthorAndCategory[1].split("Environment:");
                    category = partesScenarioCategoryAndEnvironment[0].replace(",", "").trim();
                    environment = partesScenarioCategoryAndEnvironment[1].replace(",", "").trim();

                }catch (ArrayIndexOutOfBoundsException e){
                    String[] partesScenarioTitle = entryScenarios.getKey().split("Autor:");
                    title = partesScenarioTitle[0].replace(",", "").trim();
                    String[] partesScenarioAuthorAndCategory = partesScenarioTitle[1].split("Categoria:");
                    author = partesScenarioAuthorAndCategory[0].replace(",", "").trim();
                    category = partesScenarioAuthorAndCategory[1].replace(",", "").trim();

                }

                System.out.println("===== INICIANDO CASO DE TESTE: "+title+" ==============");
                System.out.println("Feature: "+path[path.length-1].replace(".feature", ""));

                Instances.setAuthor(author.replace(" ", "_"));
                Instances.setEnvironment(environment.replace(" ", "_"));
                Instances.setCategory(category.replace(" ", "_"));


                if(Instances.getExtent()==null){
                    try {
                        FileUtils.deleteDirectory(new File(Instances.getJenkinsPath()));
                    } catch (IOException ignored) {
                        //e.printStackTrace();
                    }
                    Instances.setFeature(path[path.length-1].replace(".feature", ""));
                    Instances.setScenario(title);
                    Instances.createInstance();
                }

                if(!Instances.getFeature().equals(path[path.length-1].replace(".feature", ""))){
                    Instances.setFeature(path[path.length-1].replace(".feature", ""));
                    Instances.createFeatureSection();
                }

                if(!Instances.getScenario().equals(title)) {
                    Instances.setScenario(title);
                    Instances.createScenarioSection();
                }

                /*-----------------------------
                fim BLOCO DE INICIO DE TESTE
                 */
                //Instances.createScenarioSection();

                int myNumber = finalThreadCount;
                Throwable exception = null;
                boolean testFailed = false;
                for (String step : entryScenarios.getValue()) {
                    if(!testFailed) {
                        if (step.startsWith("Given ")) {
                            step = step.replace("Given ", "");
                        }
                        if (step.startsWith("When ")) {
                            step = step.replace("When ", "");
                        }
                        if (step.startsWith("Then ")) {
                            step = step.replace("Then ", "");
                        }

                        if (step.startsWith("And ")) {
                            step = step.replace("And ", "");
                        }

                        //System.out.println("step: "+step);
                        if (step.trim().startsWith("#")) {
                            System.out.println("COMENTADO");
                        }
                        //////////////////////Report.stepPass(step);


                        String[] stepParts = step.split("\"");
                        List<Object> stepParameters = new ArrayList<>();
                        for (int i = 0; i < stepParts.length; i++) {
                            if (i % 2 != 0) {
                                stepParameters.add(stepParts[i]);
                            }
                        }
                        Object classInstance = null;
                        LinkedHashMap<Class<?>, Method> result = getFindMethod(stepdefsNoClass, stepdefs, step);
                        for (Map.Entry<Class<?>, Method> entryResult : result.entrySet()) {

                            //entryResult.getValue().invoke(entryResult.getKey().newInstance(), stepParameters.toArray());
                            try {
                                if (classInstance == null) {
                                    classInstance = entryResult.getKey().newInstance();
                                }


                                //System.out.println("BDD: "+entryResult.getValue().getName());

                                //System.out.println(entryResult.getKey().getName()+" - "+entryResult.getValue());
                                invokedStepdef = entryResult.getKey();
                                invokedExecutionMethod = entryResult.getValue();


                                System.out.println("BDD> " + step);
                                System.out.println("Method> " + entryResult.getValue().getName());
                                Instances.setExecutionActionTimer(Calendar.getInstance().getTimeInMillis());

                                entryResult.getValue().invoke(classInstance, stepParameters.toArray());

                                System.out.println("=====================================================");

                            } catch (IllegalAccessException | InvocationTargetException | InstantiationException e) {
                                e.printStackTrace();
                                testFailed = true;
                                exception = e;
                            }

                        }
                    }
                }
                if (!Instances.getWebDriver().toString().contains("null")) {
                    Instances.killWebDriver(); //todo retirar comentario quando terminar mtt
                }
                //System.out.println("FINALIZANDO TESTES");
                /*-----------------------------
                BLOCO DE FIM DE TESTE
                 */

                System.out.println("===== FINALIZANDO CASO DE TESTE: "+title+" ==============");
                if(!testFailed) {
                    System.out.println("Result: PASSED");
                }else {
                    System.out.println("Result: FAIL");
                }

                //System.out.println("ct: "+ event.testCase.getName());
                if(!Instances.getTestsKilled()){
                    if(
                            testFailed
                                    && !exception.getMessage().contains("[FALHA]")
                                    && !exception.getMessage().contains("[ALERTA]")
                                    && !exception.getMessage().contains("[AMBIENTE]")
                    ){
                        System.out.println("~~~~");
                        System.out.println(exception.getMessage());
                        System.out.println("~~~~");
                        System.out.println("aqui");
                        Instances.getReportClassInstance().stepError(exception);
                    }
                    //if(event.result.getStatus().toString().equals("UNDEFINED")){
                    //    Instances.getReportClassInstance().stepError(event.result.getError());
                    //}
                }

                Instances.setTestsKilled(false);
                //System.out.println("result: "+event.result.getStatus());
                //Instances.killWebDriver();

                /*-----------------------------
                fim BLOCO DE FIM DE TESTE
                 */
                openThreads.put(myNumber, false);
                localMaximumThreads[0]++;
                //}).start();
            }
            boolean thereIsNoMoreOpenedThreads = true;
            while (thereIsNoMoreOpenedThreads) {
                thereIsNoMoreOpenedThreads = false;
                for (Map.Entry<Integer, Boolean> entryOpenThreads : openThreads.entrySet()) {
                    if (entryOpenThreads.getValue()) {
                        thereIsNoMoreOpenedThreads = true;
                        try {
                            Thread.sleep(500);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }

        }

        Instances.flushReportAndMongo();
        System.out.println("-------FINALIZANDO TESTES-------");
        System.out.println("Removendo processos remanescentes do chromedriver");
        Instances.commandEx("taskkill /F /IM \"chromedriver.exe\" /T");
        System.out.println("--------------------------------");

    }
}
