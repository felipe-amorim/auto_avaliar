package support;

import intern.Instances;
import support.convert.Converter;
import support.db.Db;
import support.error.Error;
import support.log.Log;
import support.web.driver.Driver;
import support.web.find.ActionsWeb;
import support.web.find.AssertThat;
import support.web.find.Scroll;
import support.web.find.exceptionals.Exceptionals;
import support.web.sleep.SleepWeb;

public abstract class CoreWeb {

    //region NAVIGATION CLASSES
    public ActionsWeb find(String xpath){
        Instances.setLastXpath(xpath);
        return Instances.getActionsClass();
    }

    public Exceptionals find(){
        return Instances.getExceptionalsClass();
    }

    public Converter convert(){
        return Instances.getConverterClass();
    }

    public Scroll scroll(){
        return Instances.getScrollClass();
    }

    public SleepWeb sleep(){
        return Instances.getWaitClass();
    }

    public Driver driver(){
        return Instances.getDriverClass();
    }

    public Log log(){
        return Instances.getLogClass();
    }

    public Error error(){
        return Instances.getErrorClass();
    }

    public Db db(){
        return Instances.getDbClass();
    }
    //endregion

    protected CoreWeb help(){
        return this;
    }

    public AssertThat assertThat(String text){
        Instances.setAssertionText(text);
        return Instances.getAssertThatClass();
    }
}
