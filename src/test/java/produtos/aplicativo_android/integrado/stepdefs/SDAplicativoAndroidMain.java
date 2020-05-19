package produtos.aplicativo_android.integrado.stepdefs;

import cucumber.api.java.en.And;
import support.CoreAndroid;

import static produtos.aplicativo_android.integrado.objetos.AplicativoAndroidMain.*;


public class SDAplicativoAndroidMain extends CoreAndroid {
    @And("O usuario clica em mais")
    public void oUsuarioClicaEmMais() {
        log().setLocator(aplicativoAndroidMain);
        find(aplicativoAndroidMainMaisButton).click();
    }

    @And("O usuario clica no menu carro")
    public void oUsuarioClicaNoMenuCarro() {
        log().setLocator(aplicativoAndroidMain);
        find(aplicativoAndroidMainCarroButton).click();
    }
}
