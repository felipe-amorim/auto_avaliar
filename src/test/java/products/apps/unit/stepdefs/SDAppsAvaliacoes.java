package products.apps.unit.stepdefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import support.CoreWeb;

import static products.apps.unit.objects.AppsAvaliacoes.*;


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
        if (find(appsAvaliacoesEditarAnoVeiculoText).exists()) {
            System.out.println("entrou no if, o usuario tem acesso");
        } else {
            System.out.println("o usuario nao tem acesso");
            error().Fail();
        }
    }

    @Then("o usuario valida que o perfil nao tem acesso ao campo editar dados do veiculo")
    public void oUsuarioValidaQueOPerfilNaoTemAcessoAoCampoEditarDadosDoVeiculo() {
        if (find(appsAvaliacoesEditarAnoVeiculoText).isAvailable()) {
            System.out.println("entrou no if, o elemento esta dispnivel para clique");
            error().Fail();
        } else {
            System.out.println("o elemento nao esta disponivel para clique");
        }
    }

    @Then("O usuario valida que o campo buscar placa esta escrito corretamente")
    public void oUsuarioValidaQueOCampoBuscarPlacaEstaEscritoCorretamente() {
        log().setLocator(appsAvaliacoes);
        assertThat(textBuscarPlaca).isEqualTo(find(appsTextBuscarPlaca).get().text().toString());
    }

    @Then("O usuario valida que o perfil logado nao tem acesso a funcionalidade de editar dados do veiculo")
    public void oUsuarioValidaQueOPerfilLogadoNaoTemAcessoAFuncionalidadeDeEditarDadosDoVeiculo() {
        log().setLocator(appsAvaliacoes);
        if (!find(appsAvaliacoesButtonEditarDadosDoVeiculoAvaliado).exists()) {
            System.out.println("sucesso, usuario realmente nao tem acesso a esta funcionalidade");
        } else {
            System.out.println("falha, usuario tem acesso ao botao editar");
            error().Fail();
        }
    }
}
