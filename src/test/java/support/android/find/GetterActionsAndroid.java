package support.android.find;

import intern.Instances;
import io.appium.java_client.MobileElement;
import support.web.find.GetterActionsWeb;

import java.util.ArrayList;
import java.util.List;

public class GetterActionsAndroid {
    public GetterActionsAndroid each(){
        Instances.setEach(true);
        return this;
    }

    public Object text(){
        if(!Instances.getEach()) {
            return Instances.getAndroidLastElements().get(0).getText();
        }else {
            List<String> ret = new ArrayList<>();
            for (MobileElement element: Instances.getAndroidLastElements()) {
                ret.add(element.getText());
            }
            Instances.setEach(false);
            return ret;
        }
    }

    public Object value(){
        if(!Instances.getEach()) {
            return Instances.getAndroidLastElements().get(0).getAttribute("value");
        }else {
            List<String> ret = new ArrayList<>();
            for (MobileElement element: Instances.getAndroidLastElements()) {
                ret.add(element.getAttribute("value"));
            }
            Instances.setEach(false);
            return ret;
        }
    }

    public Object attribute(String attribute){
        if(!Instances.getEach()) {
            return Instances.getAndroidLastElements().get(0).getAttribute(attribute);
        }else {
            List<String> ret = new ArrayList<>();
            for (MobileElement element: Instances.getAndroidLastElements()) {
                ret.add(element.getAttribute(attribute));
            }
            Instances.setEach(false);
            return ret;
        }
    }
}
