package products.apps.unit.stepdefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import support.CoreWeb;

import static products.apps.unit.objects.AppsLogin.*;
import static products.apps.unit.objects.AppsMain.appsIconUser;
import static products.apps.unit.objects.AppsMain.appsMain;


public class SDAppsMain extends CoreWeb {
    @Then("O usuario valida que a tela de dashboard carregou com sucesso")
    public void oUsuarioValidaQueATelaDeDashboardCarregouComSucesso() {
        log().setLocator(appsMain);
        sleep().untilAppear(appsIconUser);
        log().type("Efetuando um clique para assegurar que a página é exibida corretamente");
        find(appsIconUser).click();
    }
}
