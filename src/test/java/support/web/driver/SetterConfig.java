package support.web.driver;

import intern.Instances;

public class SetterConfig {
    public BrowserTypes browser(){
        return Instances.getBrowserTypesClass();
    }

    public DriverOptions options(){
        return Instances.getDriverOptionsClass();
    }
}
