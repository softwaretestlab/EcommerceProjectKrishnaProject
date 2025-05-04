package SeleniumLearning;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;
public class AT06_listofLinks {

    @Test
    public void linkList() throws IOException, InterruptedException {
        //setting up chromedriver
        WebDriverManager.chromedriver().setup();
        //we create an object of WebDriver
        WebDriver driver = new ChromeDriver();
        //At this point browser will be opened
        //maximize browser
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Navigate to HN website
        driver.get("https://www.thegoodguys.com.au/UserRegistrationForm?myAcctMain=1&new=Y&catalogId=30000&langId=-1&storeId=900");
        //implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //list of links
        List<WebElement> ListOfLinks= driver.findElements(By.tagName("a"));
        //count of links
        int LinksCount=ListOfLinks.size();
        System.out.println("LinksCount : "+LinksCount);
        //for loop
        for(int i =0;i<LinksCount;i++){
            // if a link has text then print to console
            String LinkName =ListOfLinks.get(i).getText();
            System.out.println(" : "+ LinkName);

            // here we found the url
//            String LinkUrl =ListOfLinks.get(i).getAttribute("href");
//            System.out.println("LinkUrl + LinkName : "+ LinkUrl + "  " + LinkName);
            //if link text matches to my text then it will go into for loop
//            if(LinkName.equalsIgnoreCase("Catalogues")){
//                //once found click on the link
//                ListOfLinks.get(i).click();
//                break;
//
//            }
            //if link text matches to my text then it will go into for loop
            if(LinkName.equalsIgnoreCase("Buying Guides")){
                // as buyers guide is not in focus we have to scroll and then click on the element
                JavascriptExecutor executor2 = (JavascriptExecutor)driver;
                //now click on the matched link
                executor2.executeScript("arguments[0].click();", ListOfLinks.get(i));
                break;
            }

        }
    }
}
