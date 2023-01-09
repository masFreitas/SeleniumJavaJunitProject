package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.HomePage;
import runner.RunnerTest;

public class HomeSteps extends RunnerTest {

    HomePage homePage = new HomePage();
    @Given("^I am on the login page$")
    public void iAmOnTheLoginPage() throws Throwable {
        homePage.accessWebsite();
        homePage.accessLoginPage();
    }

    @Then("^I login into the application$")
    public void iLoginIntoTheApplication() throws Throwable {
        homePage.seeLoginUser("Mateus da Silva de Freitas");
    }
}
