package support.web.find.combobox;

import intern.Instances;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SetterComboBox {
    public void byText(String text){
        if (!Instances.getEach()) {
            //Select combobox = new Select(Instances.getLastElements().get(0));
            //combobox.selectByVisibleText(text);
            Instances.getLocatorClass().execute(()->{
                Select combobox = new Select(Instances.getLastElements().get(0));
                combobox.selectByVisibleText(text);});
            Instances.getScreenshotClass().printSelenium();
            Instances.getReportClass().stepPass(Instances.getMessageComboBoxText().replace("arg0", text) + Instances.getLastXpathLog());
        } else {
            for (WebElement element : Instances.getLastElements()) {
                //Select combobox = new Select(element);
                //combobox.selectByVisibleText(text);
                Instances.getLocatorClass().execute(()->{
                    Select combobox = new Select(element);
                    combobox.selectByVisibleText(text);});
                Instances.getScreenshotClass().printSelenium();
                Instances.getReportClass().stepPass(Instances.getMessageComboBoxTextEach().replace("arg0", text) + Instances.getLastXpathLog());
            }
            Instances.setEach(false);
        }
    }

    public void byValue(String value){
        if (!Instances.getEach()) {
            //Select combobox = new Select(Instances.getLastElements().get(0));
            //combobox.selectByValue(value);
            Instances.getLocatorClass().execute(()->{
                Select combobox = new Select(Instances.getLastElements().get(0));
                combobox.selectByValue(value);});
            Instances.getScreenshotClass().printSelenium();
            Instances.getReportClass().stepPass(Instances.getMessageComboBoxValue().replace("arg0", value) + Instances.getLastXpathLog());
        } else {
            for (WebElement element : Instances.getLastElements()) {
                //Select combobox = new Select(element);
                //combobox.selectByValue(value);
                Instances.getLocatorClass().execute(()->{
                    Select combobox = new Select(element);
                    combobox.selectByValue(value);});
                Instances.getScreenshotClass().printSelenium();
                Instances.getReportClass().stepPass(Instances.getMessageComboBoxValueEach().replace("arg0", value) + Instances.getLastXpathLog());
            }
            Instances.setEach(false);
        }
    }

    public void byIndex(int index){
        if (!Instances.getEach()) {
            //Select combobox = new Select(Instances.getLastElements().get(0));
            //combobox.selectByIndex(index);
            Instances.getLocatorClass().execute(()->{
                Select combobox = new Select(Instances.getLastElements().get(0));
                combobox.selectByIndex(index);});
            Instances.getScreenshotClass().printSelenium();
            Instances.getReportClass().stepPass(Instances.getMessageComboBoxIndex().replace("arg0", String.valueOf(index)) + Instances.getLastXpathLog());
        } else {
            for (WebElement element : Instances.getLastElements()) {
                //Select combobox = new Select(element);
                //combobox.selectByIndex(index);
                Instances.getLocatorClass().execute(()->{
                    Select combobox = new Select(element);
                    combobox.selectByIndex(index);});
                Instances.getScreenshotClass().printSelenium();
                Instances.getReportClass().stepPass(Instances.getMessageComboBoxIndexEach().replace("arg0", String.valueOf(index)) + Instances.getLastXpathLog());

            }
            Instances.setEach(false);
        }
    }
}
