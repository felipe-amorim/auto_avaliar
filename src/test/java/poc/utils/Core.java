package poc.utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;

public class Core {

    private Date date = new Date();

    private AppiumDriver<MobileElement> navegador;

    protected void instantiateAppium() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "Nexus 6P R Java");
        capabilities.setCapability("udid", "emulator-5556");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "R");
        capabilities.setCapability("skipUnlock","true");
        capabilities.setCapability("appPackage", "com.autoaction.app");
        capabilities.setCapability("appActivity","br.com.autoavaliar.presentation.splash.view.SplashActivity");
        navegador = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub") , capabilities);
        navegador.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
    }

    protected void esperar(int tempo){
        try {
            Thread.sleep(tempo);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void scrollTo(String direction, int times) throws InterruptedException {
        Thread.sleep(1000);
        if (direction.equals("down")) {
            Dimension dim = navegador.manage().window().getSize();
            int width = dim.getWidth() / 2;
            for (int i = 0; i < times; i++) {
                int startY = (int) (dim.getHeight() * 0.7);
                int endY = (int) (dim.getHeight() * 0.5);
                new TouchAction(navegador).press(point(width, startY)).waitAction(waitOptions(Duration.ofSeconds(1)))
                        .moveTo(point(width, endY)).release().perform();

            }

        }
    }

    protected void acceptAlert(){
        navegador.switchTo().alert().accept();
    }

    private String nomeTeste = ";";

    protected void definindoNome(String nome)
    {
        nomeTeste = nome;
    }

    protected void send(String id, String text)
    {
        esperar(500);
        MobileElement e = null;
        if (id.startsWith("/"))
        {
            e = navegador.findElement(By.xpath(id));
        }
        else
            e = navegador.findElement(By.id(id));


        e.sendKeys(text);
        print();
    }

    protected void sendKey(AndroidKey key)
    {
        ((AndroidDriver) navegador).pressKey(new KeyEvent(key));
    }

    protected void click(String id)
    {
        esperar(500);
        MobileElement e = null;
        if (id.startsWith("/"))
        {
            e = navegador.findElement(By.xpath(id));
        }
        else
            e = navegador.findElement(By.id(id));

        e.click();
        print();

    }

    protected void killAppium()
    {
        navegador.quit();
    }

    protected void print() {
        int arquivo = 1;
        date.setDate(date.getDate());
        SimpleDateFormat df = new SimpleDateFormat("yyyy_MM_dd-HH_mm_ss");
        String formattedDate = df.format(date);
        File screenshot = ((TakesScreenshot) navegador).getScreenshotAs(OutputType.FILE);
        String[] datesplit = formattedDate.split("-");
        String[] horas = datesplit[1].split("_");
        String path = "\\src\\test\\resources\\evidencias\\" + datesplit[0] + "\\" + horas[0] + "h" + horas[1] + "m" + horas[2] + "s" + "\\";
        try {
            File f = new File(System.getProperty("user.dir") + path + nomeTeste + "_screenshot_" + arquivo + ".png");
            while (f.exists()) {
                arquivo++;
                f = new File(System.getProperty("user.dir") + path + nomeTeste + "_screenshot_" + arquivo + ".png");
                if (!f.exists()) {
                    break;
                }
            }
            FileUtils.copyFile(screenshot, new File(System.getProperty("user.dir") + path + nomeTeste + "_screenshot_" + arquivo + ".png"));
        } catch (Exception e) {
            System.out.println("Houveram problemas ao copiar o arquivo para a pasta: *" + e.getMessage());
        }
    }
    
}
