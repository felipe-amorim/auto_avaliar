package produtos.aplicativo_android.integrado.stepdefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import support.CoreAndroid;

import static produtos.aplicativo_android.integrado.objetos.AplicativoAndroidLogin.*;


public class SDAplicativoAndroidLogin extends CoreAndroid {

    @Given("O usuario abre o aplicativo HANB com o dispositivo {string} e versao do OS {string}")
    public void oUsuarioAbreOAplicativoHANBComODispositivoEVersaoDoOS(String arg0, String arg1) {
        androidDriver().capabilities().set()
                .appActivity("br.com.autoavaliar.presentation.splash.view.SplashActivity")
                .appPackage("com.autoaction.app")
                .deviceName(arg0)
                .platformName("android")
                .platformVersion(arg1)
                .skipUnlock("true")
                .udid("emulator-5554").load();
    }

    @When("O usuario acessa o menu brasil")
    public void oUsuarioAcessaOMenuBrasil() {
        log().setLocator(aplicativoAndroidLogin);
        find(aplicativoAndroidLoginBrasilButton).click();
    }

    @And("O usuario preenche o campo email como timeqa")
    public void oUsuarioPreencheOCampoEmailComoTimeqa() {
        log().setLocator(aplicativoAndroidLogin);
        find(aplicativoAndroidLoginEmailInput).send().text(aplicativoAndroidEmailPadrao);
    }

    @And("O usuario preenche o campo senha com a senha padrao")
    public void oUsuarioPreencheOCampoSenhaComASenhaPadrao() {
        log().setLocator(aplicativoAndroidLogin);
        find(aplicativoAndroidLoginSenhaInput).send().text(aplicativoAndroidSenhaPadrao);
    }

    @And("O usuario clica em entrar")
    public void oUsuarioClicaEmEntrar() {
        log().setLocator(aplicativoAndroidLogin);
        find(aplicativoAndroidLoginEntrar).click();
    }

}
