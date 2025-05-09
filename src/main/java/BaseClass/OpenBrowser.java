package BaseClass;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OpenBrowser {

    public static WebDriver driver;

    public static void NavToWeb(String url){
        //chromedriver setup
        //setting up chromedriver
        WebDriverManager.chromedriver().clearDriverCache().setup();
        //options
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        chromeOptions.addArguments("--start-maximized");
        //we create an object of WebDriver
         driver = new ChromeDriver(chromeOptions);
        //Navigate to HN website
        //  driver.get("C:\\Users\\softw\\IdeaProjects\\EcommerceProjectKrishnaProject\\src\\main\\java\\Resources\\webtablehtml.html");
        driver.get(url);
    }

    public static void CloseBrowser(){
        driver.close();
    }
    public static void QuitDriver(){
        driver.quit();
    }
}
