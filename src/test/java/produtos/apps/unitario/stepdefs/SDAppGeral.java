package produtos.apps.unitario.stepdefs;

import cucumber.api.java.en.And;
import support.CoreWeb;

public class SDAppGeral extends CoreWeb {


    @And("O usuario utiliza scroll para descer {int}")
    public void oUsuarioUtilizaScrollParaDescer(int arg0) {
        scroll().down(arg0);
    }

    @And("O usuario utiliza scroll para subir {int}")
    public void oUsuarioUtilizaScrollParaSubir(int arg0) {
        scroll().up(arg0);
    }
}
