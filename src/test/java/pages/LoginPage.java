package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import runner.RunnerTest;
import support.Utils;

public class LoginPage extends RunnerTest {
    private By accessRegistrationBtn = By.xpath("//*[@class='action create primary']/span");
    private By emailField = By.name("email");
    private By passwdField = By.name("password");
    private By signinBtn = By.xpath("//button[.='Login']");

    public void accessUserRegistrationPage() {
        getDriver().findElement(accessRegistrationBtn).click();
    }

    public void fillEmailField(String email) {
        getDriver().findElement(emailField).sendKeys(email);
    }

    public void fillPasswordField(String passwd) {
        getDriver().findElement(passwdField).sendKeys(passwd);
    }

    public void clickSigninBtn() {
        getDriver().findElement(signinBtn).click();
    }

    public void seeMessage(String message) {
        Utils.waitElementToBePresentOnPage(By.xpath("//*[contains(text(), \'"+message+"\')]"), 20);
    }

    public void compareUrl() {
        String currentUrl = getDriver().getCurrentUrl();
        Assert.assertEquals(currentUrl, "https://automationexercise.com/login");
    }
}
