package intern;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

import java.io.File;
import java.io.IOException;

public class Screenshot {
    private String cleanText(String text){
        if (text!=null){
            text = text
                    .replace(".feature", "")
                    .replace("Scenario:", "")
                    .replaceAll(" ","_")
                    .replaceAll("[^a-zA-Z0-9]", "")
                    .trim();
        }else {
            text = "";
        }
        return text;
    }

    public void print() {
        File screenshot = null;
        String scenarioName = cleanText(Instances.getScenario());
        String featureName = cleanText(Instances.getFeature());
        String stepName = cleanText(Instances.getStep());
        String screenshotPath = Instances.getJenkinsEvidencesPath() + featureName + "/" + scenarioName + "/";
        int filesCount = 1;
        File pathEvidenciasReport = new File(screenshotPath);
        pathEvidenciasReport.mkdirs();
        while (true) {
            File f = new File(screenshotPath + stepName + "_" + filesCount + ".png");
            if (!f.exists()) {
                break;
            }
            filesCount++;
        }
        screenshot = new File(screenshotPath + stepName + "_" + filesCount + ".png");
        try {
            if(Instances.getWebDriver()!=null&&!Instances.getWebDriver().toString().contains("null")) {
                System.out.println("Carregamento da pagina: "+((JavascriptExecutor) Instances.getWebDriver()).executeScript("return document.readyState"));
                FileUtils.moveFile(((TakesScreenshot) Instances.getWebDriver()).getScreenshotAs(OutputType.FILE), screenshot);
            }else if(Instances.getAndroidDriver()!=null&&!Instances.getAndroidDriver().toString().contains("null")) {
                FileUtils.moveFile(((TakesScreenshot) Instances.getAndroidDriver()).getScreenshotAs(OutputType.FILE), screenshot);
            }
            Instances.setScreenShotLocation("../evidencias/" + featureName + "/" + scenarioName + "/" + stepName + "_" + filesCount + ".png");
            System.out.println("Screenshot count: " + stepName + "_" + filesCount + ".png");

        } catch (IOException e) {
            e.printStackTrace();
        } catch (WebDriverException e){
            if(e.getMessage().contains("ocalhost/0:0:0:0:0:")){
                Instances.getReportClassInstance().stepFatal(e);
            }
        }
    }

    /*public void printAppium() {
        File screenshot = null;
        String scenarioName = cleanText(Instances.getScenario());
        String featureName = cleanText(Instances.getFeature());
        String stepName = cleanText(Instances.getStep());
        String screenshotPath = Instances.getJenkinsEvidencesPath() + featureName + "/" + scenarioName + "/";
        int filesCount = 1;
        File pathEvidenciasReport = new File(screenshotPath);
        pathEvidenciasReport.mkdirs();
        while (true) {
            File f = new File(screenshotPath + stepName + "_" + filesCount + ".png");
            if (!f.exists()) {
                break;
            }
            filesCount++;
        }
        screenshot = new File(screenshotPath + stepName + "_" + filesCount + ".png");
        try {
            FileUtils.moveFile(((TakesScreenshot) Instances.getAndroidDriver()).getScreenshotAs(OutputType.FILE), screenshot);
            Instances.setScreenShotLocation("../evidencias/" + featureName + "/" + scenarioName + "/" + stepName + "_" + filesCount + ".png");
            System.out.println("Screenshot count: " + stepName + "_" + filesCount + ".png");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (WebDriverException e){
            if(e.getMessage().contains("ocalhost/0:0:0:0:0:")){
                Instances.getReportClassInstance().stepFatal(e);
            }
        }
    }*/
}
