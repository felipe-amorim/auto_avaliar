package support.web.find.exceptionals;

import intern.Instances;
import org.openqa.selenium.WebElement;

public class Frames {
    public void navigate(String xpath) {
        Instances.setLastXpath(xpath);
        if (!Instances.getEach()) {
            Instances.getWebDriver().switchTo().frame(Instances.getLastElements().get(0));
            System.out.println("Navegando para o frame " + Instances.getLastXpath()); //TODO colocar no relatorio
        } else {
            for (WebElement element : Instances.getLastElements()) {
                Instances.getWebDriver().switchTo().frame(element);
            }
            Instances.setEach(false);
        }
    }

    public void setDefault(){
        Instances.getWebDriver().switchTo().defaultContent();
    }
}
