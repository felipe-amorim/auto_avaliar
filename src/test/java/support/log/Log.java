package support.log;

import intern.Instances;
import java.util.LinkedHashMap;

public class Log {

    public void setLocator(LinkedHashMap<String, String> locator) {
        Instances.setLocator(locator);
    }

    public LinkedHashMap<String, String> getLocator() {
        return Instances.getLocator();
    }

    public void type(String text){
        Instances.getReportClass().stepPass(text);
    }
}
