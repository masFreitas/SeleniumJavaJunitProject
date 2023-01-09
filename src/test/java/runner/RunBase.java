package runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RunBase {
    
    public enum Browser {CHROME, FIREFOX}

    static WebDriver driver;

    public static WebDriver getDriver() {
        if(driver == null) {
            return getDriver(Browser.CHROME);
        } else {
            return driver;
        }
    }

    public static WebDriver getDriver(Browser browser) {

        if(driver != null) {
            driver.quit();
        }

        switch(browser) {
            case CHROME:
                driver = new ChromeDriver();
                break;
            case FIREFOX:
                driver = new FirefoxDriver();
                break;
            default:
                throw new IllegalArgumentException("Use a valid browser (chrome or firefox)");
        }
        return driver;
    }
}
