package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.CreateAccountPage;
import pages.GlobalPage;
import runner.RunnerTest;
import support.Utils;

public class CreateAccountSteps extends RunnerTest {

    private String randomEmail = Utils.getRandomEmail();
    private String randomPassword = Utils.getRandomPassword();

    CreateAccountPage createAccountPage = new CreateAccountPage();
    GlobalPage globalPage = new GlobalPage();

    @When("^I fill the Name and Email field$")
    public void iFillTheNameAndEmailField() throws Throwable {
        createAccountPage.fillNameField("Mateus");
        createAccountPage.fillEmailField(randomEmail);
    }

    @When("^click on Signup button$")
    public void clickOnSignupButton() throws Throwable {
        createAccountPage.clickSignupBtn();
    }

    @When("^I fill the Account Information form$")
    public void iFillTheAccountInformationForm() throws Throwable {
        createAccountPage.selectTitle();
        createAccountPage.fillPassword(randomPassword);
        globalPage.scrollDown(0, 550);
        createAccountPage.selectDateOfBirth();
        createAccountPage.fillFirstName("Mateus");
        createAccountPage.fillLastName("Teste");
        createAccountPage.fillAddress("Pedro Adams Filgo, 123");
        globalPage.scrollDown(0, 550);
        createAccountPage.selectCountry();
        createAccountPage.fillState("Bukit Batok");
        createAccountPage.fillCity("Guilin");
        globalPage.scrollDown(0, 550);
        createAccountPage.fillZipCode("669569");
        createAccountPage.fillMobileNumber("+65 6893 8144");
    }

    @When("^click on Create an Account button$")
    public void clickOnCreateAnAccountButton() throws Throwable {
        globalPage.scrollDown(0, 550);
        createAccountPage.clickCreateAccount();
    }

    @When("^I fill the Name with success$")
    public void iFillTheNameWithSuccess() throws Throwable {
        createAccountPage.fillNameField("Mateus");
    }

    @When("^I fill the Email field with an invalid data$")
    public void iFillTheEmailFieldWithAnInvalidData() throws Throwable {
        createAccountPage.fillEmailField("randomEmail");
    }

    }