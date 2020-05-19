package support.web.find;

import intern.Instances;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import support.web.find.combobox.ComboBox;

public class ActionsWeb {
    public ClicksWeb click() {
        throwExceptionNoElement();
        if (!Instances.getEach()) {
            //Instances.getWebLastElements().get(0).click();
            Instances.getExecuteClassInstance().execute(()->{
                Instances.getWebLastElements().get(0).click();});
            Instances.getScreenshotClassInstance().print();
            Instances.getReportClassInstance().stepPass(Instances.getMessageClick() + Instances.getWebLastXpathLog());
        } else {
            for (WebElement element : Instances.getWebLastElements()) {
                //element.click();
                Instances.getExecuteClassInstance().execute(element::click);
                Instances.getScreenshotClassInstance().print();
                Instances.getReportClassInstance().stepPass(Instances.getMessageClickEach() + Instances.getWebLastXpathLog());
            }
            Instances.setEach(false);
        }
        return Instances.getClicksClassInstance();
    }

    private void throwExceptionNoElement(){
        if (Instances.getWebLastElements().size()<=0) {
            Instances.getReportClassInstance().stepError(new NoSuchElementException("O xpath " + Instances.getWebLastXpath() + " não retornou nenhum elemento"));
        }
    }

    public boolean exists(){
        boolean exist = false;
        if (Instances.getWebLastElements().size()>0){
            exist = true;
        }
        Instances.getScreenshotClassInstance().print();
        Instances.getReportClassInstance().stepPass(Instances.getMessageExists() + Instances.getWebLastXpathLog());
        return exist;
    }

    public int count(){
        return Instances.getWebLastElements().size();
    }

    public boolean isAvailable(){
        if (!Instances.getEach()) {
            Instances.getExecuteClassInstance().execute(()->{
                Instances.getWebLastElements().get(0).clear();}, true);
        } else {
            for (WebElement element : Instances.getWebLastElements()) {
                Instances.getExecuteClassInstance().execute(element::clear, true);
            }
            Instances.setEach(false);
        }
        return Instances.getIsAvailable();
    }


    public SendsWeb send() {
        throwExceptionNoElement();
        return Instances.getSendsClassInstance();
    }

    public void clear() {
        throwExceptionNoElement();
        if (!Instances.getEach()) {
            //Instances.getWebLastElements().get(0).clear();
            Instances.getExecuteClassInstance().execute(()->{
                Instances.getWebLastElements().get(0).clear();});
            Instances.getScreenshotClassInstance().print();
            Instances.getReportClassInstance().stepPass(Instances.getMessageClear() + Instances.getWebLastXpathLog());
        } else {
            for (WebElement element : Instances.getWebLastElements()) {
                //element.clear();
                Instances.getExecuteClassInstance().execute(element::clear);
                Instances.getScreenshotClassInstance().print();
                Instances.getReportClassInstance().stepPass(Instances.getMessageClearEach() + Instances.getWebLastXpathLog());
            }
            Instances.setEach(false);
        }
    }

    public void move() {
        throwExceptionNoElement();
        if (!Instances.getEach()) {
            //org.openqa.selenium.interactions.Actions action = new org.openqa.selenium.interactions.Actions(Instances.getWebDriver());
            //action.moveToElement(Instances.getWebLastElements().get(0)).perform();
            Instances.getExecuteClassInstance().execute(()->{
                org.openqa.selenium.interactions.Actions action = new org.openqa.selenium.interactions.Actions(Instances.getWebDriver());
                action.moveToElement(Instances.getWebLastElements().get(0)).perform();});
            Instances.getScreenshotClassInstance().print();
            Instances.getReportClassInstance().stepPass(Instances.getMessageMove() + Instances.getWebLastXpathLog());
        } else {
            for (WebElement element : Instances.getWebLastElements()) {
                //org.openqa.selenium.interactions.Actions action = new org.openqa.selenium.interactions.Actions(Instances.getWebDriver());
                //action.moveToElement(element).perform();
                Instances.getExecuteClassInstance().execute(()->{
                    org.openqa.selenium.interactions.Actions action = new org.openqa.selenium.interactions.Actions(Instances.getWebDriver());
                    action.moveToElement(element).perform();});
                Instances.getScreenshotClassInstance().print();
                Instances.getReportClassInstance().stepPass(Instances.getMessageMoveEach() + Instances.getWebLastXpathLog());
            }
            Instances.setEach(false);
        }
    }

    //waitDisapear

    public ComboBox comboBox() {
        throwExceptionNoElement();
        return Instances.getComboBoxClassInstance();
    }

    public ActionsWeb each() {
        Instances.setEach(true);
        return this;
    }

    public GetterActionsWeb get() {
        throwExceptionNoElement();
        return Instances.getFindGetterClassInstance();
    }

}
