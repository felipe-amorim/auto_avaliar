package products.apps.unit.stepdefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Test;
import org.openqa.selenium.Keys;
import support.CoreWeb;

import java.util.Calendar;

import static products.apps.unit.objects.AppsLogin.appsEmailInput;
import static products.apps.unit.objects.AppsLogin.appsLogin;
import static products.apps.unit.objects.AppsMain.*;
import static products.apps.unit.objects.AppsSolicitarAvaliacao.*;


public class SDAppsSolicitarAvaliacao extends CoreWeb {
    private static String veiculo = "";

    @Then("O usuario valida que a tela solicitar avaliacao carregou com sucesso")
    public void oUsuarioValidaQueATelaSolicitarAvaliacaoCarregouComSucesso() {
        log().setLocator(appsSolicitarAvaliacao);
        find(appsSolicitarAvaliacaoTitle).exists();
    }

    @And("O usuario seleciona o tipo de avaliacao {string}")
    public void oUsuarioSelecionaOTipoDeAvaliacao(String arg0) {
        find(appsTipoAvaliacaoCombobox).comboBox().set().byText(arg0);
    }

    @And("O usuario seleciona o avaliador responsavel {int}")
    public void oUsuarioSelecionaOAvaliadorResponsavel(int arg0) {
        find(appsAvaliadorResponsavelCombobox).comboBox().set().byIndex(arg0);
    }

    @And("O usuario insere um nome do cliente")
    public void oUsuarioInsereUmNomeDoCliente() {
        long t = Calendar.getInstance().getTimeInMillis();
        find(appsNomeDoClienteInput).send().text("Cliente " + t);
    }

    @And("O usuario insere o ano do veiculo de interesse como {int}")
    public void oUsuarioInsereOAnoDoVeiculoDeInteresseComo(int arg0) {
        find(appsAnoDeInteresseInput).clear();
        find(appsAnoDeInteresseInput).send().text("" + arg0);
    }

    @And("O usuario insere o veiculo {string}")
    public void oUsuarioInsereOVeiculo(String arg0) {
        find(appsVeiculoInput).send().text(arg0);
        veiculo = arg0;
    }

    @And("O usuario seleciona o primeiro veiculo da busca")
    public void oUsuarioSelecionaOPrimeiroVeiculoDaBusca() {
        if (!find(appsPrimeiroVeiculoLi).get().attribute("title").toString().toLowerCase().contains(veiculo)) {
            error().Warning("O primeiro veiculo não possuia o critério de busca inserido (" + veiculo + ")");
        }
        find(appsPrimeiroVeiculoLi).click();
    }

    @Then("O usuario clica no botao solicitar sem preencher os campos obrigatorios")
    public void oUsuarioClicaNoBotaoSolicitarSemPreencherOsCamposObrigatorios() {
        log().setLocator(appsSolicitarAvaliacao);
        find(appsSolicitarButton).click();
    }

    @And("O usuario valida a mensagem de obrigatoriedade do campo tipo de avaliacao")
    public void oUsuarioValidaAMensagemDeObrigatoriedadeDoCampoTipoDeAvaliacao() {
        if (!find(appsObrigatoriedadeTipoDeAvaliacaoText).exists()) {
            error().Fail();
        } else {
            if (find(appsObrigatoriedadeTipoDeAvaliacaoText).count() > 1) {
                error().Warning("Mais de uma mensagem de erro com a mesma mensagem foi exibida");
            }
            sleep().untilDisapear(appsObrigatoriedadeTipoDeAvaliacaoText);
        }
    }

    @And("O usuario preenche o campo tipo de avaliacao com o primeiro item disponivel")
    public void oUsuarioPreencheOCampoTipoDeAvaliacaoComOPrimeiroItemDisponivel() {
        find(appsTipoAvaliacaoCombobox).comboBox().set().byIndex(1);
    }

    @And("O usuario valida nao existencia da mensagem de obrigatoriedade do campo tipo de avaliacao")
    public void oUsuarioValidaNaoExistenciaDaMensagemDeObrigatoriedadeDoCampoTipoDeAvaliacao() {
        if (find(appsObrigatoriedadeTipoDeAvaliacaoText).exists()) {
            error().Fail();
        }
    }

    @And("O usuario valida a mensagem de obrigatoriedade do campo avaliador responsavel")
    public void oUsuarioValidaAMensagemDeObrigatoriedadeDoCampoAvaliadorResponsavel() {
        if (!find(appsObrigatoriedadeAvaliadorResponsavelText).exists()) {
            error().Fail();
        } else {
            if (find(appsObrigatoriedadeAvaliadorResponsavelText).count() > 1) {
                error().Warning("Mais de uma mensagem de erro com a mesma mensagem foi exibida");
            }
            sleep().untilDisapear(appsObrigatoriedadeAvaliadorResponsavelText);
        }
    }

