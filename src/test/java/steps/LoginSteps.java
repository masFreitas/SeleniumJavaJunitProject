package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pages.LoginPage;
import runner.RunnerTest;

public class LoginSteps extends RunnerTest {

    LoginPage loginPage = new LoginPage(driver);

    @When("^I access the user registration page$")
    public void accessTheUserRegistration() throws Throwable {
        loginPage.accessUserRegistrationPage();
    }
}
