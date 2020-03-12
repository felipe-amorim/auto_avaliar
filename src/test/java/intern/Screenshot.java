package intern;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

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

    public void printSelenium() {
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
            System.out.println("Carregamento da pagina: "+((JavascriptExecutor) Instances.getWebDriver()).executeScript("return document.readyState"));
            FileUtils.moveFile(((TakesScreenshot) Instances.getWebDriver()).getScreenshotAs(OutputType.FILE), screenshot);
            Instances.setScreenShotLocation("../evidencias/" + featureName + "/" + scenarioName + "/" + stepName + "_" + filesCount + ".png");
            System.out.println("Screenshot count: " + stepName + "_" + filesCount + ".png");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
