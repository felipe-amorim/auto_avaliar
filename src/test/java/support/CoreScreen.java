package support;

import intern.Instances;
import support.convert.Converter;
import support.db.Db;
import support.error.Error;
import support.log.Log;
import support.screen.driver.Screen;
import support.screen.find.ActionsScreen;

public abstract class CoreScreen {

    //region NAVIGATION CLASSES
    //todo inclue actionsFind

    /*public ActionsScreen find(String locator){
        return ;
    }*/

    public Converter convert(){
        return Instances.getConverterClassInstance();
    }

    /*public SleepScreen sleep(){
        return ;
    }*/

    //todo include screen
    public Screen screen(){
        return Instances.getScreenClassInstance();
    }

    public ActionsScreen find(String caminhoDaImagem){
        Instances.setScreenLastXpath(caminhoDaImagem);
        return Instances.getActionsScreenClassInstance();
    }

    /*public SendsScreen send(){
        return ;
    }*/

    /*public RegionScreen region(){

    }

    public AssertScreen assertThat(){

    }*/

    /*public MoveScreen move(){
        return ;
    }*/

    public Log log(){
        return Instances.getLogClassInstance();
    }

    public Error error(){
        return Instances.getErrorClassInstance();
    }

    public Db db(){
        return Instances.getDbClassInstance();
    }
    //endregion

    protected CoreScreen help(){
        return this;
    }
}
