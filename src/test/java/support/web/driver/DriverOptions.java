package support.web.driver;

import intern.Instances;

public class DriverOptions {
    public void maximized(){
        Instances.setMaximized(true);
    }

    public void resolution(int width, int height){
        Instances.setResolution(width, height);
    }
}
