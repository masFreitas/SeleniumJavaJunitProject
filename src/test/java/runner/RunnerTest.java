package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static cucumber.api.SnippetType.CAMELCASE;

@RunWith(Cucumber.class)
@CucumberOptions(
        snippets = CAMELCASE,
        plugin = {}, //use to configure reports
        features = "src/test/resources/features", //directory where feature are
        tags = {"~@ignore"}, //use to run tagged BBDs
        glue = {"steps"} //directory where steps are
)

public class RunnerTest {

    public static WebDriver driver;

    @BeforeClass
    public static void start() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://magento.softwaretestingboard.com/");
    }

    @AfterClass
    public static void stop() {
        driver.quit();
    }
}
