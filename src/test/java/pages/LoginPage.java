package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import support.Utils;

public class LoginPage extends Utils {

    WebDriver driver;
    private By accessRegistrationBtn = By.xpath("//*[@class='action create primary']/span");
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void accessUserRegistrationPage() {
        driver.findElement(accessRegistrationBtn).click();
    }
}
