package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import runner.RunnerTest;
import support.Utils;

public class CreateAccountPage extends RunnerTest {
    private By firstNameField = By.id("firstname");
    private By lastNameField= By.id("lastname");
    private By newsletterSelect = By.id("is_subscribed");
    private By emailField = By.id("email_address");
    private By passwordField = By.id("password");
    private By confirmPasswordField = By.id("password-confirmation");
    private By createAccountBtn = By.xpath("//*[@title='Create an Account']");
    private By getCreateAccountMessage = By.xpath("//*[.='Thank you for registering with Fake Online Clothing Store.']");
    private By getMyAccountPageTitle = By.xpath("//*[@class=\"page-title\"]/span");

    private String password = Utils.getRandomPassword();

    public void fillFirstnameField(String firstname) {
        Utils.waitElementToBePresentOnPage(firstNameField, 10);
        getDriver().findElement(firstNameField).sendKeys(firstname);
    }

    public void fillLastnameField(String lastname) {
        getDriver().findElement(lastNameField).sendKeys(lastname);
    }

    public void checkNewsletter() {
        getDriver().findElement(newsletterSelect).click();
    }

    public void fillEmailField() {
        getDriver().findElement(emailField).sendKeys(Utils.getRandomEmail());
    }

    public void fillPasswordField() {
        getDriver().findElement(passwordField).sendKeys(password);
    }

    public void fillConfirmPasswordField() {
        getDriver().findElement(confirmPasswordField).sendKeys(password);
    }

    public void clickCreateAccountBtn() {
        getDriver().findElement(createAccountBtn).click();
    }

    public void checkSuccessMessage() {
        Utils.waitElementToBePresentOnPage(getCreateAccountMessage, 15);
        String successTextMessage = getDriver().findElement(getCreateAccountMessage).getText();
        Assert.assertTrue(successTextMessage, true);
    }

    public void checkMyAccountPage() {
        Assert.assertTrue(String.valueOf(getMyAccountPageTitle), true);
    }


}
