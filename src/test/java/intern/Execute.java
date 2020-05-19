package intern;

import org.openqa.selenium.WebDriverException;

public class Execute {

    public void execute(Runnable runnable){
        execute(runnable, false);
    }

    public void execute(Runnable runnable, boolean isAvailable){
        boolean executed = false;
        Throwable lastException = null;
        try {
            runnable.run();
            executed = true;
            Instances.setIsAvailable(true);
        }catch (WebDriverException e){
            lastException = e;
            int localTime = Instances.getDefaultWaitMilis();
            while (true) {
                try {
                    runnable.run();
                    Instances.setIsAvailable(true);
                    executed = true;
                    break;
                }catch (WebDriverException ee){
                    lastException = ee;
                    localTime = localTime - 100;
                    Instances.getSleepWebClassInstance().until(100);
                    System.out.println("Tempo decorrido na localização: "+localTime);
                    if(localTime<=0){
                        break;
                    }
                }
            }
        }
        if(!executed){
            if(!isAvailable) {
                Instances.getReportClassInstance().stepFail(lastException);
            }else {
                Instances.setIsAvailable(false);
            }
        }
    }
}
