package SeleniumLearning;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class AT02_NavigateTitleAssertScreenshot {
    @Test
    public void Navigation() throws IOException {
    //Chromedriver setup
        WebDriverManager.chromedriver().setup();
        //this below line will open chrome browser
        WebDriver driver = new ChromeDriver();
        //maximize browser
        driver.manage().window().maximize();
        //Navigat to website
        driver.get("https://www.thegoodguys.com.au/");
        //implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //get title of the page
        String ActualTitle=driver.getTitle();
        System.out.println("ActualTitle : "+ActualTitle);
        String ExpectedTitle = "The Good Guys - Online Electrical & Home Appliances";
        //Assertion version-1
        Assert.assertEquals(ExpectedTitle,ActualTitle);
        //Assertion version-2
        Assert.assertTrue(ActualTitle.contains("Electrical"));
        //screenshot
        File ScreenShotImg=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(ScreenShotImg, new File((System.getProperty("user.dir")+"\\src\\test\\java\\screenShots\\Capture-1.jpeg")));
    }
}
