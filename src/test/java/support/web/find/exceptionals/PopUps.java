package support.web.find.exceptionals;

import intern.Instances;

public class PopUps {
    public void accept(){
        Instances.getWebDriver().switchTo().alert().accept();
    }

    public void deny(){
        Instances.getWebDriver().switchTo().alert().dismiss();
    }

    public GetterPopUps get(){
        return Instances.getGetterPopUpsClass();
    }
}
