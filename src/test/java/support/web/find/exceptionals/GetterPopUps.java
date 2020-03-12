package support.web.find.exceptionals;

import intern.Instances;

public class GetterPopUps {
    public String text(){
        return Instances.getWebDriver().switchTo().alert().getText();
    }
}
