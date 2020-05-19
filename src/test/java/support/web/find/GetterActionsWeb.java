package support.web.find;

import intern.Instances;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class GetterActionsWeb {
    public GetterActionsWeb each(){
        Instances.setEach(true);
        return this;
    }

    public Object text(){
        if(!Instances.getEach()) {
            return Instances.getWebLastElements().get(0).getText();
        }else {
            List<String> ret = new ArrayList<>();
            for (WebElement element: Instances.getWebLastElements()) {
                ret.add(element.getText());
            }
            Instances.setEach(false);
            return ret;
        }
    }

    public Object value(){
        if(!Instances.getEach()) {
            return Instances.getWebLastElements().get(0).getAttribute("value");
        }else {
            List<String> ret = new ArrayList<>();
            for (WebElement element: Instances.getWebLastElements()) {
                ret.add(element.getAttribute("value"));
            }
            Instances.setEach(false);
            return ret;
        }
    }

    public Object attribute(String attribute){
        if(!Instances.getEach()) {
            return Instances.getWebLastElements().get(0).getAttribute(attribute);
        }else {
            List<String> ret = new ArrayList<>();
            for (WebElement element: Instances.getWebLastElements()) {
                ret.add(element.getAttribute(attribute));
            }
            Instances.setEach(false);
            return ret;
        }
    }


}
