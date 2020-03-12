package support.web.find;

import intern.Instances;
import org.openqa.selenium.JavascriptExecutor;

public class Scroll {
    public void up(int amount){
        JavascriptExecutor js = (JavascriptExecutor) Instances.getWebDriver();
        js.executeScript("window.scrollBy(0,-"+amount+")");
    }

    public void down(int amount){
        JavascriptExecutor js = (JavascriptExecutor) Instances.getWebDriver();
        js.executeScript("window.scrollBy(0,"+amount+")");
    }
}
