package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "F:\\SelfTraining\\screenPlay\\src\\test\\resources\\features\\GlobalExample.feature",
        glue = "stepDefinitions",
        tags = "",
        snippets = SnippetType.CAMELCASE
)
public class GlobalExampleRunner {

}
