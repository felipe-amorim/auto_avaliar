package produtos.apps.unitario.runner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/produtos/apps/features/",
        glue={"produtos.apps.unitario.stepdefs"},
        plugin = { "intern.ListCucumber" },
        tags = {"@Arnaldo"}
)

public class Run {
}
