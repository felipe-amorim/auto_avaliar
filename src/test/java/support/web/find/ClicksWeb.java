package support.web.find;

import intern.Instances;
import org.openqa.selenium.WebElement;

public class ClicksWeb {
    public void twice(){
        if (!Instances.getEach()) {
            org.openqa.selenium.interactions.Actions actions = new org.openqa.selenium.interactions.Actions(Instances.getWebDriver());
            actions.doubleClick(Instances.getLastElements().get(0)).perform();
            Instances.getScreenshotClass().printSelenium();
            Instances.getReportClass().stepPass(Instances.getMessageDoubleClick() + Instances.getLastXpath());
        } else {
            for (WebElement element : Instances.getLastElements()) {
                org.openqa.selenium.interactions.Actions actions = new org.openqa.selenium.interactions.Actions(Instances.getWebDriver());
                actions.doubleClick(element).perform();
                Instances.getScreenshotClass().printSelenium();
                Instances.getReportClass().stepPass(Instances.getMessageDoubleClickEach() + Instances.getLastXpath());
            }
            Instances.setEach(false);
        }
    }
}
