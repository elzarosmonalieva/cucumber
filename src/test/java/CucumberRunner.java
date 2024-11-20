import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
      plugin = {"html: target/reports/cucumber.html", "json: target/reports/cucumber.json"},
        features ="/Users/user/Desktop/CucumberJUnitFramework/src/test/resources/features/cashwise.feature",
        glue = "step_definitions",
        tags = "@sign-up",
        dryRun = false



)
public class CucumberRunner {
}
