package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import runner.RunnerTest;
import support.Utils;

public class CreateAccountPage extends RunnerTest {
    private By nameField = By.name("name");
    private By emailField = By.cssSelector("input[data-qa='signup-email']");
    private By signupBtn = By.cssSelector("button[data-qa='signup-button']");
    private By titleBtn = By.id("id_gender1");
    private By password = By.id("password");
    private By selectDays = By.id("days");
    private By selectMonths = By.id("months");
    private By selectYears = By.id("years");
    private By firstNameField = By.id("first_name");
    private By lastNameField = By.id("last_name");
    private By addressField = By.id("address1");
    private By selectCountry = By.id("country");
    private By stateField = By.id("state");
    private By cityField = By.id("city");
    private By zipcodeField = By.id("zipcode");
    private By mobileNumberField = By.id("mobile_number");
    private By createAccountBtn = By.cssSelector("button[data-qa='create-account']");

    public void fillNameField(String name) {
        Utils.waitElementToBePresentOnPage(nameField, 20);
        getDriver().findElement(nameField).sendKeys(name);
    }

    public void fillEmailField(String email) {
        getDriver().findElement(emailField).sendKeys(email);
    }

    public void clickSignupBtn() {
        getDriver().findElement(signupBtn).click();
    }

    public void selectTitle() {
        Utils.waitElementToBePresentOnPage(titleBtn, 30);
        getDriver().findElement(titleBtn).click();
    }

    public void fillPassword(String passwd) {
        getDriver().findElement(password).sendKeys(passwd);
    }

    public void selectDateOfBirth() {
        Select select_day = new Select(getDriver().findElement(selectDays));
        select_day.selectByValue("27");

        Select select_month = new Select(getDriver().findElement(selectMonths));
        select_month.selectByVisibleText("October");

        Select selec_year = new Select(getDriver().findElement(selectYears));
        selec_year.selectByValue("1998");
    }

    public void fillFirstName(String firstName) {
        getDriver().findElement(firstNameField).sendKeys(firstName);
    }

    public void fillLastName(String lastName) {
        getDriver().findElement(lastNameField).sendKeys(lastName);
    }

    public void fillAddress(String address) {
        getDriver().findElement(addressField).sendKeys(address);
    }

    public void selectCountry() {
        Utils.waitElementToBePresentOnPage(selectCountry, 15);
        Select select_country = new Select(getDriver().findElement(selectCountry));
        select_country.selectByVisibleText("Singapore");
    }

    public void fillState(String state) {
        getDriver().findElement(stateField).sendKeys(state);
    }

    public void fillCity(String city) {
        getDriver().findElement(cityField).sendKeys(city);
    }

    public void fillZipCode(String zip) {
        getDriver().findElement(zipcodeField).sendKeys(zip);
    }

    public void fillMobileNumber(String mobile) {
        getDriver().findElement(mobileNumberField).sendKeys(mobile);
    }

    public void clickCreateAccount() {
        Utils.waitElementToBeClickable(createAccountBtn, 10);
        getDriver().findElement(createAccountBtn).click();
    }

}
