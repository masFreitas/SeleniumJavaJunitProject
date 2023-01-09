package pages;

import org.openqa.selenium.By;
import runner.RunnerTest;

public class LoginPage extends RunnerTest {
    private By accessRegistrationBtn = By.xpath("//*[@class='action create primary']/span");
    private By emailField = By.id("email");
    private By passwdField = By.id("pass");
    private By signinBtn = By.id("send2");

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
}
