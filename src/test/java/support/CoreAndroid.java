package support;

import intern.Instances;
import support.android.ScrollAndroid;
import support.android.find.ActionsAndroid;
import support.android.find.exceptionals.ExceptionalsAndroid;
import support.android.sleep.SleepAndroid;
import support.convert.Converter;
import support.db.Db;
import support.error.Error;
import support.log.Log;
import support.web.find.AssertThat;

public abstract class CoreAndroid {

    public ActionsAndroid find(String xpath){
        Instances.setAndroidDriver();
        Instances.setAndroidLastXpath(xpath);
        System.out.println(Instances.getAndroidLastXpath());
        return Instances.getActionsAndroidClassInstance();
    }

    public ExceptionalsAndroid find(){
        Instances.setAndroidDriver();
        return Instances.getExceptionalsAndroidClassInstance();
    }

    public Converter convert(){
        return Instances.getConverterClassInstance();
    }

    public ScrollAndroid scroll(){
        Instances.setAndroidDriver();
        return Instances.getScrollAndroidClassInstance();
    }

    public SleepAndroid sleep(){
        Instances.setAndroidDriver();
        return Instances.getSleepAndroidClassInstance();
    }

    public support.android.adriver.AndroidDriver androidDriver(){
        return Instances.getAndroidDriverClassInstance();
    }

    public Log log(){
        return Instances.getLogClassInstance();
    }

    public void evidence(String complemento){
        Instances.setAndroidDriver();
        Instances.getScreenshotClassInstance().print();
        Instances.getReportClassInstance().stepPass(Instances.getMessageScreenshotForced()+complemento);
    }

    public Error error(){
        return Instances.getErrorClassInstance();
    }

    public Db db(){
        return Instances.getDbClassInstance();
    }

    protected CoreAndroid help(){
        return this;
    }

    public AssertThat assertThat(String text){
        Instances.setAssertionText(text);
        return Instances.getAssertThatClassInstance();
    }
}
