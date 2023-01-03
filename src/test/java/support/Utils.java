package support;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import runner.RunnerTest;

import java.util.Random;

public class Utils extends RunnerTest {

    public void waitElementToBePresentOnPage(By element, int time) {
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public String getRandomEmail() {
        String emailName = "mateus_";
        String emailProvider = "freitas.com";

        Random random = new Random();
        int min = 1;
        int max = 999999999;
        int result = random.nextInt(max-min) + min;

        return emailName + result + emailProvider;

    }
}
