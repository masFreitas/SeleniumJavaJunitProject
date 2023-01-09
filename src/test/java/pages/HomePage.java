package pages;

import org.openqa.selenium.By;
import runner.RunBase;
import runner.RunnerTest;
import support.Utils;

public class HomePage extends RunnerTest {
    private By signInButton = By.xpath("//a[contains(text(),'Sign In')]");
    private By accessRegistrationBtn = By.xpath("//*[@class='action create primary']/span");

    public void accessWebsite() {
        getDriver(Browser.CHROME);
        getDriver().manage().window().maximize();
        getDriver().get("https://magento.softwaretestingboard.com/");
        Utils.waitElementToBePresentOnPage(signInButton, 10);
    }
    public void accessLoginPage() {
        getDriver().findElement(signInButton).click();
        Utils.waitElementToBePresentOnPage(accessRegistrationBtn, 10);
    }
}
