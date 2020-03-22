package support.web.find;

import intern.Instances;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class SendsWeb {
    public SendsWeb slow(){
        Instances.setSlow(true);
        return this;
    }

    public void enter(){
        if (!Instances.getEach()) {
            //Instances.getLastElements().get(0).sendKeys(Keys.ENTER);
            Instances.getLocatorClass().execute(()->{
                Instances.getLastElements().get(0).sendKeys(Keys.ENTER);});
            Instances.getScreenshotClass().printSelenium();
            Instances.getReportClass().stepPass(Instances.getMessageSend().replace("arg0", "ENTER") + Instances.getLastXpathLog());
        } else {
            for (WebElement element : Instances.getLastElements()) {
                //element.sendKeys(Keys.ENTER);
                Instances.getLocatorClass().execute(()->{element.sendKeys(Keys.ENTER);});
                Instances.getReportClass().stepPass(Instances.getMessageSendEach().replace("arg0", "ENTER") + Instances.getLastXpathLog());
            }
            Instances.setEach(false);
        }
    }

    public void text(String text){
        if(!Instances.getSlow()) {
            if (!Instances.getEach()) {
                //Instances.getLastElements().get(0).sendKeys(text);
                Instances.getLocatorClass().execute(()->{
                    Instances.getLastElements().get(0).sendKeys(text);});
                Instances.getScreenshotClass().printSelenium();
                Instances.getReportClass().stepPass(Instances.getMessageSend().replace("arg0", text) + Instances.getLastXpathLog());
            } else {
                for (WebElement element : Instances.getLastElements()) {
                    //element.sendKeys(text);
                    Instances.getLocatorClass().execute(()->{element.sendKeys(text);});
                    Instances.getScreenshotClass().printSelenium();
                    Instances.getReportClass().stepPass(Instances.getMessageSendEach().replace("arg0", text) + Instances.getLastXpathLog());
                }
                Instances.setEach(false);
            }
        }else {
            if (!Instances.getEach()) {
                for (char c : text.toCharArray()) {
                    //Instances.getLastElements().get(0).sendKeys(String.valueOf(c));
                    Instances.getLocatorClass().execute(()->{
                        Instances.getLastElements().get(0).sendKeys(String.valueOf(c));});
                    Instances.getWaitClass().until(50);
                }
                Instances.getScreenshotClass().printSelenium();
                Instances.getReportClass().stepPass(Instances.getMessageSendSlow().replace("arg0", text) + Instances.getLastXpathLog());
            }else {
                for (WebElement element : Instances.getLastElements()) {
                    for (char c : text.toCharArray()) {
                        //element.sendKeys(String.valueOf(c));
                        Instances.getLocatorClass().execute(()->{element.sendKeys(String.valueOf(c));});
                        Instances.getWaitClass().until(50);
                    }
                    Instances.getScreenshotClass().printSelenium();
                    Instances.getReportClass().stepPass(Instances.getMessageSendSlowEach().replace("arg0", text) + Instances.getLastXpathLog());
                }
                Instances.setEach(false);
            }
        }
    }
}
