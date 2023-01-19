package pages;

import org.openqa.selenium.By;
import runner.RunnerTest;
import support.Utils;

public class HomePage extends RunnerTest {
    private By logo = By.className("logo");
    private By signInButton = By.xpath("//*[.=' Signup / Login']/i");
    private By loginText = By.xpath("//*[h2='Login to your account']");

    public void accessWebsite() {
        getDriver(Browser.CHROME);
        getDriver().manage().window().maximize();
        getDriver().get("https://automationexercise.com/");
        Utils.waitElementToBePresentOnPage(logo, 10);
    }
    public void accessLoginPage() {
        getDriver().findElement(signInButton).click();
        Utils.waitElementToBePresentOnPage(loginText, 10);
    }

    public void seeLoginUser(String userName) {
        Utils.waitElementToBePresentOnPage(By.xpath("//*[.='"+userName+"']/b"), 20);
    }
}
