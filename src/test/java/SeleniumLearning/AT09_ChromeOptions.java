package SeleniumLearning;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class AT09_ChromeOptions {

    @Test
    public void ChromeOpt() {
        //setting up chromedriver
        WebDriverManager.chromedriver().setup();
        //options
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        chromeOptions.addArguments("--ignore-certificate-errors");
        chromeOptions.addArguments("--disable-popup-blocking");
        // selenium code runs in background
       // chromeOptions.addArguments("--headless");
        //no history storing mode
        chromeOptions.addArguments("--incognito");
        //we create an object of WebDriver
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://echoecho.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
}
