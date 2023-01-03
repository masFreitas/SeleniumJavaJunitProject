package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import support.Utils;

public class HomePage extends Utils {

    WebDriver driver;
    private By signInButton = By.xpath("//a[contains(text(),'Sign In')]");
    private By accessRegistrationBtn = By.xpath("//*[@class='action create primary']/span");


    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void accessWebsite() {
        driver.get("https://magento.softwaretestingboard.com/");
        waitElementToBePresentOnPage(signInButton, 10);
    }
    public void accessLoginPage() {
        driver.findElement(signInButton).click();
        waitElementToBePresentOnPage(accessRegistrationBtn, 10);
    }
}
