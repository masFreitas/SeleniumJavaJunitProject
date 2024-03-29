package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.GlobalPage;
import pages.HomePage;
import pages.LoginPage;
import runner.RunnerTest;
import support.Utils;

public class LoginSteps extends RunnerTest {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    GlobalPage globalPage = new GlobalPage();

    private String email = "mateustcteste@gmail.com";
    private String passwd = "12345";

    @Given("^I am on the login page$")
    public void iAmOnTheLoginPage() throws Throwable {
        globalPage.accessWebsite();
        homePage.accessLoginPage();
    }

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

    @Then("^I continue on the same page$")
    public void iContinueOnTheSamePage() throws Throwable {
        Utils.compareUrl("https://automationexercise.com/login");
    }
}
