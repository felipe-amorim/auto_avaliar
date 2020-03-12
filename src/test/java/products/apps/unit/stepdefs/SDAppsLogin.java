package products.apps.unit.stepdefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import support.CoreWeb;

import static products.apps.unit.objects.AppsLogin.*;
import static products.apps.unit.objects.AppsMain.*;


public class SDAppsLogin extends CoreWeb {
    @Given("O usuario acessa {string}")
    public void oUsuarioAcessa(String arg0) {
        driver().set().browser().chrome().headless();
        driver().navigate(arg0);
    }

    @And("O usuario preenche o campo e-mail com {string}")
    public void oUsuarioPreencheOCampoEMailCom(String arg0) {
        log().setLocator(appsLogin);
        find(appsEmailInput).send().text(arg0);
    }

    @And("O usuario preenche o campo password com {string}")
    public void oUsuarioPreencheOCampoPasswordCom(String arg0) {
        find(appsPasswordInput).send().text(arg0);
    }

    @When("O usuario clica no botao log in")
    public void oUsuarioClicaNoBotaoLogIn() {
        find(appsLoginButton).click();
    }
}
