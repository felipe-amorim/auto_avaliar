package support.web.find.combobox;

import intern.Instances;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class GetterComboBox {
    public int size(){
        //Select combobox = new Select(Instances.getLastElements().get(0));
        //List<WebElement> elementos = combobox.getOptions();
        final int[] size = {0};
        if (!Instances.getEach()) {
            Instances.getLocatorClass().execute(()->{
                Select combobox = new Select(Instances.getLastElements().get(0));
                List<WebElement> elementos = combobox.getOptions();
                size[0] = elementos.size();});
            Instances.getScreenshotClass().printSelenium();
            Instances.getReportClass().stepPass(Instances.getMessageComboBoxGetSize() + Instances.getLastXpath());
        } else {
            for (WebElement element : Instances.getLastElements()) {
                Instances.getLocatorClass().execute(()->{
                    Select combobox = new Select(element);
                    List<WebElement> elementos = combobox.getOptions();
                    size[0] += elementos.size();});
                Instances.getScreenshotClass().printSelenium();
                Instances.getReportClass().stepPass(Instances.getMessageComboBoxGetSize() + Instances.getLastXpath());
            }
            Instances.setEach(false);
        }
        return size[0];
    }
}
