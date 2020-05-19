package support.screen.find;

import intern.Instances;
import support.web.find.SendsWeb;

public class SendsScreen {

    Runnable lastRunnable = null; //todo instances....

    public SendsScreen slow(){
        Instances.setSlow(true);
        return this;
    }

    public void text(String text){

    }

    public void enter(){

    }

    /*public RepeaterScreen tab(){
        return ;
    }

    public void esc(){

    }

    public RepeaterScreen backspace(){
        return ;
    }

    public RepeaterScreen delete(){
        return ;
    }

    public RepeaterScreen arrowRight(){
        return ;
    }

    public RepeaterScreen arrowLeft(){
        return ;
    }

    public RepeaterScreen arrowDown(){
        return ;
    }

    public RepeaterScreen arrowUp(){
        return ;
    }

    public RepeaterScreen pageDown(){
        return ;
    }

    public RepeaterScreen pageUp(){
        return ;
    }
*/
    public void end(){

    }

    public void home(){

    }

    public void keys(int keys){

    }

    public void keys(int firstKey, int secondKey){

    }
}
