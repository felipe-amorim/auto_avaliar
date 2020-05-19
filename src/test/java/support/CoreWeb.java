package support;

import intern.Instances;
import support.db.Db;
import support.web.driver.WebDriver;
import support.web.find.AssertThat;
import support.web.sleep.SleepWeb;
import support.convert.Converter;
import support.error.Error;
import support.web.find.exceptionals.ExceptionalsWeb;
import support.log.Log;
import support.web.find.ActionsWeb;
import support.web.ScrollWeb;

public abstract class CoreWeb {

    //region NAVIGATION CLASSES
    public ActionsWeb find(String xpath){
        Instances.setWebDriver();
        Instances.setWebLastXpath(xpath);
        return Instances.getActionsClassInstance();
    }

    public ExceptionalsWeb find(){
        Instances.setWebDriver();
        return Instances.getExceptionalsWebClassInstance();
    }

    public Converter convert(){
        return Instances.getConverterClassInstance();
    }

    public ScrollWeb scroll(){
        Instances.setWebDriver();
        return Instances.getScrollWebClassInstance();
    }

    public SleepWeb sleep(){
        Instances.setWebDriver();
        return Instances.getSleepWebClassInstance();
    }

    public WebDriver webDriver(){
        Instances.setWebDriver();
        return Instances.getWebDriverClassInstance();
    }

    public Log log(){
        return Instances.getLogClassInstance();
    }

    public void evidence(String complemento){
        Instances.setWebDriver();
        Instances.getScreenshotClassInstance().print();
        Instances.getReportClassInstance().stepPass(Instances.getMessageScreenshotForced()+complemento);
    }

    public Error error(){
        return Instances.getErrorClassInstance();
    }

    public Db db(){
        return Instances.getDbClassInstance();
    }
    //endregion

    protected CoreWeb help(){
        return this;
    }

    public AssertThat assertThat(String text){
        Instances.setWebDriver();
        Instances.setAssertionText(text);
        return Instances.getAssertThatClassInstance();
    }
}
