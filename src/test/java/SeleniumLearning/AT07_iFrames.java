package SeleniumLearning;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

    public class AT07_iFrames {
        @Test
        public void iframeListSelect() throws IOException {
            //setting up chromedriver
            WebDriverManager.chromedriver().setup();
            //we create an object of WebDriver
            WebDriver driver = new ChromeDriver();
            //At this point browser will be opened
            //maximize browser
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            //Navigate to HN website
            driver.get("https://stl-automationtesting.blogspot.com/p/iframetesting.html");
            //list of iframes
            List<WebElement> ListOfiFrames =driver.findElements(By.tagName("iframe"));
            int IframeCount = ListOfiFrames.size();
            System.out.println("IframeCount : " + IframeCount);
            for(int i=0; i<IframeCount;i++){
                //jump to iframe
                driver.switchTo().frame(i);
                //name enter
                driver.findElement(By.cssSelector("[name='uname']")).sendKeys("john");

            }
        }
    }