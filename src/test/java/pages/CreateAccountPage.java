package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import support.Utils;

public class CreateAccountPage extends Utils {

    WebDriver driver;
    private By firstNameField = By.id("firstname");
    private By lastNameField= By.id("lastname");
    private By newsletterSelect = By.id("is_subscribed");
    private By emailField = By.id("email_address");
    private By passwordField = By.id("password");
    private By confirmPasswordField = By.id("password-confirmation");
    private By createAccountBtn = By.xpath("//*[@title='Create an Account']");
    private By getCreateAccountMessage = By.xpath("//*[.='Thank you for registering with Fake Online Clothing Store.']");
    private By getMyAccountPageTitle = By.xpath("//*[@class=\"page-title\"]/span");

    private String password = getRandomPassword();

    public CreateAccountPage(WebDriver driver) {
        this.driver = driver;
    }

    public void fillFirstnameField(String firstname) {
        waitElementToBePresentOnPage(firstNameField, 10);
        driver.findElement(firstNameField).sendKeys(firstname);
    }

    public void fillLastnameField(String lastname) {
        driver.findElement(lastNameField).sendKeys(lastname);
    }

    public void checkNewsletter() {
        driver.findElement(newsletterSelect).click();
    }

    public void fillEmailField() {
        driver.findElement(emailField).sendKeys(getRandomEmail());
    }

    public void fillPasswordField() {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void fillConfirmPasswordField() {
        driver.findElement(confirmPasswordField).sendKeys(password);
    }

    public void clickCreateAccountBtn() {
        driver.findElement(createAccountBtn).click();
    }

    public void checkSuccessMessage() {
        waitElementToBePresentOnPage(getCreateAccountMessage, 15);
        String successTextMessage = driver.findElement(getCreateAccountMessage).getText();
        Assert.assertTrue(successTextMessage, true);
    }

    public void checkMyAccountPage() {
        Assert.assertTrue(String.valueOf(getMyAccountPageTitle), true);
    }


}
