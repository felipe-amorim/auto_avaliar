package intern;

import cucumber.api.PickleStepTestStep;
import cucumber.api.event.*;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;

//import org.apache.log4j.Level;
//import org.apache.log4j.LogManager;
//import org.apache.log4j.Logger;


public class ListCucumber implements ConcurrentEventListener {

    private final EventHandler<TestStepStarted> testStepStartedHandler = new EventHandler<TestStepStarted>() {
        @Override
        public void receive(TestStepStarted event) {
            try {
                PickleStepTestStep testStep = (PickleStepTestStep) event.testStep;
                System.out.println("BDD> " + ((PickleStepTestStep) event.testStep).getStepText());
                Instances.getReportClassInstance().createBDD(((PickleStepTestStep) event.testStep).getStepText());
                Instances.setExecutionActionTimer(Calendar.getInstance().getTimeInMillis());
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    };

    private final EventHandler<TestStepFinished> testStepFinishedHandler = new EventHandler<TestStepFinished>() {
        @Override
        public void receive(TestStepFinished event) {
            System.out.println("=====================================================");
        }
    };

    private void removeLog4J()
    {
        //List<Logger> loggers = Collections.<org.testng.log4testng.Logger>list(LogManager.getCurrentLoggers());
        //loggers.add(LogManager.getRootLogger());
        //for (Logger logger : loggers) {
        //    logger.setLevel(Level.OFF);
        //}
    }

    private final EventHandler<TestCaseStarted> testCaseStartedHandler = new EventHandler<TestCaseStarted>() {
        @Override
        public void receive(TestCaseStarted event) {
            removeLog4J();
            System.out.println("===== INICIANDO CASO DE TESTE: "+event.testCase.getName()+" ==============");

            System.out.println("pacote: "+event.testCase.getUri());

            String title = "Não definido";
            String author = "Não definido";
            String category = "Não definido";
            String environment = "Não definido";
            String[] path = event.testCase.getUri().split("/");

            String[] productPathArray = event.testCase.getUri().split("/produtos/");
            String[] productNameArray = productPathArray[1].split("/");
            Instances.setProduct(productNameArray[0]);

            try {
                String[] partesScenarioTitle = event.testCase.getName().split("Author:");
                title = partesScenarioTitle[0].replace(",", "").trim();
                String[] partesScenarioAuthorAndCategory = partesScenarioTitle[1].split("Category:");
                author = partesScenarioAuthorAndCategory[0].replace(",", "").trim();
                String[] partesScenarioCategoryAndEnvironment = partesScenarioAuthorAndCategory[1].split("Environment:");
                category = partesScenarioCategoryAndEnvironment[0].replace(",", "").trim();
                environment = partesScenarioCategoryAndEnvironment[1].replace(",", "").trim();

            }catch (ArrayIndexOutOfBoundsException e){
                String[] partesScenarioTitle = event.testCase.getName().split("Autor:");
                title = partesScenarioTitle[0].replace(",", "").trim();
                String[] partesScenarioAuthorAndCategory = partesScenarioTitle[1].split("Categoria:");
                author = partesScenarioAuthorAndCategory[0].replace(",", "").trim();
                category = partesScenarioAuthorAndCategory[1].replace(",", "").trim();

            }

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
                Instances.scenario = "";
                Instances.step = "";
            }

            if(!Instances.getScenario().equals(title)) {
                Instances.setScenario(title);
                Instances.createScenarioSection();
            }
        }
    };

    private final EventHandler<TestRunStarted> testTestRunStarted = new EventHandler<TestRunStarted>() {
        @Override
        public void receive(TestRunStarted event) {
            System.out.println("-------INICIANDO TESTES-------");
            System.out.println("Usuário de execução: "+System.getProperty("user.name"));
        }
    };

    private final EventHandler<TestCaseFinished> testCaseFinishedHandler = new EventHandler<TestCaseFinished>() {
        @Override
        public void receive(TestCaseFinished event) {
            System.out.println("===== FINALIZANDO CASO DE TESTE: "+event.testCase.getName()+" ==============");
            //System.out.println("ah");
            //System.out.println("ct: "+ event.testCase.getName());
            if(!Instances.getTestsKilled()){
                if(
                        event.result.getStatus().toString().equals("FAILED")
                                && !event.result.getErrorMessage().contains("[FALHA]")
                                && !event.result.getErrorMessage().contains("[ALERTA]")
                                && !event.result.getErrorMessage().contains("[AMBIENTE]")
                ){
                    //System.out.println("~~~~");
                    System.out.println(event.result.getErrorMessage());
                    //System.out.println("~~~~");
                    //System.out.println("aqui");
                    Instances.getReportClassInstance().stepError(event.result.getError());
                }
                if(event.result.getStatus().toString().equals("UNDEFINED")){
                    Instances.getReportClassInstance().stepError(event.result.getError());
                }
            }
            //System.out.println("fim");
            Instances.setTestsKilled(false);
            System.out.println("result: "+event.result.getStatus());
            Instances.killWebDriver();
        }
    };

    private EventHandler<TestRunStarted> runStartHandler = new EventHandler<TestRunStarted>() {

        @Override
        public void receive(TestRunStarted event) {
            System.out.println("start--");
            System.out.println(event.getClass());
            System.out.println("--start");
        }
    };

    private EventHandler<TestRunFinished> runFinishHandler = new EventHandler<TestRunFinished>() {

        @Override
        public void receive(TestRunFinished event) {
            System.out.println("-------FINALIZANDO TESTES-------");
            System.out.println("Removendo processos remanescentes do chromedriver");
            Instances.commandEx("taskkill /F /IM \"chromedriver.exe\" /T");
            System.out.println("--------------------------------");
        }
    };

    @Override
    public void setEventPublisher(final EventPublisher publisher) {
        publisher.registerHandlerFor(TestRunStarted.class, testTestRunStarted);
        publisher.registerHandlerFor(TestCaseStarted.class, testCaseStartedHandler);
        publisher.registerHandlerFor(TestCaseFinished.class, testCaseFinishedHandler);
        publisher.registerHandlerFor(TestStepStarted.class, testStepStartedHandler);
        publisher.registerHandlerFor(TestStepFinished.class, testStepFinishedHandler);
        publisher.registerHandlerFor(TestRunFinished.class, runFinishHandler);
        publisher.registerHandlerFor(TestRunStarted.class, runStartHandler);
    }
}
