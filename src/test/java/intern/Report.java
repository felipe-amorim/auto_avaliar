package intern;

import com.lowagie.text.html.Markup;

import java.util.NoSuchElementException;

public class Report {
    public void stepPass(String step){
        Instances.getScreenshotClass().printSelenium();
        Instances.getScenarioSection().pass(step+" <a data-featherlight='image' style='float: right;padding: 0px;' href='"+Instances.getScreenShotLocation()+"'><i class='material-icons'>panorama</i></a>");
        System.out.println("Ação: "+step);
        System.out.println("Tempo decorrido: "+Instances.getExecutionActionTimer()+" ms");
        System.out.println("---------------------------------------------------------------------------------------");
        Instances.flushreport();
        Instances.setScreenShotLocation("");
    }

    public void stepFail(Throwable fail){
        Instances.getScreenshotClass().printSelenium();
        Instances.getScenarioSection().fail("[FALHA] Ocorreu uma falha <a data-featherlight='image' style='float: right;padding: 0px;' href='"+Instances.getScreenShotLocation()+"'><i class='material-icons'>panorama</i></a>");
        Instances.getScenarioSection().fail(fail);
        Instances.flushreport();
        Instances.setScreenShotLocation("");
        Instances.setTestsKilled(true);
        throw new NullPointerException(fail.getMessage());
    }

    public void stepWarning(String step){
        Instances.getScreenshotClass().printSelenium();
        Instances.getScenarioSection().warning("[WARNING] "+step+" <a data-featherlight='image' style='float: right;padding: 0px;' href='"+Instances.getScreenShotLocation()+"'><i class='material-icons'>panorama</i></a>");
        Instances.flushreport();
        System.out.println("Ação: "+step);
        System.out.println("Tempo decorrido: "+Instances.getExecutionActionTimer()+" ms");
        System.out.println("---------------------------------------------------------------------------------------");
        Instances.setScreenShotLocation("");
    }

    public void stepFatal(Throwable fatal){
        Instances.getScenarioSection().fatal("[AMBIENTE] Ocorreu um erro de ambiente <a data-featherlight='image' style='float: right;padding: 0px;' href='"+Instances.getScreenShotLocation()+"'><i class='material-icons'>panorama</i></a>");
        Instances.getScenarioSection().fatal(fatal);
        Instances.flushreport();
        Instances.setScreenShotLocation("");
        Instances.setTestsKilled(true);
        throw new NullPointerException(fatal.getMessage());
    }

    public void stepError(Throwable error){
        Instances.getScenarioSection().error("[ERRO] ocorreu um erro de compilação");
        Instances.getScenarioSection().error(error);
        Instances.flushreport();
        Instances.setScreenShotLocation("");
        Instances.setTestsKilled(true);
    }
}
