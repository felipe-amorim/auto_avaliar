package support.web.find.exceptionals;

import intern.Instances;


public class Exceptionals {
    public PopUps popUp(){
        return Instances.getPopUpsClass();
    }

    public Frames frame(){
        return Instances.getFramesClass();
    }
}
