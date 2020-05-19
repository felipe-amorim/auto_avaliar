package support.web.driver;

import intern.Instances;

public class SetterConfig {
    public BrowserTypes browser(){
        return Instances.getBrowserTypesClassInstance();
    }

    public DriverOptions options(){
        return Instances.getDriverOptionsClassInstance();
    }
}
