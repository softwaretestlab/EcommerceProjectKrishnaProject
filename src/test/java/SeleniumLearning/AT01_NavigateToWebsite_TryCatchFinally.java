package SeleniumLearning;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class AT01_NavigateToWebsite_TryCatchFinally {

    @Test
    public void Navigation() throws IOException {
        //chromedriver setup
        WebDriverManager.chromedriver().setup();
        //this below line will open chrome browser
        WebDriver driver = new ChromeDriver();
        //maximze the browser
        driver.manage().window().maximize();
        try {
            //Navigaate to a website
            driver.get("https://www.thegoodguys.com.au/");
            //click on bonus offer
            WebElement element = driver.findElement(By.xpath("//*[@id='promosAndCatalog']/div/div/div/b"));
            element.click();
            System.out.println("sucessfully navigated to website");
        }catch (Exception e) {
            // Catch any exception if element is not found
            System.out.println("Exception caught: " + e.getMessage());
        }finally {
            // Always close the driver
         //   driver.quit();
        }
    }
}
/*
try block: where you attempt risky operations (like finding or clicking an element).

catch block: handles exceptions if something goes wrong.

finally block: executes no matter what (used for cleanup like closing browser).
 */