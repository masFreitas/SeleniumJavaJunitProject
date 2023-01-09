package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import static cucumber.api.SnippetType.CAMELCASE;

@RunWith(Cucumber.class)
@CucumberOptions(
        snippets = CAMELCASE,
        plugin = {}, //use to configure reports
        features = "src/test/resources/features", //directory where feature are
        tags = {"@login"}, //use to run tagged BBDs
        glue = {"steps"} //directory where steps are
)

public class RunnerTest extends RunBase{

    @AfterClass
    public static void stop() {
        driver.quit();
    }
}
