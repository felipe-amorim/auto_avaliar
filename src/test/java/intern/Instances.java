package intern;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.CapabilityType;
import support.convert.Converter;
import support.convert.dates.Adder;
import support.convert.dates.Datter;
import support.convert.dates.Remover;
import support.db.Db;
import support.db.SetDb;
import support.db.TypeDB;
import support.error.Error;
import support.log.Log;
import support.screen.driver.Screen;
import support.web.driver.*;
import support.web.find.*;
import support.web.find.combobox.ComboBox;
import support.web.find.combobox.GetterComboBox;
import support.web.find.combobox.SetterComboBox;
import support.web.find.exceptionals.Exceptionals;
import support.web.find.exceptionals.Frames;
import support.web.find.exceptionals.GetterPopUps;
import support.web.find.exceptionals.PopUps;
import support.web.sleep.SleepWeb;

import java.io.*;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class Instances {

    private static String lastLog = null;

    public static String getLastLog() {
        return lastLog;
    }

    public static void setLastLog(String lastLog) {
        Instances.lastLog = lastLog;
    }

    //region CLASS INSTANCES
    private static ActionsWeb actionsWebInstance = null;
    private static Log logInstance = null;
    private static PopUps popUpsInstance = null;
    private static Converter converterInstance = null;
    private static Scroll scrollInstance = null;
    private static SleepWeb sleepWebInstance = null;
    private static Driver driverInstance = null;
    private static Error errorInstance = null;
    private static Frames framesInstance = null;
    private static Exceptionals exceptionalsInstance = null;
    private static Datter datterInstance = null;
    private static SetDb setDbInstance = null;
    private static TypeDB typeDBInstance = null;
    private static Db DbInstance = null;
    private static SendsWeb sendsWebInstance = null;
    private static ClicksWeb clicksWebInstance = null;
    private static ComboBox comboBoxInstance = null;
    private static GetterActionsWeb findGetterActionsWebInstance = null;
    private static LocatorWeb locatorWebInstance = null;
    private static GetterPopUps getterPopUpsInstance = null;
    private static SetterComboBox setterComboBoxInstance = null;
    private static GetterComboBox getterComboBoxInstance = null;
    private static GetterConfig getterConfigInstance = null;
    private static SetterConfig setterConfigInstance = null;
    private static ChromeCapabilities chromeCapabilitiesInstance = null;
    private static IEOptions iEOptionsInstance = null;
    private static BrowserTypes browserTypesInstance = null;
    private static DriverOptions driverOptionsInstance = null;
    private static Adder adderInstance = null;
    private static Remover removerInstance = null;
    private static Screenshot screenshotInstance = null;
    private static Report reportInstance = null;
    private static AssertThat assertThatInstance = null;
    private static Screen screenInstance = null;
    //endregion

    //region DB VARIABLES
    private static String dbuser = "";
    private static String dbpassword = "";
    private static String dbtnsnames = "";
    private static String dbtype = "oracle";
    private static String dbname = "";
    private static String dbadress = "";
    private static String dbport = "";
    //endregion

    //region COMMONS INSTANCES
    private static Date dateInstance = null;
    private static LinkedHashMap<String, String> locator;
    private static String screenShotLocation = "";
    private static Boolean softAssert = false;
    //endregion

    //region ENVIRONMENT INSTANCES
    private static String resourcesPath = System.getProperty("user.dir") + "/src/test/resources/";
    private static String jenkinsPath = resourcesPath+"jenkins/";
    private static String jenkinsAnexosPath = jenkinsPath+"anexos/";
    private static String detailedHtmlReportFileName = "Relatorio_detalhado_testes.html";
    private static String detailedHtmlReportFileLoc = jenkinsAnexosPath + detailedHtmlReportFileName;
    private static String jenkinsEvidencesPath = jenkinsPath+"evidencias/";
    //endregion

    //region EXECUTION VARIABLES
    private static List<List<Object>> tabName = new ArrayList<>();
    private static List<List<Object>> tabNameClosed = new ArrayList<>();
    private static boolean testsKilled = false;
    private static boolean each = false;
    private static boolean slow = false;
    private static long executionActionTimer = 0;
    //endregion

    //region WAIT VARIABLES
    private static int defaultWaitMilisBackUp = 20000;
    private static int defaultWaitMilis = 20000;
    //endregion

    //region SCREEN VARIABLES
    private static org.sikuli.script.Screen screenSikuli = null;
    //endregion

    //region SCREEN GET AND SET

    public static org.sikuli.script.Screen getScreenSikuli() {
        if(screenSikuli==null){
            screenSikuli = new org.sikuli.script.Screen();
        }
        return screenSikuli;
    }

    //endregion

    //region WEBDRIVER VARIABLES
    public static Set<String> lastWindows = null;
    public static Iterator<String> lastIeratos = null;
    public static boolean isAvailable = false;
    public static String chrome = "chrome";
    private static boolean headless = false;

    public static String firefox = "firefox";

    public static String internetExplorer = "internetExplorer";
    private static boolean compability = false;
    private static boolean cleanSection = false;

    private static boolean maximized = false;
    private static int[] resolution = { 1440 , 900 };
    private static String webdriverType = "chrome";
    private static WebDriver driver = null;
    private static String lastXpath = "";
    private static String assertionText = "";
    private static List<WebElement> lastElements = null;

    public static String getAssertionText() {
        return assertionText;
    }

    public static void setAssertionText(String assertionText) {
        Instances.assertionText = assertionText;
    }

    public static boolean getIsAvailable() {
        return isAvailable;
    }

    public static void setIsAvailable(boolean isAvailable) {
        Instances.isAvailable = isAvailable;
    }

    public static Set<String> getLastWindows() {
        return lastWindows;
    }

    public static void setLastWindows(Set<String> lastWindows) {
        Instances.lastWindows = lastWindows;
    }

    public static Iterator<String> getLastIeratos() {
        return lastIeratos;
    }

    public static void setLastIeratos(Iterator<String> lastIeratos) {
        Instances.lastIeratos = lastIeratos;
    }

    public static WebDriver getWebDriver() {
        if (driver == null || driver.toString().contains("null")) {
            if(webdriverType.equals(chrome)){
                createChrome();
            }else if(webdriverType.equals(internetExplorer)){
                createInternetExplorer();
            }else {
                createFireFox();
            }
        }
        return driver;
    }
    private static void createFireFox() {

    }
    private static void createInternetExplorer() {
        System.setProperty("webdriver.ie.driver", "src/test/resources/drivers/IEDriverServerNew.exe");
        InternetExplorerOptions options = new InternetExplorerOptions();

        //DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
        if(getCleanSection()) {
            options.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
            //    caps.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
        }
        //caps.setCapability("ignoreZoomSetting", true);
        //caps.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
        //caps.setCapability(InternetExplorerDriver.ELEMENT_SCROLL_BEHAVIOR, true);
        //DesiredCapabilities.internetExplorer().setCapability("ignoreProtectedModeSettings", true);
        //caps.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        //caps.setCapability(CapabilityType.SUPPORTS_JAVASCRIPT, true);
        //caps.setJavascriptEnabled(true);
        options.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
        options.setCapability(InternetExplorerDriver.ELEMENT_SCROLL_BEHAVIOR, true);
        options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        options.setCapability(CapabilityType.SUPPORTS_JAVASCRIPT, true);

        driver = new InternetExplorerDriver(options);
        commonsDriver();

        driver.manage().timeouts().implicitlyWait(0, TimeUnit.MILLISECONDS);
        //Instances.createInstance();
        //Instances.flushreport();
    }
    private static void createChrome() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("download.default_directory", System.getProperty("user.dir") + "/src/test/java/resources/downloads/");
        options.setExperimentalOption("prefs", prefs);
        options.addArguments("disable-infobars");
        options.addArguments("--incognito");
        options.addArguments("--disable-gpu");
        options.addArguments("enable-automation");
        options.setPageLoadStrategy(PageLoadStrategy.NONE);
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--allow-insecure-localhost");
        options.addArguments("--ignore-certificate-errors");
        options.addArguments("--window-size="+resolution[0]+","+resolution[1]+"");
        if(getHeadless() || System.getProperty("user.name").contains("ARTIT")){
            options.addArguments("--headless");
        }
        driver = new ChromeDriver(options);
        commonsDriver();

        driver.manage().timeouts().implicitlyWait(0, TimeUnit.MILLISECONDS);
        //Instances.createInstance();
        //Instances.flushreport();
    }
    private static void commonsDriver(){
        driver.manage().window().setPosition(new Point(0,0));
        driver.manage().window().setSize(new Dimension(resolution[0],resolution[1]));
        if(maximized) {
            driver.manage().window().maximize();
        }
    }
    public static void killWebDriver() {
        if (driver != null) {
            getWebDriver().quit();
        }
    }
    //endregion

    static void commandEx(String command) {
        List<String> resp = new ArrayList<String>();
        Process cmdProc;
        try {
            cmdProc = Runtime.getRuntime().exec("cmd /c " + command);
            BufferedReader stdoutReader = new BufferedReader(
                    new InputStreamReader(cmdProc.getInputStream()));
            String line;
            while ((line = stdoutReader.readLine()) != null) {
                System.out.println(line);
                resp.add(line);
            }
            BufferedReader stderrReader = new BufferedReader(
                    new InputStreamReader(cmdProc.getErrorStream()));
            while ((line = stderrReader.readLine()) != null) {
                resp.add(line);
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //region GET CLASS INSTANCES
    public static Screen getScreenClass() {
        if (screenInstance == null) {
            screenInstance = new Screen();
        }
        return screenInstance;
    }
    public static Report getReportClass() {
        if (reportInstance == null) {
            reportInstance = new Report();
        }
        return reportInstance;
    }
    public static Screenshot getScreenshotClass() {
        if (screenshotInstance == null) {
            screenshotInstance = new Screenshot();
        }
        return screenshotInstance;
    }
    public static Remover getRemoverClass() {
        if (removerInstance == null) {
            removerInstance = new Remover();
        }
        return removerInstance;
    }
    public static Adder getAdderClass() {
        if (adderInstance == null) {
            adderInstance = new Adder();
        }
        return adderInstance;
    }
    public static BrowserTypes getBrowserTypesClass() {
        if (browserTypesInstance == null) {
            browserTypesInstance = new BrowserTypes();
        }
        return browserTypesInstance;
    }
    public static DriverOptions getDriverOptionsClass() {
        if (driverOptionsInstance == null) {
            driverOptionsInstance = new DriverOptions();
        }
        return driverOptionsInstance;
    }
    public static IEOptions getIEOptionsClass() {
        if (iEOptionsInstance == null) {
            iEOptionsInstance = new IEOptions();
        }
        return iEOptionsInstance;
    }
    public static ChromeCapabilities getChromeCapabilitiesClass() {
        if (chromeCapabilitiesInstance == null) {
            chromeCapabilitiesInstance = new ChromeCapabilities();
        }
        return chromeCapabilitiesInstance;
    }
    public static SetterConfig getSetterConfigClass() {
        if (setterConfigInstance == null) {
            setterConfigInstance = new SetterConfig();
        }
        return setterConfigInstance;
    }
    public static GetterConfig getGetterConfigClass() {
        if (getterConfigInstance == null) {
            getterConfigInstance = new GetterConfig();
        }
        return getterConfigInstance;
    }
    public static GetterComboBox getGetterComboBoxClass() {
        if (getterComboBoxInstance == null) {
            getterComboBoxInstance = new GetterComboBox();
        }
        return getterComboBoxInstance;
    }
    public static SetterComboBox getSetterComboBoxClass() {
        if (setterComboBoxInstance == null) {
            setterComboBoxInstance = new SetterComboBox();
        }
        return setterComboBoxInstance;
    }
    public static GetterPopUps getGetterPopUpsClass() {
        if (getterPopUpsInstance == null) {
            getterPopUpsInstance = new GetterPopUps();
        }
        return getterPopUpsInstance;
    }
    public static LocatorWeb getLocatorClass() {
        if (locatorWebInstance == null) {
            locatorWebInstance = new LocatorWeb();
        }
        return locatorWebInstance;
    }
    public static GetterActionsWeb getFindGetterClass() {
        if (findGetterActionsWebInstance == null) {
            findGetterActionsWebInstance = new GetterActionsWeb();
        }
        return findGetterActionsWebInstance;
    }
    public static ComboBox getComboBoxClass() {
        if (comboBoxInstance == null) {
            comboBoxInstance = new ComboBox();
        }
        return comboBoxInstance;
    }
    public static ClicksWeb getClicksClass() {
        if (clicksWebInstance == null) {
            clicksWebInstance = new ClicksWeb();
        }
        return clicksWebInstance;
    }
    public static SendsWeb getSendsClass() {
        if (sendsWebInstance == null) {
            sendsWebInstance = new SendsWeb();
        }
        return sendsWebInstance;
    }
    public static Db getDbClass() {
        if (DbInstance == null) {
            DbInstance = new Db();
        }
        return DbInstance;
    }
    public static TypeDB getTypeDBClass() {
        if (typeDBInstance == null) {
            typeDBInstance = new TypeDB();
        }
        return typeDBInstance;
    }
    public static SetDb getSetDbClass() {
        if (setDbInstance == null) {
            setDbInstance = new SetDb();
        }
        return setDbInstance;
    }
    public static Datter getDatterClass() {
        if (datterInstance == null) {
            datterInstance = new Datter();
        }
        return datterInstance;
    }
    public static ActionsWeb getActionsClass() {
        if (actionsWebInstance == null) {
            actionsWebInstance = new ActionsWeb();
        }
        return actionsWebInstance;
    }
    public static Driver getDriverClass() {
        if (driverInstance == null) {
            driverInstance = new Driver();
        }
        return driverInstance;
    }
    public static Converter getConverterClass() {
        if (converterInstance == null) {
            converterInstance = new Converter();
        }
        return converterInstance;
    }
    public static Log getLogClass() {
        if (logInstance == null) {
            logInstance = new Log();
        }
        return logInstance;
    }
    public static Scroll getScrollClass() {
        if (scrollInstance == null) {
            scrollInstance = new Scroll();
        }
        return scrollInstance;
    }
    public static PopUps getPopUpsClass() {
        if (popUpsInstance == null) {
            popUpsInstance = new PopUps();
        }
        return popUpsInstance;
    }
    public static SleepWeb getWaitClass() {
        if (sleepWebInstance == null) {
            sleepWebInstance = new SleepWeb();
        }
        return sleepWebInstance;
    }
    public static Error getErrorClass() {
        if (errorInstance == null) {
            errorInstance = new Error();
        }
        return errorInstance;
    }
    public static Frames getFramesClass() {
        if (framesInstance == null) {
            framesInstance = new Frames();
        }
        return framesInstance;
    }
    public static Exceptionals getExceptionalsClass() {
        if (exceptionalsInstance == null) {
            exceptionalsInstance = new Exceptionals();
        }
        return exceptionalsInstance;
    }
    public static AssertThat getAssertThatClass() {
        if (assertThatInstance == null) {
            assertThatInstance = new AssertThat();
        }
        return assertThatInstance;
    }

    static String getJenkinsPath() {
        return jenkinsPath;
    }
    //endregion

    //region GETTER AND SETTER COMMONS


    public static List<List<Object>> getTabName() {
        return tabName;
    }

    public static void setTabName(List<List<Object>> tabName) {
        Instances.tabName = tabName;
    }

    public static List<List<Object>> getTabNameClosed() {
        return tabNameClosed;
    }

    public static void setTabNameClosed(List<List<Object>> tabNameClosed) {
        Instances.tabNameClosed = tabNameClosed;
    }

    public static LinkedHashMap<String, String> getLocator() {
        return locator;
    }
    public static void setLocator(LinkedHashMap<String, String> locator) {
        Instances.locator = locator;
    }

    public static Boolean getSoftAssert() {
        return softAssert;
    }
    public static void setSoftAssert(Boolean softAssert) {
        Instances.softAssert = softAssert;
    }

    public static String getLastXpath() {
        return lastXpath;
    }
    public static void setLastXpath(String xpath) {
        lastXpath = xpath;
        Instances.setIsAvailable(false);
        Instances.getLocatorClass().locate();
    }

    public static List<WebElement> getLastElements() {
        return lastElements;
    }
    static void setLastElements(List<WebElement> list) {
        lastElements = list;
    }

    static boolean getTestsKilled() {
        return testsKilled;
    }
    static void setTestsKilled(boolean killed) {
        testsKilled = killed;
    }

    public static long getExecutionActionTimer() {
        long time = Calendar.getInstance().getTimeInMillis() - executionActionTimer;
        executionActionTimer = Calendar.getInstance().getTimeInMillis();
        return time;
    }
    static void setExecutionActionTimer(long executionActionTimer) {
        Instances.executionActionTimer = executionActionTimer;
    }

    public static boolean getEach() {
        return each;
    }
    public static void setEach(boolean each) {
        Instances.each = each;
    }

    public static boolean getSlow() {
        return slow;
    }
    public static void setSlow(boolean slow) {
        Instances.slow = slow;
    }

    public static int getDefaultWaitMilis() {
        return defaultWaitMilis;
    }
    public static void setDefaultWaitMilis(int defaultWaitMilis) {
        Instances.defaultWaitMilis = defaultWaitMilis;
    }
    public static void setDefaultWaitMilisBackUp() {
        Instances.defaultWaitMilis = Instances.defaultWaitMilisBackUp;
    }

    private static boolean getHeadless() {
        return headless;
    }
    public static void setHeadless(boolean headless) {
        Instances.headless = headless;
    }

    private static boolean getCompability() {
        return compability;
    }
    public static void setCompability(boolean compability) {
        Instances.compability = compability;
    }

    private static boolean getCleanSection() {
        return cleanSection;
    }
    public static void setCleanSection(boolean cleanSection) {
        Instances.cleanSection = cleanSection;
    }

    private static boolean getMaximized() {
        return maximized;
    }
    public static void setMaximized(boolean maximized) {
        Instances.maximized = maximized;
    }

    public static void setResolution(int width, int height) {
        Instances.resolution[0] = width;
        Instances.resolution[1] = height;
    }
    public static int[] getResolution(){
        return Instances.resolution;
    }

    public static String getWebdriverType() {
        return webdriverType;
    }
    public static void setWebdriverType(String webdriverType) {
        Instances.webdriverType = webdriverType;
    }

    public static Date getDateInstance() {
        if(dateInstance == null){
            dateInstance = new Date();
        }
        return dateInstance;
    }
    public static void setDateInstance(Date dateInstance) {
        Instances.dateInstance = dateInstance;
    }

    public static String getDetailedHtmlReportFileLoc() {
        return detailedHtmlReportFileLoc;
    }

    static String getJenkinsEvidencesPath() {
        return jenkinsEvidencesPath;
    }

    public static String getLastXpathLog(){

        String r = "[Objeto locator de log não definido]";
        if(locator!=null){
            if(locator.get(Instances.getLastXpath())==null){
                r = "[Log do xpath não definido]";;
            }else {
                r = locator.get(Instances.getLastXpath());
            }
        }else {
            if(getLastLog()!=null){
                r = "[Modelo antigo] "+getLastLog();
            }
        }
        return r;
    }

    static String getScreenShotLocation() {
        return screenShotLocation;
    }
    static void setScreenShotLocation(String screenShotLocation) {
        Instances.screenShotLocation = screenShotLocation;
    }
    //endregion

    //region GETTER AND SETTER DB
    public static void setDbuser(String user) {
        Instances.dbuser = user;
    }
    public static void setDbpassword(String password) {
        Instances.dbpassword = password;
    }
    public static void setDbtnsnames(String tnsnames) {
        Instances.dbtnsnames = tnsnames;
    }
    public static void setDbtype(String dbtype) {
        Instances.dbtype = dbtype;
    }
    public static void setDbadress(String dbadress) {
        Instances.dbadress = dbadress;
    }
    public static void setDbname(String dbname) {
        Instances.dbname = dbname;
    }
    public static void setDbport(String dbport) {
        Instances.dbport = dbport;
    }

    public static String getDbname() {
        return dbname;
    }
    public static String getDbpassword() {
        return dbpassword;
    }
    public static String getDbadress() {
        return dbadress;
    }
    public static String getDbport() {
        return dbport;
    }
    public static String getDbtnsnames() {
        return dbtnsnames;
    }
    public static String getDbtype() {
        return dbtype;
    }
    public static String getDbuser() {
        return dbuser;
    }
    //endregion

    //region REPORT
    private static ExtentReports extent = null;

    private static String author="";
    private static String environment="";
    private static String category="";
    private static String scenario="";
    private static String feature="";
    private static String step="";
    private static String product="";

    private static String lastTag="";

    private static ExtentTest featureSection;
    private static ExtentTest scenarioSection;

    public static void setProduct(String product) {
        Instances.product = product;
    }

    static ExtentReports getExtent() {
        return extent;
    }

    public static ExtentTest getFeatureSection() {
        return featureSection;
    }

    public static ExtentTest getScenarioSection() {
        return scenarioSection;
    }

    public static String getScenario() {
        return scenario;
    }

    public static String getFeature() {
        return feature;
    }

    static String getStep() {
        return step;
    }

    public static void setFeature(String feature) {
        Instances.feature = feature;
    }

    public static void setScenario(String scenario) {
        Instances.scenario = scenario;
    }

    public static void setAuthor(String author) {
        Instances.author = author;
    }

    public static void setEnvironment(String environment) {
        Instances.environment = environment;
    }

    public static void setCategory(String category) {
        Instances.category = category;
    }

    static void setStep(String step) {
        Instances.step = step;
    }

    public static void createFeatureSection(){
        if(extent!=null) {
            featureSection = extent.createTest(feature);
        }
    }

    public static void createScenarioSection(){
        if(extent!=null) {
            scenarioSection = featureSection.createNode(scenario, "" +
                    "<span class='author label'><b>Autor: </b> " + author + "</span></br>" +
                    "<span class='author label'><b>Categoria: </b> " + category + "</span></br>" +
                    "<span class='author label'><b>Ambiente: </b> " + environment + "</span></br>" +
                    "");
            scenarioSection.assignAuthor(author);
            scenarioSection.assignCategory(category);
            scenarioSection.assignDevice(environment);
        }
    }

    static void createInstance() {
        if(extent==null) {
            File pastaAnexo = new File(jenkinsAnexosPath);
            System.setProperty("file.encoding", "UTF-8");
            Field charset = null;
            try {
                charset = Charset.class.getDeclaredField("defaultCharset");
                charset.setAccessible(true);
                charset.set(null, null);
            } catch (NoSuchFieldException | IllegalAccessException e) {
                e.printStackTrace();
            }

            boolean o = pastaAnexo.mkdirs();
            ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(detailedHtmlReportFileLoc);
            htmlReporter.config().setTheme(Theme.STANDARD);
            htmlReporter.config().setDocumentTitle("Relatório de Testes - "+product);
            htmlReporter.config().setEncoding("utf-8");
            htmlReporter.config().setReportName("Relatório de Testes - "+product);
            htmlReporter.config().setTimeStampFormat("yyyy/MM/dd - HH:mm:ss.SSS");
            extent = new ExtentReports();
            extent.attachReporter(htmlReporter);
            extent.setSystemInfo("Sistema operacional", System.getProperty("os.name"));
            extent.setSystemInfo("Arquitetura do OS", System.getProperty("os.arch"));
            extent.setSystemInfo("Versão do OS", System.getProperty("os.version"));
            extent.setSystemInfo("Java Version", System.getProperty("java.version"));
            extent.setSystemInfo("Usuário de execução", System.getProperty("user.name"));
            featureSection = extent.createTest(feature);
            scenarioSection = featureSection.createNode(scenario, "" +
                    "<span class='author label'><b>Autor: </b> " + author + "</span></br>" +
                    "<span class='author label'><b>Categoria: </b> " + category + "</span></br>" +
                    "<span class='author label'><b>Ambiente: </b> " + environment + "</span></br>" +
                    "");
            scenarioSection.assignAuthor(author);
            scenarioSection.assignCategory(category);
            scenarioSection.assignDevice(environment);
            extent.flush();
        }
    }



    public static void flushreport() {
        new File(jenkinsAnexosPath).mkdirs();
        extent.flush();
        translateReport();
    }

    private static void translateReport(){
        String content = "";
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(detailedHtmlReportFileLoc));
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            while (line != null) {
                sb.append(line).append("\n");
                line = br.readLine();
            }
            content = sb.toString();
            content = content.replace("<div class='left panel-name'>Tests</div>", "<div class='left panel-name'>Features</div>");
            content = content.replace(" test(s) passed", " feature(s) passed");
            content = content.replace(" test(s) failed, ", " feature(s) failed, ");
            content = content.replace("<div class='left panel-name'>Steps</div>", "<div class='left panel-name'>Scenarios</div>");
            content = content.replace(" step(s) passed", " scenario(s) passed");
            content = content.replace(" step(s) failed, ", " scenario(s) failed, ");

            try (Writer writer = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream(detailedHtmlReportFileLoc, false), StandardCharsets.UTF_8))) {
                writer.write(content);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (IOException e){
            e.printStackTrace();
        }
        if (br != null) {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static String getLastTag() {
        return lastTag;
    }

    public static void setLastTag(String lastTag) {
        Instances.lastTag = lastTag;
    }

    //endregion

    //region EXCEPTIONS MESSAGES
    private static String reset = "\u001B[0m";
    private static String yellow = "\u001B[33m";
    private static String cyan = "\u001B[36m";
    private static String purple = "\u001B[35m";
    private static String white = "\u001B[37m";

    private static String messageStepSkipped = yellow+"PASSO NÃO EXECUTADO!"+reset;
    private static String messageWaitDisapearStillHasElement = yellow+"O ELEMENTO ALMEJADO PARA DESAPARECER AINDA ESTAVA DISPONÍVEL APÓS O TEMPO MÁXIMO DE ESPERA!"+reset;
    private static String messageWaitAppearStillHasElement = yellow+"O ELEMENTO ALMEJADO PARA APARECER NÃO ESTAVA DISPONÍVEL APÓS O TEMPO MÁXIMO DE ESPERA!"+reset;
    private static String messageExecutionInterrupted = yellow+"EXECUÇÃO INTERROMPIDA!"+reset;
    private static String messageFailTests = yellow+"FALHA NOS TESTES!"+reset;
    private static String messageWarning = yellow+"[ALERTA]"+reset;
    private static String messageEnvironmentError = yellow+"FALHA NO AMBIENTE!"+reset;
    private static String messageNumberTooLong = yellow+"\n\nO NÚMERO EXTRAÍDO ERA MUITO LONGO, PERTENCE AO TIPO DE VARIÁVEL "+cyan+"LONG"+yellow+"!\n\n" +
            "UTILIZE A FUNÇÃO "+cyan+" convert().toLong("+purple+"SEUVALOR"+cyan+");"+yellow+" PARA RESOLVER O PROBLEMA!"+reset;
    private static String messageMapNotDefined =
            "\n" + yellow +
                    "VOCÊ NÃO DEFINIU O MAPA DE LOGS (LEIA TODOS OS PASSOS ABAIXO PARA A SOLUÇÃO)" +
                    "\n" +
                    "\n" +
                    "A função "+cyan+"log().setLocator("+purple+"NOMEMAPA"+cyan+");"+yellow+" DEVE ser chamada antes das funções de ação (" +cyan+"find"+yellow+ ")."+
                    "" +
                    "" +
                    "\n" +
                    "\n" +
                    "Para descobrir o nome do mapa, utilize o atalho " +cyan+"F4"+yellow+ " no localizador para navegar até a classe de objects." +
                    "\n" +
                    "\n"+
                    "O mapa provavelmente estará assim: " +white+"public static"+cyan+ " LinkedHashMap<"+white+"String"+cyan+", "+white+"String"+cyan+"> "+purple+"NOMEMAPA"+white+" = createData();" + yellow +
                    "\n" +
                    "\n" +
                    "Exemplo incorreto:\n" +
                    "...\n" +
                    cyan+"find("+purple+"LOCALIZADOR"+cyan+");\n"+yellow+
                    "...\n\n" +
                    "Exemplo correto:\n" +
                    "...\n"+
                    cyan+"log().setLocator("+purple+"NOMEMAPA"+cyan+");\n" +
                    "find("+purple+"LOCALIZADOR"+cyan+");\n"+yellow+
                    "..." +reset;

    public static String getMessageStepSkipped() {
        return messageStepSkipped;
    }

    public static String getMessageExecutionInterrupted() {
        return messageExecutionInterrupted;
    }

    public static String getMessageFailTests() {
        return messageFailTests;
    }

    public static String getMessageWarning() {
        return messageWarning;
    }

    public static String getMessageEnvironmentError() {
        return messageEnvironmentError;
    }

    public static String getMessageNumberTooLong() {
        return messageNumberTooLong;
    }

    public static String getMessageWaitDisapearStillHasElement() {
        return messageWaitDisapearStillHasElement;
    }

    public static String getMessageWaitAppearStillHasElement() {
        return messageWaitAppearStillHasElement;
    }

    public static String getMessageMapNotDefined() {
        return messageMapNotDefined;
    }
    //endregion

    //region ACTIONS MESSAGES
    private static String messageWaitAppear = "Aguardando a exibição do elemento ";
    private static String messageWaitAppearEach = "Aguardando a exibição de todos os elementos que remetem ao localizador do ";

    private static String messageWaitDisapear = "Aguardando a não exibição do elemento ";
    private static String messageWaitDisapearEach = "Aguardando a não exibição de todos os elementos que remetem ao localizador do ";

    private static String messageClick = "Clicando no elemento ";
    private static String messageClickEach = "Clicando em todos os elementos que remetem ao localizador do ";

    private static String messageClear = "Limpando o campo ";
    private static String messageClearEach = "Limpando todos os campos que remetem ao localizador do ";

    private static String messageDoubleClick = "Clicando duas vezes no elemento ";
    private static String messageDoubleClickEach = "Clicando duas vezes em todos os elementos que remetem ao localizador do ";

    private static String messageSend = "Enviando o texto 'arg0' para o campo ";
    private static String messageSendEach = "Enviando o texto 'arg0' para todos os campos que remetem ao localizador do ";

    private static String messageSendSlow = "Enviando o texto 'arg0' devagar para o campo ";
    private static String messageSendSlowEach = "Enviando o texto 'arg0' devagar para todos os campos que remetem ao localizador do";

    private static String messageMove = "Simulando o mouse sobre o elemento ";
    private static String messageMoveEach = "Simulando o mouse sobre o todos os elementos que remetem ao localizador do ";

    private static String messageExists = "Validando a existência do elemento ";
    private static String messageExistsEach = "Validando a existência de todos os elementos que remetem ao localizador do ";

    private static String messageComboBoxText = "Selecionando o texto 'arg0' no ComboBox ";
    private static String messageComboBoxTextEach = "Selecionando o texto 'arg0' em todos os ComboBox que remetem ao localizador do ";

    private static String messageComboBoxValue = "Selecionando o valor 'arg0' no ComboBox ";
    private static String messageComboBoxValueEach = "Selecionando o valor 'arg0' em todos os ComboBox que remetem ao localizador do ";

    private static String messageComboBoxIndex = "Selecionando o index 'arg0' no ComboBox ";
    private static String messageComboBoxIndexEach = "Selecionando o index 'arg0' em todos os ComboBox que remetem ao localizador do ";

    private static String messageComboBoxGetSize = "Retornando a quantidade de itens do ComboBox ";

    private static String messageNavigate = "Navegando para a URI ";

    private static String messageAssertFailEquals = "O texto arg0 não era igual ao texto arg1";

    private static String messageAssertFailContains = "O texto arg0 não continha o texto arg1";

    private static String messageAssertFailStartsWith = "O texto arg0 não começava com o texto arg1";

    private static String messageAssertFailEndsWith = "O texto arg0 não começava com o texto arg1";

    public static String getMessageWaitAppear() {
        return messageWaitAppear;
    }

    public static String getMessageWaitAppearEach() {
        return messageWaitAppearEach;
    }

    public static String getMessageWaitDisapear() {
        return messageWaitDisapear;
    }

    public static String getMessageWaitDisapearEach() {
        return messageWaitDisapearEach;
    }

    public static String getMessageAssertFailEndsWith() {
        return messageAssertFailEndsWith;
    }

    public static String getMessageAssertFailStartsWith() {
        return messageAssertFailStartsWith;
    }

    public static String getMessageAssertFailContains() {
        return messageAssertFailContains;
    }

    public static String getMessageAssertFailEquals() {
        return messageAssertFailEquals;
    }

    public static String getMessageClear() {
        return messageClear;
    }

    public static String getMessageClick() {
        return messageClick;
    }

    public static String getMessageDoubleClick() {
        return messageDoubleClick;
    }

    public static String getMessageSend() {
        return messageSend;
    }

    public static String getMessageSendSlow() {
        return messageSendSlow;
    }

    public static String getMessageMove() {
        return messageMove;
    }

    public static String getMessageExists() {
        return messageExists;
    }

    public static String getMessageClickEach() {
        return messageClickEach;
    }

    public static String getMessageClearEach() {
        return messageClearEach;
    }

    public static String getMessageDoubleClickEach() {
        return messageDoubleClickEach;
    }

    public static String getMessageSendEach() {
        return messageSendEach;
    }

    public static String getMessageSendSlowEach() {
        return messageSendSlowEach;
    }

    public static String getMessageMoveEach() {
        return messageMoveEach;
    }

    public static String getMessageExistsEach() {
        return messageExistsEach;
    }

    public static String getMessageComboBoxText() {
        return messageComboBoxText;
    }

    public static String getMessageComboBoxValue() {
        return messageComboBoxValue;
    }

    public static String getMessageComboBoxValueEach() {
        return messageComboBoxValueEach;
    }

    public static String getMessageComboBoxTextEach() {
        return messageComboBoxTextEach;
    }

    public static String getMessageComboBoxIndex() {
        return messageComboBoxIndex;
    }

    public static String getMessageComboBoxIndexEach() {
        return messageComboBoxIndexEach;
    }

    public static String getMessageComboBoxGetSize() {
        return messageComboBoxGetSize;
    }

    public static String getMessageNavigate() {
        return messageNavigate;
    }

    //endregion
}
