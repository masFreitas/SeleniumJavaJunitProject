package pages;

import org.openqa.selenium.By;
import runner.RunnerTest;

public class LoginPage extends RunnerTest {
    private By accessRegistrationBtn = By.xpath("//*[@class='action create primary']/span");

    public void accessUserRegistrationPage() {
        getDriver().findElement(accessRegistrationBtn).click();
    }
}
