package produtos.aplicativo_android.integrado.stepdefs;

import cucumber.api.java.en.And;
import support.CoreAndroid;

import java.util.Calendar;

import static produtos.aplicativo_android.integrado.objetos.AplicativoAndroidSolicitacao.*;


public class SDAplicativoAndroidSolicitacao extends CoreAndroid {

    @And("O usuario permite o acesso as fotos do aplicativo")
    public void oUsuarioPermiteOAcessoAsFotosDoAplicativo() {
        log().setLocator(aplicativoAndroidSolicitacao);
        find(aplicativoAndroidSolicitacaoPermitirFotosButton).click();
    }

    @And("O usuario permite acesso ao microfone do aplicativo")
    public void oUsuarioPermiteAcessoAoMicrofoneDoAplicativo() {
        log().setLocator(aplicativoAndroidSolicitacao);
        find(aplicativoAndroidSolicitacaoPermitirMicrofoneButton).click();
    }

    static long t = Calendar.getInstance().getTimeInMillis();
    @And("O usuario preenche o campo owner")
    public void oUsuarioPreencheOCampoOwner() {
        log().setLocator(aplicativoAndroidSolicitacao);
        find(aplicativoAndroidSolicitacaoOwnerInput).send().text("auto-"+t);
    }

    @And("O usuario preenche o campo telefone")
    public void oUsuarioPreencheOCampoTelefone() {
        log().setLocator(aplicativoAndroidSolicitacao);
        find(aplicativoAndroidSolicitacaoTelefoneInput).send().text(""+t);
    }

    @And("O usuario preenche o campo celular")
    public void oUsuarioPreencheOCampoCelular() {
        log().setLocator(aplicativoAndroidSolicitacao);
        find(aplicativoAndroidSolicitacaoCelularInput).send().text(""+t);
    }

    @And("O usuario preenche o campo email")
    public void oUsuarioPreencheOCampoEmail() {
        log().setLocator(aplicativoAndroidSolicitacao);
        find(aplicativoAndroidSolicitacaoEmailInput).send().text(aplicativoAndroidEmailTeste);
    }

    @And("O usuario escolhe o vendedor QA")
    public void oUsuarioEscolheOVendedorQA() {
        log().setLocator(aplicativoAndroidSolicitacao);
        find(aplicativoAndroidSolicitacaoVendedorButton).click();
        find(aplicativoAndroidSolicitacaoVendedorQAButton).click();
    }

    @And("O usuario preenche a placa")
    public void oUsuarioPreencheAPlaca() {
        log().setLocator(aplicativoAndroidSolicitacao);
        find(aplicativoAndroidSolicitacaoPlacaInput).send().text(aplicativoAndroidPlacaTeste);
    }

    @And("O usuario arrasta a tela para baixo")
    public void oUsuarioArrastaATelaParaBaixo() {
        scroll().down(1);
    }

    @And("O usuario preenche o ano de fabricacao")
    public void oUsuarioPreencheOAnoDeFabricacao() {
        log().setLocator(aplicativoAndroidSolicitacao);
        find(aplicativoAndroidSolicitacaoAnoDeFabricacaoButton).click();
        find(aplicativoAndroidSolicitacaoTerceiroAnoDeFabricacaoButton).click();
    }

    @And("O usuario preenche o ano de lancamento")
    public void oUsuarioPreencheOAnoDeLancamento() {
        log().setLocator(aplicativoAndroidSolicitacao);
        find(aplicativoAndroidSolicitacaoAnoDeLancamentoButton).click();
        find(aplicativoAndroidSolicitacaoTerceiroAnoDeLancamentoButton).click();
    }

    @And("O usuario preenche a kilometragem")
    public void oUsuarioPreencheAKilometragem() {
        log().setLocator(aplicativoAndroidSolicitacao);
        find(aplicativoAndroidSolicitacaoKilometragemInput).send().text(""+t);
    }

    @And("O usuario preenche a marca utilizando o filtro por {string}")
    public void oUsuarioPreencheAMarcaUtilizandoOFiltroPor(String arg0) {
        log().setLocator(aplicativoAndroidSolicitacao);
        find(aplicativoAndroidSolicitacaoMarcaButton).click();
        find(aplicativoAndroidSolicitacaoFiltroButton).send().text(arg0);
        find(aplicativoAndroidSolicitacaoMarcaSelecionadaButton).click();
        sleep().until(1000);
    }


    @And("O usuario preenche o modelo utilizando o filtro por {string}")
    public void oUsuarioPreencheOModeloUtilizandoOFiltroPor(String arg0) {
        log().setLocator(aplicativoAndroidSolicitacao);
        find(aplicativoAndroidSolicitacaoModeloButton).click();
        find(aplicativoAndroidSolicitacaoFiltroButton).send().text(arg0);
        find(aplicativoAndroidSolicitacaoModeloSelecionadoButton).click();
    }

