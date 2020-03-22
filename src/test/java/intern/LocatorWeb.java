package intern;

import org.openqa.selenium.*;

import java.util.List;

public class LocatorWeb {
    void locate() {
        List<WebElement> elements = null;
        try {
            int localTime = Instances.getDefaultWaitMilis();
            System.out.println("Tempo inicial de localização: "+Instances.getDefaultWaitMilis());
            while (true) {
                elements = Instances.getWebDriver().findElements(By.xpath(Instances.getLastXpath()));
                if(elements.size()>0){
                    break;
                }
                localTime = localTime - 100;
                Instances.getWaitClass().until(100);
                System.out.println("Tempo decorrido na localização: "+localTime);
                if(localTime<=0){
                    break;
                }
            }
            int count = elements.size();
            if (count > 1) {
                System.out.println("The xpath '" + Instances.getLastXpath() + "' returned " + count + " elements");
            } else if (count == 1) {
                System.out.println("The xpath '" + Instances.getLastXpath() + "' returned one element");
            } else {
                System.out.println("The xpath '" + Instances.getLastXpath() + "' returned no elements");
            }
        } catch (InvalidSelectorException e) {
            System.out.println("The xpath '" + Instances.getLastXpath() + "' is not valid");
        }catch (WebDriverException e){
            if(e.getMessage().contains("ocalhost/0:0:0:0:0:")){
                Instances.getReportClass().stepFatal(e);
            }
        }
        Instances.setLastElements(elements);
    }

    public void execute(Runnable runnable){
        boolean executed = false;
        Throwable lastException = null;
        try {
            runnable.run();
            executed = true;
        }catch (WebDriverException e){
            lastException = e;
            int localTime = Instances.getDefaultWaitMilis();
            while (true) {
                try {
                    runnable.run();
                    executed = true;
                    break;
                }catch (WebDriverException ee){
                    lastException = ee;
                    localTime = localTime - 100;
                    Instances.getWaitClass().until(100);
                    System.out.println("Tempo decorrido na localização: "+localTime);
                    if(localTime<=0){
                        break;
                    }
                }
            }
        }
        if(!executed){
            Instances.getReportClass().stepFail(lastException);
        }
    }
}
