package support.android.adriver;

import intern.Instances;
import io.appium.java_client.android.AndroidKeyCode;

public class AndroidDriver {
    public Capabilities capabilities(){
        return Instances.getCapabilitiesClassInstance();
    }

    public void back(){
        Instances.getAndroidDriver().navigate().back();
    }
}
