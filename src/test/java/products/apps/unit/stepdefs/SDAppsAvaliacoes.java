package products.apps.unit.stepdefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Test;
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

    @And("O usuario insere uma placa para o campo buscar placa avaliacoes cadastradas")
    public void oUsuarioInsereUmaPlacaParaOCampoBuscarPlacaAvaliacoesCadastradas() {
        log().setLocator(appsAvaliacoes);
        sleep().untilAppear(appsAvaliacoesTextValidarCarregouTelaDeBusca);
        find(appsAvaliacoesInputBuscarPlaca).send().text("KZA-0263");
    }

    @And("O usuario clica em buscar para filtrar avaliacoes")
    public void oUsuarioClicaEmBuscarParaFiltrarAvaliacoes() {
        log().setLocator(appsAvaliacoes);
        find(appsAvaliacoesButtonBuscar).click();
    }

    @And("O usuario seleciona o primeiro veiculo da busca de veiculos cadastrados")
    public void oUsuarioSelecionaOPrimeiroVeiculoDaBuscaDeVeiculosCadastrados() {
        log().setLocator(appsAvaliacoes);
        find(appsAvaliacoesButtonPrimeiroVeiculoCadastrado).click();
    }

    @And("O usuario valida que a tela de avaliacao de veiculo carregou")
    public void oUsuarioValidaQueATelaDeAvaliacaoDeVeiculoCarregou() {
        log().setLocator(appsAvaliacoes);
        sleep().untilAppear(appsAvaliacoesTextValidarAvaliacao);
    }


    @And("O usuario clica no botao editar dados do veiculo avaliado")
    public void oUsuarioClicaNoBotaoEditarDadosDoVeiculoAvaliado() {
        log().setLocator(appsAvaliacoes);
        find(appsAvaliacoesButtonEditarDadosDoVeiculoAvaliado).click();
        System.out.println("clicou no botao editar");
    }

    @Then("o usuario valida que o perfil tem acesso ao campo editar dados do veiculo")
    public void oUsuarioValidaQueOPerfilTemAcessoAoCampoEditarDadosDoVeiculo() {
        System.out.println("antes do if ");
        if (find(appsAvaliacoesTextValidarDisponibilidadeEditarValoresVeiculos).exists()){
        } else {
            error().Fail();
        }
    }

    @Then("o usuario valida que o perfil nao tem acesso ao campo editar dados do veiculo")
    public void oUsuarioValidaQueOPerfilNaoTemAcessoAoCampoEditarDadosDoVeiculo() {
        if (find(appsAvaliacoesTextValidarDisponibilidadeEditarValoresVeiculos).isAvailable()){
            System.out.println("entrou no if");
            error().Fail();
        } else {
            System.out.println("entrou no else");
        }
    }

    @Test
    public void teste(){
        driver().navigate("http://www.youtube.com.br");
        sleep().until(5000);
        scroll().down(500);
        sleep().until(5000);
    }
}