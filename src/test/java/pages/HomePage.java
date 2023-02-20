package pages;

import org.openqa.selenium.By;
import runner.RunnerTest;
import support.Utils;

public class HomePage extends RunnerTest {
    private By signInButton = By.xpath("//*[.=' Signup / Login']/i");
    private By loginText = By.xpath("//*[h2='Login to your account']");

    public void accessLoginPage() {
        getDriver().findElement(signInButton).click();
        Utils.waitElementToBePresentOnPage(loginText, 10);
    }

    public void seeLoginUser(String userName) {
        Utils.waitElementToBePresentOnPage(By.xpath("//*[contains(@class, 'fa fa-user')]/..//b[contains(text(),'"+userName+"')]"), 40);

    }
}
