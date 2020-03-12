package support.web.driver;

import intern.Instances;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Driver {
    public SetterConfig set(){
        return Instances.getSetterConfigClass();
    }

    public GetterConfig get(){
        return Instances.getGetterConfigClass();
    }

    public void navigate(String url){
        //if(!Instances.getTestsKilled()) {
            Instances.getWebDriver().get(url);
            Capabilities cap = ((RemoteWebDriver) Instances.getWebDriver()).getCapabilities();
            System.out.println("Versao do navegador: "+cap.getVersion());
            Instances.getScreenshotClass().printSelenium();
            Instances.getReportClass().stepPass(Instances.getMessageNavigate() + url);
        /*}else {
            throw new NullPointerException(Instances.getMessageStepSkipped());
        }*/
    }
}
