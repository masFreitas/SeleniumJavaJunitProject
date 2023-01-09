package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.CreateAccountPage;
import runner.RunnerTest;

public class CreateAccountSteps extends RunnerTest {

    CreateAccountPage createAccountPage = new CreateAccountPage(driver);

    @When("^I fill the registration form$")
    public void iFillTheRegistrationForm() throws Throwable {
        createAccountPage.fillFirstnameField("Mateus");
        createAccountPage.fillLastnameField("Freitas");
        createAccountPage.checkNewsletter();
        createAccountPage.fillEmailField();
        createAccountPage.fillPasswordField();
        createAccountPage.fillConfirmPasswordField();

    }

    @When("^click on Create an Account button$")
    public void clickOnCreateAnAccountButton() throws Throwable {
        createAccountPage.clickCreateAccountBtn();
    }

    @Then("^I see the new account message$")
    public void iSeeTheNewAccountMessage() throws Throwable {
        createAccountPage.checkSuccessMessage();

    }

    @Then("^I access the My Account page$")
    public void iAccessTheMyAccountPage() throws Throwable {
        createAccountPage.checkMyAccountPage();
    }

}