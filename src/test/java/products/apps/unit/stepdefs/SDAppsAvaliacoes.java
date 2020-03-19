package products.apps.unit.stepdefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import support.CoreWeb;

import static products.apps.unit.objects.AppsAvaliacoes.*;
import static products.apps.unit.objects.AppsSolicitarAvaliacao.appsSolicitarAvaliacao;
import static products.apps.unit.objects.AppsSolicitarAvaliacao.appsSolicitarAvaliacaoTitle;


public class SDAppsAvaliacoes extends CoreWeb {

    @Then("O usuario valida que a tela Avaliacoes carregou com sucesso")
    public void oUsuarioValidaQueATelaAvaliacoesCarregouComSucesso() {
        log().setLocator(appsAvaliacoes);
        find(appsAvaliacoesTitle).exists();
    }

    @And("O usuario valida que o botao solicitar e exibido")
    public void oUsuarioValidaQueOBotaoSolicitarEExibido() {
        find(appsSolicitarButton).exists();
    }
}
