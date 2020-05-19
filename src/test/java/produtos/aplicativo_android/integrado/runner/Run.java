package produtos.aplicativo_android.integrado.runner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/produtos/aplicativo_android/features/",
        glue={"produtos.aplicativo_android.integrado.stepdefs"},
        plugin = { "intern.ListCucumber" }
        ,tags = {"@NovaSolicitacao"}
)

public class Run {
}
