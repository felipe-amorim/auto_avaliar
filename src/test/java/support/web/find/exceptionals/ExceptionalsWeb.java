package support.web.find.exceptionals;

import intern.Instances;


public class ExceptionalsWeb {
    public PopUps popUp(){
        return Instances.getPopUpsClassInstance();
    }

    public FramesWeb frame(){
        return Instances.getFramesWebClassInstance();
    }
}
