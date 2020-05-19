package support.screen.find;

import intern.Instances;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.NoSuchElementException;

public class ActionsScreen {

    private void throwExceptionNoElement() {
        //if (Instances.getAndroidLastElements().size() <= 0) {
        //    Instances.getReportClassInstance().stepError(new NoSuchElementException("O caminho da imagem " + Instances.getScreenLastXpath() + " não retornou nenhum arquivo"));
        //}
    }

    public void click() {
        //throwExceptionNoElement();
        Instances.getExecuteClassInstance().execute(() -> {
            Instances.getAndroidLastElements().get(0).click();
        });
        Instances.getScreenshotClassInstance().print();
        Instances.getReportClassInstance().stepPass(Instances.getMessageClick() + Instances.getAndroidLastXpathLog());

    }
}
