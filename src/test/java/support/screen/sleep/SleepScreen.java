package support.screen.sleep;

import intern.Instances;

public class SleepScreen {
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

    public void untilDisapear(String locator){

    }

    public void untilAppear(String locator){

    }

    public void untilThreadsFinish(){
        //todo final matrix of new threads into instances
    }
}
