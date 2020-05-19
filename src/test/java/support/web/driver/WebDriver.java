package support.web.driver;

import intern.Instances;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.*;

public class WebDriver {
    public SetterConfig set() {
        return Instances.getSetterConfigClassInstance();
    }

    public GetterConfig get() {
        return Instances.getGetterConfigClassInstance();
    }

    public void navigate(String url) {
        Instances.getWebDriver().navigate().to(url);
        Capabilities cap = ((RemoteWebDriver) Instances.getWebDriver()).getCapabilities();
        System.out.println("Versao do navegador: " + cap.getVersion());
        //Instances.getScreenshotClassInstance().print();
        Instances.getReportClassInstance().stepPass(Instances.getMessageNavigate() + url);
    }

    public void nextTab() {

        int lastNumberOfWindows = Instances.getLastWindows().size();

        Instances.setLastWindows(Instances.getWebDriver().getWindowHandles());
        Instances.setLastIeratos(Instances.getLastWindows().iterator());

        int actualNumberOfWindows = Instances.getLastWindows().size();

        if(actualNumberOfWindows>lastNumberOfWindows) {
            int countOfWindows = 0;
            Iterator<String> actualIterator = Instances.getLastIeratos();
            while (actualIterator.hasNext()) {
                countOfWindows++;
                if(countOfWindows==actualNumberOfWindows) {
                    Instances.getWebDriver().switchTo().window(actualIterator.next());
                }
            }
        }
    }

    public void previousTab() {
        System.out.println("TO BE IMPLEMENTED...........");
    }

    public void refresh(){
        Instances.getWebDriver().navigate().refresh();
    }
}
