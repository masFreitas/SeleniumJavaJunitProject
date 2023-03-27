package support;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import runner.RunnerTest;

import java.security.SecureRandom;
import java.util.Random;

public class Utils extends RunnerTest {

    public static void waitElementToBePresentOnPage(By element, int time) {
        WebDriverWait wait = new WebDriverWait(getDriver(), time);
        wait.until(ExpectedConditions.presenceOfElementLocated(element));
    }

    public static void waitElementToBeClickable(By element, int time) {
        WebDriverWait wait = new WebDriverWait(getDriver(), time);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    public static void compareUrl(String currentUrl) {
        String getURL = getDriver().getCurrentUrl();
        Assert.assertEquals(getURL, currentUrl);
    }
    public static String getRandomEmail() {
        String emailName = "mateus_";
        String emailProvider = "@freitas.com";

        Random random = new Random();
        int min = 1;
        int max = 999999999;
        int result = random.nextInt(max-min) + min;

        return emailName + result + emailProvider;

    }

    public static String getRandomPassword() {
        char[] possibleCharacters = (new String("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789~`!@#$%^&*()-_=+[{]}\\|;:\'\",<.>/?")).toCharArray();
        String randomString = RandomStringUtils.random(10, 0, possibleCharacters.length-1, true, true, possibleCharacters, new SecureRandom() );
        String randomPsw = randomString + "&*";
        return randomPsw;
    }
}
