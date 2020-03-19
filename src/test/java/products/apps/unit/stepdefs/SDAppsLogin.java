package products.apps.unit.stepdefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.runtime.Env;
import products.apps.unit.objects.Environment;
import support.CoreWeb;

import static products.apps.unit.objects.AppsLogin.*;
import static products.apps.unit.objects.AppsMain.*;


public class SDAppsLogin extends CoreWeb {
    @Given("O usuario acessa {string}")
    public void oUsuarioAcessa(String arg0) {
        //driver().set().browser().chrome().headless();
        driver().navigate(arg0);
    }

    @And("O usuario preenche o campo e-mail com {string}")
    public void oUsuarioPreencheOCampoEMailCom(String arg0) {
        log().setLocator(appsLogin);
        if(find(appsCloseModalButton).exists()){
            find(appsCloseModalButton).click();
        }
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

    @Given("O usuario está logado no sistema pela url {string} como usuario {string} e senha {string}")
    public void oUsuarioEstáLogadoNoSistemaPelaUrlComoUsuarioESenha(String arg0, String arg1, String arg2) {
        oUsuarioAcessa(arg0);
        oUsuarioPreencheOCampoEMailCom(arg1);
        oUsuarioPreencheOCampoPasswordCom(arg2);
        oUsuarioClicaNoBotaoLogIn();
    }

    @Given("O usuario acessa a url do portal apps usbi")
    public void oUsuarioAcessaAUrlDoPortalAppsUsbi() {
        //driver().set().browser().chrome().headless();
        driver().navigate(Environment.url);
    }


    @And("O usuario preenche o campo password a senha padrao")
    public void oUsuarioPreencheOCampoPasswordASenhaPadrao() {
        find(appsPasswordInput).send().text(Environment.defaultPassword);
    }

    @And("O usuario preenche o campo e-mail como {string} do grupo {string}")
    public void oUsuarioPreencheOCampoEMailComoDoGrupo(String arg0, String arg1) {
        String email = "";
        switch (arg1){
            case "abrao":
                email = arg0.equals("avaliador") ? Environment.avaliadorAbraao : arg0.equals("vendedor") ? Environment.vendedorAbraao : Environment.gerenteAbraao;
                break;
        }

        log().setLocator(appsLogin);
        if(find(appsCloseModalButton).exists()){
            find(appsCloseModalButton).click();
        }
        find(appsEmailInput).send().text(email);
    }
}