    @And("O usuario preenche o campo versao")
    public void oUsuarioPreencheOCampoVersao() {
        log().setLocator(aplicativoAndroidSolicitacao);
        find(aplicativoAndroidSolicitacaoVersaoButton).click();
        find(aplicativoAndroidSolicitacaoPrimeiraVersaoButton).click();
    }

    @And("O usuario preenche o campo cor")
    public void oUsuarioPreencheOCampoCor() {
        log().setLocator(aplicativoAndroidSolicitacao);
        find(aplicativoAndroidSolicitacaoCorButton).click();
        find(aplicativoAndroidSolicitacaoPrimeiraCorButton).click();
    }

    @And("O usuario preenche o campo combustivel")
    public void oUsuarioPreencheOCampoCombustivel() {
        log().setLocator(aplicativoAndroidSolicitacao);
        find(aplicativoAndroidSolicitacaoCombustivelButton).click();
        find(aplicativoAndroidSolicitacaoPrimeiroCombustivelButton).click();
    }

    @And("O usuario preenche o campo cambio")
    public void oUsuarioPreencheOCampoCambio() {
        log().setLocator(aplicativoAndroidSolicitacao);
        find(aplicativoAndroidSolicitacaoCambioButton).click();
        find(aplicativoAndroidSolicitacaoPrimeiroCambioButton).click();
    }

    @And("O usuario preenche o campo procedencia")
    public void oUsuarioPreencheOCampoProcedencia() {
        log().setLocator(aplicativoAndroidSolicitacao);
        find(aplicativoAndroidSolicitacaoProcedenciaButton).click();
        find(aplicativoAndroidSolicitacaoPrimeiraProcedenciaButton).click();
    }

    @And("O usuario preenche o campo quantidade de portas utilizando o filtro por {string}")
    public void oUsuarioPreencheOCampoQuantidadeDePortasUtilizandoOFiltroPor(String arg0) {
        log().setLocator(aplicativoAndroidSolicitacao);
        find(aplicativoAndroidSolicitacaoQuantidadeDePortasButton).click();
        find(aplicativoAndroidSolicitacaoFiltroButton).send().text(arg0);
        find(aplicativoAndroidSolicitacaoQuantidadeDePortasSelecionadaButton).click();
    }

    @And("O usuario insere quatro fotos de teste")
    public void oUsuarioInsereQuatroFotosDeTeste() {
        log().setLocator(aplicativoAndroidSolicitacao);
        find(aplicativoAndroidSolicitacaoFotosButton).click();
        find(aplicativoAndroidSolicitacaoPermitirAcessoFotosButton).click();
        //find(aplicativoAndroidSolicitacaoPermitirAcessoFotosSempreButton).click();
        //find(aplicativoAndroidSolicitacaoLembrarLocalizacaoDeFotosButton).click();
        find(aplicativoAndroidSolicitacaoTirarFotoButton).click();
        find(aplicativoAndroidSolicitacaoEnviarFotoButton).click();
        find(aplicativoAndroidSolicitacaoTirarFotoButton).click();
        find(aplicativoAndroidSolicitacaoEnviarFotoButton).click();
        find(aplicativoAndroidSolicitacaoTirarFotoButton).click();
        find(aplicativoAndroidSolicitacaoEnviarFotoButton).click();
        find(aplicativoAndroidSolicitacaoTirarFotoButton).click();
        find(aplicativoAndroidSolicitacaoEnviarFotoButton).click();
        androidDriver().back();
    }

    @And("O usuario clica em salvar e avancar")
    public void oUsuarioClicaEmSalvarEAvancar() {
        log().setLocator(aplicativoAndroidSolicitacao);
        find(aplicativoAndroidSolicitacaoSalvarEAvancarButton).click();
    }


    @And("O usuario preenche o campo classificacao como A")
    public void oUsuarioPreencheOCampoClassificacaoComoA() {
        log().setLocator(aplicativoAndroidSolicitacao);
        find(aplicativoAndroidSolicitacaoClassificacaoButton).click();
        find(aplicativoAndroidSolicitacaoClassificacaoAButton).click();
    }

    @And("O usuario preenche o campo finalidade como oferta")
    public void oUsuarioPreencheOCampoFinalidadeComoOferta() {
        log().setLocator(aplicativoAndroidSolicitacao);
        find(aplicativoAndroidSolicitacaoFinalidadeButton).click();
        find(aplicativoAndroidSolicitacaoFinalidadeOfertaButton).click();
    }
}
