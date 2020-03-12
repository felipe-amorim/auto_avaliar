package support.web.sleep;

import intern.Instances;

public class SleepWeb {
    public void until(int milis){
        try {
            Thread.sleep(milis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void setMaxTime(int max){
        Instances.setDefaultWaitMilis(max);
    }

    public void setDefaultTime(){
        Instances.setDefaultWaitMilisBackUp();
    }

    public void untilDisapear(String xpath){
        long localWait = Instances.getDefaultWaitMilis();
        Instances.setDefaultWaitMilis(0);
        while (true){
            Instances.setLastXpath(xpath);
            if(Instances.getLastElements().size()<=0){
                break;
            }
            until(100);
            localWait = localWait-100;
            if(localWait<=0){
                Instances.getReportClass().stepFail(new NullPointerException(Instances.getMessageWaitDisapearStillHasElement()));
                break;
            }
        }
        Instances.setDefaultWaitMilisBackUp();
        Instances.getScreenshotClass().printSelenium();
        Instances.getReportClass().stepPass(Instances.getMessageWaitDisapear() + Instances.getLastXpathLog());
    }

    public void untilAppear(String xpath){
        long localWait = Instances.getDefaultWaitMilis();
        System.out.println("localwait: "+Instances.getDefaultWaitMilis());
        Instances.setDefaultWaitMilis(0);
        while (true){
            Instances.setLastXpath(xpath);
            if(Instances.getLastElements().size()>0){
                break;
            }
            until(100);
            localWait = localWait-100;
            if(localWait<=0){
                Instances.getReportClass().stepFail(new NullPointerException(Instances.getMessageWaitAppearStillHasElement()));
                break;
            }
        }
        Instances.setDefaultWaitMilisBackUp();
        System.out.println("localwaitup: "+Instances.getDefaultWaitMilis());
        Instances.getScreenshotClass().printSelenium();
        Instances.getReportClass().stepPass(Instances.getMessageWaitAppear() + Instances.getLastXpathLog());
    }

    public void untilThreadsFinish(){
        //todo final matrix of new threads into instances
    }
}
