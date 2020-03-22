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
    }

    @Then("O usuario valida que nao foram habilitados os campos de editar dados do veiculo")
    public void oUsuarioValidaQueNaoForamHabilitadosOsCamposDeEditarDadosDoVeiculo() {
        log().setLocator(appsAvaliacoes);
        if (!find(appsAvaliacoesTextValidarDisponibilidadeEditarValoresVeiculos).exists()){
            System.out.println("entrou no if");
        } else {
            error().Fail();
            System.out.println("Sucesso, o usuario realmente nao tem acesso a esta funcionalidade");
        }

        //if (!find(appsAvaliacoesTextValidarDisponibilidadeEditarValoresVeiculos).exists()){
        //    System.out.println("entrou no if de validacao");
        //    System.out.println("O botao "+appsAvaliacoesTextValidarDisponibilidadeEditarValoresVeiculos+" não habilitou o menu de edição");
        //} else {
        //    System.out.println("entrou no else de validacao");
        //    error().Fail();
        //}
    }
}
