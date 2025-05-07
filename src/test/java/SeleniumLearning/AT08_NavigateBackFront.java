package SeleniumLearning;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class AT08_NavigateBackFront {

    @Test
    public void NavToFro() throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-popup-blocking");
        options.addArguments("--disable-notifications");
        options.addArguments("--disable-infobars");
        options.addArguments("--disable-extensions");
        options.addArguments("--disable-gpu");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-blink-features=AutomationControlled");

        // Block Google Ads domains
        options.addArguments("--host-resolver-rules=MAP googlesyndication.com 127.0.0.1," +
                "MAP googleadservices.com 127.0.0.1," +
                "MAP pagead2.googlesyndication.com 127.0.0.1");

        WebDriver driver = new ChromeDriver(options);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://echoecho.com/");

        // Wait and remove any remaining iframe ads
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("body")));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("document.querySelectorAll('iframe').forEach(e => e.remove());");
            System.out.println("✅ All iframes removed.");
        } catch (Exception e) {
            System.out.println("⚠️ No iframe found.");
        }

        // Check and clean #google_vignette if appeared in URL
        String currentUrl = driver.getCurrentUrl();
        if (currentUrl.contains("#google_vignette")) {
            String cleanUrl = currentUrl.split("#")[0];
            driver.navigate().to(cleanUrl);
            System.out.println("✅ Cleaned URL without google_vignette: " + cleanUrl);
        }

        // Navigate steps
        driver.findElement(By.xpath("//a[@target='_top' and @href='school.htm']")).click();
        Thread.sleep(2000);

        driver.navigate().back();
        Thread.sleep(2000);

        driver.navigate().refresh();
        Thread.sleep(2000);

        driver.navigate().forward();
        Thread.sleep(2000);

        driver.quit();
    }
}
