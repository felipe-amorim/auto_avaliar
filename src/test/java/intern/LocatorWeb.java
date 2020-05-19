package intern;

import org.openqa.selenium.By;
import org.openqa.selenium.InvalidSelectorException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LocatorWeb {
    void locate() {
        List<WebElement> elements = null;
        try {
            int localTime = Instances.getDefaultWaitMilis();
            System.out.println("Tempo inicial de localização: "+ Instances.getDefaultWaitMilis());
            while (true) {
                elements = Instances.getWebDriver().findElements(By.xpath(Instances.getWebLastXpath()));
                if(elements.size()>0){
                    break;
                }
                localTime = localTime - 100;
                Instances.getSleepWebClassInstance().until(100);
                System.out.println("Tempo decorrido na localização: "+localTime);
                if(localTime<=0){
                    break;
                }
            }
            int count = elements.size();
            if (count > 1) {
                System.out.println("The xpath '" + Instances.getWebLastXpath() + "' returned " + count + " elements");
            } else if (count == 1) {
                System.out.println("The xpath '" + Instances.getWebLastXpath() + "' returned one element");
            } else {
                System.out.println("The xpath '" + Instances.getWebLastXpath() + "' returned no elements");
            }
        } catch (InvalidSelectorException e) {
            System.out.println("The xpath '" + Instances.getWebLastXpath() + "' is not valid");
        }catch (WebDriverException e){
            if(e.getMessage().contains("ocalhost/0:0:0:0:0:")){
                Instances.getReportClassInstance().stepFatal(e);
            }
        }
        Instances.setLastWindows(Instances.getWebDriver().getWindowHandles());
        Instances.setLastIeratos(Instances.getLastWindows().iterator());

        Instances.setWebLastElements(elements);
    }
}
