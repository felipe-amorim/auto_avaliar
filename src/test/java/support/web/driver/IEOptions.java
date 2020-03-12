package support.web.driver;

import intern.Instances;

public class IEOptions {
    public IEOptions compability(){
        Instances.setCompability(true);
        return this;
    }

    public IEOptions cleanSection(){
        Instances.setCleanSection(true);
        return this;
    }
}
