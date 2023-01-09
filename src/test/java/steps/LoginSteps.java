package steps;

import cucumber.api.java.en.When;
import pages.LoginPage;
import runner.RunnerTest;

public class LoginSteps extends RunnerTest {

    LoginPage loginPage = new LoginPage();
    private String email = "mateustcteste@hotmail.com";
    private String passwd = "Teste@123";

    @When("^I access the user registration page$")
    public void accessTheUserRegistration() throws Throwable {
        loginPage.accessUserRegistrationPage();
    }

    @When("^I fill email and password$")
    public void iFillEmailAndPassword() throws Throwable {
        loginPage.fillEmailField(email);
        loginPage.fillPasswordField(passwd);
        loginPage.clickSigninBtn();
    }
}
