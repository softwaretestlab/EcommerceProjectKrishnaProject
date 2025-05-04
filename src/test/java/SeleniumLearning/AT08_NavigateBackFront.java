package SeleniumLearning;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AT08_NavigateBackFront {
    @Test
    public void NavToFro() throws InterruptedException {
        //setting up chromedriver
        WebDriverManager.chromedriver().setup();
        //we create an object of WebDriver
        WebDriver driver = new ChromeDriver();
        //At this point browser will be opened
        //maximize browser
        driver.manage().window().maximize();
        //Navigate to HN website
        driver.get("https://echoecho.com/");

        try {
            Alert alert = driver.switchTo().alert();
            System.out.println("Alert found: " + alert.getText());
            alert.accept();
            System.out.println("Alert closed.");
        } catch (NoAlertPresentException e) {
            System.out.println("No alert pop-up.");
        }



        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//a[@target='_top' and @href='school.htm']")).click();
        Thread.sleep(5000);
        driver.navigate().back();
        Thread.sleep(5000);
        driver.navigate().refresh();
        Thread.sleep(5000);
        driver.navigate().forward();
    }
}