package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.HomePage;
import runner.RunnerTest;

public class HomeSteps extends RunnerTest {

    HomePage homePage = new HomePage();


    @Then("^I login into the application$")
    public void iLoginIntoTheApplication() throws Throwable {
        homePage.seeLoginUser("Mateus");
    }
}
