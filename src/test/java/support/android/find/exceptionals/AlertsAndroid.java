package support.android.find.exceptionals;

import intern.Instances;

public class AlertsAndroid {
    public void accept(){
        Instances.getAndroidDriver().switchTo().alert().accept();
    }

    public void deny(){
        Instances.getAndroidDriver().switchTo().alert().dismiss();
    }
}
