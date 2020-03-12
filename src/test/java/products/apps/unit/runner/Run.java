package products.apps.unit.runner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/products/apps/unit/features/buttons",
        glue={"products.apps.unit.stepdefs"},
        plugin = { "intern.ListCucumber" }
)

public class Run {
}
