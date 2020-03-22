package support.web.find;

import intern.Instances;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import support.web.find.combobox.ComboBox;

public class ActionsWeb {
    public ClicksWeb click() {
        throwExceptionNoElement();
        if (!Instances.getEach()) {
            //Instances.getLastElements().get(0).click();
            Instances.getLocatorClass().execute(()->{
                Instances.getLastElements().get(0).click();});
            Instances.getScreenshotClass().printSelenium();
            Instances.getReportClass().stepPass(Instances.getMessageClick() + Instances.getLastXpathLog());
        } else {
            for (WebElement element : Instances.getLastElements()) {
                //element.click();
                Instances.getLocatorClass().execute(element::click);
                Instances.getScreenshotClass().printSelenium();
                Instances.getReportClass().stepPass(Instances.getMessageClickEach() + Instances.getLastXpathLog());
            }
            Instances.setEach(false);
        }
        return Instances.getClicksClass();
    }

    private void throwExceptionNoElement(){
        if (Instances.getLastElements().size()<=0) {
            Instances.getReportClass().stepError(new NoSuchElementException("O xpath " + Instances.getLastXpath() + " não retornou nenhum elemento"));
        }
    }

    public boolean exists(){
        boolean exist = false;
        if (Instances.getLastElements().size()>0){
            exist = true;
        }
        return exist;
    }

    public int count(){
        return Instances.getLastElements().size();
    }

    public boolean isAvailable(){
        return Instances.getIsAvailable();
    }


    public SendsWeb send() {
        throwExceptionNoElement();
        return Instances.getSendsClass();
    }

    public void clear() {
        throwExceptionNoElement();
        if (!Instances.getEach()) {
            //Instances.getLastElements().get(0).clear();
            Instances.getLocatorClass().execute(()->{
                Instances.getLastElements().get(0).clear();});
            Instances.getScreenshotClass().printSelenium();
            Instances.getReportClass().stepPass(Instances.getMessageClear() + Instances.getLastXpathLog());
        } else {
            for (WebElement element : Instances.getLastElements()) {
                //element.clear();
                Instances.getLocatorClass().execute(element::clear);
                Instances.getScreenshotClass().printSelenium();
                Instances.getReportClass().stepPass(Instances.getMessageClearEach() + Instances.getLastXpathLog());
            }
            Instances.setEach(false);
        }
    }

    public void move() {
        throwExceptionNoElement();
        if (!Instances.getEach()) {
            //org.openqa.selenium.interactions.Actions action = new org.openqa.selenium.interactions.Actions(Instances.getWebDriver());
            //action.moveToElement(Instances.getLastElements().get(0)).perform();
            Instances.getLocatorClass().execute(()->{
                org.openqa.selenium.interactions.Actions action = new org.openqa.selenium.interactions.Actions(Instances.getWebDriver());
                action.moveToElement(Instances.getLastElements().get(0)).perform();});
            Instances.getScreenshotClass().printSelenium();
            Instances.getReportClass().stepPass(Instances.getMessageMove() + Instances.getLastXpathLog());
        } else {
            for (WebElement element : Instances.getLastElements()) {
                //org.openqa.selenium.interactions.Actions action = new org.openqa.selenium.interactions.Actions(Instances.getWebDriver());
                //action.moveToElement(element).perform();
                Instances.getLocatorClass().execute(()->{
                    org.openqa.selenium.interactions.Actions action = new org.openqa.selenium.interactions.Actions(Instances.getWebDriver());
                    action.moveToElement(element).perform();});
                Instances.getScreenshotClass().printSelenium();
                Instances.getReportClass().stepPass(Instances.getMessageMoveEach() + Instances.getLastXpathLog());
            }
            Instances.setEach(false);
        }
    }

    //waitDisapear

    public ComboBox comboBox() {
        throwExceptionNoElement();
        return Instances.getComboBoxClass();
    }

    public ActionsWeb each() {
        Instances.setEach(true);
        return this;
    }

    public GetterActionsWeb get() {
        throwExceptionNoElement();
        return Instances.getFindGetterClass();
    }

}
