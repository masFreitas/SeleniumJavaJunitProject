package steps;

import cucumber.api.java.en.Given;
import pages.HomePage;
import runner.RunnerTest;

public class HomeSteps extends RunnerTest {

    HomePage homePage = new HomePage();
    @Given("^I am on the login page$")
    public void iAmOnTheLoginPage() throws Throwable {
        getDriver(Browser.CHROME);
        homePage.accessWebsite();
        homePage.accessLoginPage();

    }
}