    @And("O usuario valida nao existencia da mensagem de obrigatoriedade do campo avaliador responsavel")
    public void oUsuarioValidaNaoExistenciaDaMensagemDeObrigatoriedadeDoCampoAvaliadorResponsavel() {
        if (find(appsObrigatoriedadeAvaliadorResponsavelText).exists()) {
            error().Fail();
        }
    }

    @And("O usuario valida a mensagem de obrigatoriedade do campo nome")
    public void oUsuarioValidaAMensagemDeObrigatoriedadeDoCampoNome() {
        if (!find(appsObrigatoriedadeNomeText).exists()) {
            error().Fail();
        } else {
            if (find(appsObrigatoriedadeNomeText).count() > 1) {
                error().Warning("Mais de uma mensagem de erro com a mesma mensagem foi exibida");
            }
            sleep().untilDisapear(appsObrigatoriedadeNomeText);
        }
    }

    @And("O usuario valida nao existencia da mensagem de obrigatoriedade do campo nome")
    public void oUsuarioValidaNaoExistenciaDaMensagemDeObrigatoriedadeDoCampoNome() {
        if (find(appsObrigatoriedadeNomeText).exists()) {
            error().Fail();
        }
    }

    @And("O usuario valida a mensagem de obrigatoriedade do campo celular")
    public void oUsuarioValidaAMensagemDeObrigatoriedadeDoCampoCelular() {
        if (!find(appsObrigatoriedadeCelularText).exists()) {
            error().Fail();
        } else {
            if (find(appsObrigatoriedadeCelularText).count() > 1) {
                error().Warning("Mais de uma mensagem de erro com a mesma mensagem foi exibida");
            }
            sleep().untilDisapear(appsObrigatoriedadeCelularText);
        }
    }

    @And("O usuario insere um celular")
    public void oUsuarioInsereUmCelular() {
        long t = Calendar.getInstance().getTimeInMillis();
        find(appsCelularInput).send().text("" + t);
    }

    @And("O usuario valida nao existencia da mensagem de obrigatoriedade do celular")
    public void oUsuarioValidaNaoExistenciaDaMensagemDeObrigatoriedadeDoCelular() {
        if (find(appsObrigatoriedadeCelularText).exists()) {
            error().Fail();
        }
    }

    @And("O usuario valida a mensagem de obrigatoriedade do campo placa")
    public void oUsuarioValidaAMensagemDeObrigatoriedadeDoCampoPlaca() {
        if (!find(appsObrigatoriedadePlacaText).exists()) {
            error().Fail();
        } else {
            if (find(appsObrigatoriedadePlacaText).count() > 1) {
                error().Warning("Mais de uma mensagem de erro com a mesma mensagem foi exibida");
            }
            sleep().untilDisapear(appsObrigatoriedadePlacaText);
        }
    }

    @And("O usuario insere uma placa real")
    public void oUsuarioInsereUmaPlacaReal() {
        find(appsPlacaInput).send().text("KZA-0263");
    }

    @And("O usuario valida nao existencia da mensagem de obrigatoriedade da placa")
    public void oUsuarioValidaNaoExistenciaDaMensagemDeObrigatoriedadeDaPlaca() {
        if (find(appsObrigatoriedadePlacaText).exists()) {
            error().Fail();
        }
    }

    @And("O usuario limpa o campo placa")
    public void oUsuarioLimpaOCampoPlaca() {
        find(appsPlacaInput).clear();
    }

    @And("O usuario perde o foco do campo placa")
    public void oUsuarioPerdeOFocoDoCampoPlaca() {
        find(appsPlacaInput).send().tab();
    }

    @And("O usuario insere uma placa invalida")
    public void oUsuarioInsereUmaPlacaInvalida() {
        find(appsPlacaInput).send().text("-");
    }

    @And("O usuario valida a mensagem de placa invalida")
    public void oUsuarioValidaAMensagemDePlacaInvalida() {
        if (!find(appsPlacaInvalidaText).exists()) {
            error().Fail();
        } else {
            if (find(appsPlacaInvalidaText).count() > 1) {
                error().Warning("Mais de uma mensagem de erro com a mesma mensagem foi exibida");
            }
            sleep().untilDisapear(appsPlacaInvalidaText);
        }
    }

    @And("O usuario clica em buscar placa")
    public void oUsuarioClicaEmBuscarPlaca() {
        find(appsBuscarPlacaButton).click();
    }

