package SeleniumLearning;

import org.junit.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class AT03_XpathLearning {

    @Test
    public void xpath() throws InterruptedException {
        //Setting up chromedriver.
        WebDriverManager.chromedriver().setup();
        //we create an object of WebDriver
        WebDriver driver = new ChromeDriver();
        //At this point browser will be opened
        //maximize browser
        driver.manage().window().maximize();
        // navigate to HN website
        driver.get("https://www.myer.com.au/join");
        //implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //Xpath version-1   enter first name
        driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("John");
        //Xpath version-2   enter last name
        driver.findElement(By.xpath("//*[@id='last-name' and @maxlength='40']")).sendKeys("John");
        //xpath version-3 enter mobile
        driver.findElement(By.xpath("//*[contains(@type,'tel')]")).sendKeys("0428098765");
        //xpath version-2 enter email address
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@gmail.com");
        Thread.sleep(5000);
        //xpath version-2 enter password
        //driver.findElement(By.id("password")).sendKeys("password");
        driver.findElement(By.xpath("//*[@id='password' or type='password']")).sendKeys("Pa$sw1rd");
        //clcik on continue
        //driver.findElement(By.xpath("//*[contains(text(),'Continue')]")).click();
        //if this above contine button was not in focus of selenium
        //if an element is not in focus then selenium wont click on it then we have to scroll to the location of the element and click on it

        WebElement ContinueButton=driver.findElement(By.xpath("//*[contains(text(),'Continue')]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ContinueButton);
        ContinueButton.click();


    }
}
