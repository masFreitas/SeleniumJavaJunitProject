package pages;

import org.openqa.selenium.*;
import runner.RunnerTest;
import support.Utils;

public class GlobalPage extends RunnerTest {

    private By logo = By.className("logo");

    public void accessWebsite() {
        getDriver(Browser.FIREFOX);
//        getDriver().manage().window().maximize();
        getDriver().get("https://automationexercise.com/");
        Utils.waitElementToBePresentOnPage(logo, 10);
    }

    public void seeMessage(String message) {
        Utils.waitElementToBePresentOnPage(By.xpath("//*[.='"+message+"']"), 30);
    }

    public void scrollDown(int y1, int y2) {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy("+y1+","+y2+")", "");
    }

}
