package SeleniumLearning;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class AT03_locatorsSelenium {
    @Test
    public void LocatorsSelenium() throws InterruptedException {
        //Chromedriver setup
        WebDriverManager.chromedriver().setup();
        //this below line will open chrome browser
        WebDriver driver = new ChromeDriver();
        //maximize browser
        driver.manage().window().maximize();
        //Navigate to a website
        driver.get("https://www.thegoodguys.com.au/UserRegistrationForm?myAcctMain=1&new=Y&catalogId=30000&langId=-1&storeId=900");
        //implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //Firstname enter
        //By.id --->id="regAddForm_firstName"
        driver.findElement(By.id("regAddForm_firstName")).sendKeys("John");
        // last name enter
        //by name --->name="lastName"
        driver.findElement(By.name("lastName")).sendKeys("Smith");
        //Link Text --->Catalogues
        driver.findElement(By.linkText("Catalogues")).click();
        //stops code for 5sec -- not recommended
        Thread.sleep(5000);
        //Partial Link Text --->Catalo
       // driver.findElement(By.partialLinkText("Catalo")).click();

        //click on goodguys logo -->by.classname-->click
        // we get error as compound class names not permitted
        //because in classname we have 2 words
        // driver.findElement(By.className("img-responsive good_guy_logo")).click();
        //use this way
        driver.findElement(By.className("good_guy_logo")).click();
    }
}
