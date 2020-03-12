package support.web.driver;

import intern.Instances;

public class GetterConfig {
    public String browser(){
        return Instances.getWebdriverType();
    }

    public int[] resolution(){
        return Instances.getResolution();
    }
}
