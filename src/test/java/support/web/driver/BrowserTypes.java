package support.web.driver;

import intern.Instances;

public class BrowserTypes {
    public ChromeCapabilities chrome(){
        Instances.setWebdriverType(Instances.chrome);
        return Instances.getChromeCapabilitiesClass();
    }

    public void fireFox(){
        Instances.setWebdriverType(Instances.firefox);
    }

    public IEOptions internetExplorer(){
        Instances.setWebdriverType(Instances.internetExplorer);
        return Instances.getIEOptionsClass();
    }
}