    @And("O usuario clica no botao solicitar para realizar solicitacao de avaliacao")
    public void oUsuarioClicaNoBotaoSolicitarParaRealizarSolicitacaoDeAvaliacao() {
        log().setLocator(appsSolicitarAvaliacao);
        sleep().until(1000);
        find(appsSolicitarAvaliacoButtonSolicitar).click();
    }

    @And("O usuario utiliza scroll para navegar em {int}")
    public void oUsuarioUtilizaScrollParaNavegarEm(int arg0) {
        if (arg0 >= 0) {
            System.out.println("if down");
            sleep().until(2000);
            scroll().down(arg0);
        }
        if (arg0 < 0) {
            sleep().until(2000);
            System.out.println("if up");
            scroll().up(arg0);
        }
    }

    @And("O usuario insere o renavam")
    public void oUsuarioInsereORenavam() {
        log().setLocator(appsSolicitarAvaliacao);
        find(appsSolicitarAvaliacaoInputRenavam).send().text("144003058");
    }

    @And("O usuario seleciona sim para chave reserva")
    public void oUsuarioSelecionaSimParaChaveReserva() {
        log().setLocator(appsSolicitarAvaliacao);
        find(appsSolicitarAvaliacaoSelectChaveReserva).comboBox().set().byIndex(1);
    }

    @And("O usuario seleciona sim para manual")
    public void oUsuarioSelecionaSimParaManual() {
        log().setLocator(appsSolicitarAvaliacao);
        find(appsSolicitarAvaliacaoSelectManual).comboBox().set().byIndex(1);
    }

    @And("O usuario clica no botao solicitar")
    public void oUsuarioClicaNoBotaoSolicitar() {
        log().setLocator(appsSolicitarAvaliacao);
        find(appsSolicitarAvaliacaoButtonSolicita).click();
    }

    @Then("O usuario insere uma placa valida e inexistente")
    public void oUsuarioInsereUmaPlacaValidaEInexistente() {
        find(appsPlacaInput).send().text("AAA-0000");
    }

    @And("O usuario valida a mensagem de placa nao encontrada")
    public void oUsuarioValidaAMensagemDePlacaNaoEncontrada() {
        if (!find(appsPlacaNaoEncontradaText).exists()) {
            error().Fail();
        } else {
            if (find(appsPlacaNaoEncontradaText).count() > 1) {
                error().Warning("Mais de uma mensagem de erro com a mesma mensagem foi exibida");
            }
            sleep().untilDisapear(appsPlacaNaoEncontradaText);
        }
    }

    @And("O usuario insere um cpf valido")
    public void oUsuarioInsereUmCpfValido() {
        log().setLocator(appsSolicitarAvaliacao);
        find(appsSolicitarAvaliacaoInputCPF).send().text("87399971897");
    }

    @And("O usuario insere um numero de renavam")
    public void oUsuarioInsereUmNumeroDeRenavam() {
        log().setLocator(appsSolicitarAvaliacao);
        find(appsSolicitarAvaliacaoInputRenavam).send().text("123456789");
    }

    @And("O usuario insere um valor para expectativa do cliente")
    public void oUsuarioInsereUmValorParaExpectativaDoCliente() {
        log().setLocator(appsSolicitarAvaliacao);
        find(appsSolicitarAvaliacaoInputExpectativaDoCliente).send().text("1500000");


    }

    @And("O usuario preenche o campo observacoes")
    public void oUsuarioPreencheOCampoObservacoes() {
        log().setLocator(appsSolicitarAvaliacao);
        find(appsSolicitarAvaliacaoButtonOpenFieldObs).click();
        find(appsSolicitarAvaliacaoInputTextObs).send().text("Observações Testes Automatizados");
    }

    @And("O usuario insere um telefone")
    public void oUsuarioInsereUmTelefone() {
        long t = Calendar.getInstance().getTimeInMillis();
        log().setLocator(appsSolicitarAvaliacao);
        find(appsSolicitarAvaliacaoInputNumeroTelefone).send().text("" + t);
    }

    @And("O usuario preenche o campo e-mail para solicitacao de avaliacao")
    public void oUsuarioPreencheOCampoEMailParaSolicitacaoDeAvaliacao() {
        log().setLocator(appsSolicitarAvaliacao);
        find(appsSolicitarAvaliacaoInputEmailCliente).send().text("automacao@teste.com");
    }

    private void denis() {
        driver().navigate("http://www.youtube.com.br");
        sleep().until(5000);

        scroll().down(500);
        sleep().until(5000);
    }

}
