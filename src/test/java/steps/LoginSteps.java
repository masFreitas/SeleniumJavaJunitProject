package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LoginPage;
import runner.RunnerTest;
import support.Utils;

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

    @When("^I fill email and password with invalid user$")
    public void iFillEmailAndPasswordWithInvalidUser() throws Throwable {
        loginPage.fillEmailField(Utils.getRandomEmail());
        loginPage.fillPasswordField(Utils.getRandomPassword());
        loginPage.clickSigninBtn();
    }

    @When("^I dont fill the field and click sign in$")
    public void iDontFillTheFieldAndClickSignIn() throws Throwable {
        loginPage.clickSigninBtn();
    }

    @Then("^I see \"([^\"]*)\" message$")
    public void iSeeMessage(String arg1) throws Throwable {
        loginPage.seeMessage(arg1);
    }
}
