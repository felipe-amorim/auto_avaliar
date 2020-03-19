package products.apps.unit.stepdefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import support.CoreWeb;

import static products.apps.unit.objects.AppsLogin.*;
import static products.apps.unit.objects.AppsMain.*;


public class SDAppsMain extends CoreWeb {
    @Then("O usuario valida que a tela de dashboard carregou com sucesso")
    public void oUsuarioValidaQueATelaDeDashboardCarregouComSucesso() {
        log().setLocator(appsMain);
        sleep().untilAppear(appsIconUser);
        log().type("Efetuando um clique para assegurar que a página é exibida corretamente");
    }

    @And("O usuario realiza o logoff")
    public void oUsuarioRealizaOLogoff() {
        find(appsIconUser).click();
        find(appsSairButton).click();
        log().setLocator(appsLogin);
        find(appsEmailInput).click();
    }

    @When("O usuario clica no botao solicitar avaliacao")
    public void oUsuarioClicaNoBotaoSolicitarAvaliacao() {
        log().setLocator(appsMain);
        find(appsSolicitarAvaliacaoButton).click();
    }

    @When("O usuario expande as opcoes no menu Avaliacoes")
    public void oUsuarioExpandeAsOpcoesNoMenuAvaliacoes() {
        log().setLocator(appsMain);
        find(appsAvalicoesButton).click();
    }

    @And("O usuario clica no botao Avaliacoes dentro do menu expandido")
    public void oUsuarioClicaNoBotaoAvaliacoesDentroDoMenuExpandido() {
        find(appsAvalicoesExpandidoButton).click();
    }
}
