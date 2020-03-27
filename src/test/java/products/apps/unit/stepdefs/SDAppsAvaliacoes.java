package products.apps.unit.stepdefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import support.CoreWeb;

import java.awt.*;

import static products.apps.unit.objects.AppsAvaliacoes.*;
import static products.apps.unit.objects.AppsAvaliacoes.appsSolicitarButton;
import static products.apps.unit.objects.AppsSolicitarAvaliacao.*;
import static products.apps.unit.objects.AppsSolicitarAvaliacao.appsPrimeiroVeiculoLi;
import static products.apps.unit.stepdefs.SDAppsSolicitarAvaliacao.placaVeiculo;


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

    @Then("O usuario valida que o campo buscar placa esta escrito corretamente")
    public void oUsuarioValidaQueOCampoBuscarPlacaEstaEscritoCorretamente() {
        log().setLocator(appsAvaliacoes);
        assertThat(textBuscarPlaca).isEqualTo(find(appsTextBuscarPlaca).get().text().toString());
    }

    @And("O usuario seleciona o veiculo recem avaliado na lista de avaliacoes")
    public void oUsuarioSelecionaOVeiculoRecemAvaliadoNaListaDeAvaliacoes() {
        log().setLocator(appsAvaliacoes);
        find(appsButtonVeiculoRecemAvaliado.replace("arg0",placaVeiculo)).click();
    }

    @And("O usuario clica no botao para adicionar imagem a avaliacao solicitada")
    public void oUsuarioClicaNoBotaoParaAdicionarImagemAAvaliacaoSolicitada() {
        log().setLocator(appsAvaliacoes);
        find(appsButtonAdicionarImagemAvaliacaoSolicitada).click();
    }

    @And("O usuario clica em selecionar para documento")
    public void oUsuarioClicaEmSelecionarParaDocumento() {
        log().setLocator(appsAvaliacoes);
        find(appsButtonSelecionarImagemDocumento).click();
    }

    @And("O usuario clica em selecionar para frente lado diagonal")
    public void oUsuarioClicaEmSelecionarParaFrenteLadoDiagonal() {
        log().setLocator(appsAvaliacoes);
        find(appsButtonSelecionarImagemFrenteLado).click();
    }

    @And("O usuario envia o endereco de uma imagem")
    public void oUsuarioEnviaOEnderecoDeUmaImagem() {
        Robot JRobot = null;
        try {
            JRobot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    @And("O usuario seleciona a versao no filtro de avaliacoes")
    public void oUsuarioSelecionaAVersaoNoFiltroDeAvaliacoes() {
        log().setLocator(appsAvaliacoes);
        find(appsInputFiltroVersao).send().text("CHERY QQ 1.0 MPFI 12V GASOLINA 4P MANUAL (2011)");
    }

    @And("O usuario seleciona a marca no filtro de avaliacoes")
    public void oUsuarioSelecionaAMarcaNoFiltroDeAvaliacoes() {
        log().setLocator(appsAvaliacoes);
        find(appsInputFiltroMarca).send().text("FERRARI");
    }

    @And("O usuario seleciona a modelo no filtro de avaliacoes")
    public void oUsuarioSelecionaAModeloNoFiltroDeAvaliacoes() {
        log().setLocator(appsAvaliacoes);
        find(appsInputFiltroModelo).send().text("UNO");
    }

    @And("O usuario clica em buscar em avaliacoes")
    public void oUsuarioClicaEmBuscarEmAvaliacoes() {
        log().setLocator(appsAvaliacoes);
        find(appsButtonFiltroBuscar).click();
    }

    @Then("O usuario valida que e possivel buscar com filtros incompativeis")
    public void oUsuarioValidaQueEPossivelBuscarComFiltrosIncompativeis() {
    }

    @And("O usuario seleciona o primeiro valor da busca versao")
    public void oUsuarioSelecionaOPrimeiroValorDaBuscaVersao() {
        log().setLocator(appsAvaliacoes);
        find(appsButtonResultadoVersao).click();
    }

    @And("O usuario seleciona o primerio valor da busca marca")
    public void oUsuarioSelecionaOPrimerioValorDaBuscaMarca() {
        log().setLocator(appsAvaliacoes);
        find(appsButtonResultadoMarca).click();
    }

    @And("O usuario seleciona o primeiro valor da busca modelo")
    public void oUsuarioSelecionaOPrimeiroValorDaBuscaModelo() {
        log().setLocator(appsAvaliacoes);
        find(appsButtonResultadoModelo).click();
    }
}
