package SeleniumLearning;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class AT11_DropDownSelect {

    @Test
    public void iframeReg() throws InterruptedException {

        //setup the chromedriver using WebDriverManager
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://echoecho.com/htmlforms11.htm");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //parent which are we are going to select
        // this parent will have children as dropdown items in this case this DropDownList will hold
        // all the dropdown items names
        Select DropDownSelect = new Select(driver.findElement(By.name("dropdownmenu")));
//        // now let get count of children
//        int DropDownSize=DropDownSelect.getOptions().size();
//        System.out.println("DropDownSize : "+DropDownSize);
//        //First Method
//        for(int i=0;i<DropDownSize;i++){
//            String TxtVal = DropDownSelect.getOptions().get(i).getText();
//            System.out.println("TxtVal :"+TxtVal);
//            if(TxtVal.equalsIgnoreCase("Milk")){
//                DropDownSelect.getOptions().get(i).click();
//                break;
//            }
//        }

        //2nd method
       DropDownSelect.selectByVisibleText("Cheese");
        //3rd method -- this is hardcoding -- not recomended
      //  DropDownSelect.selectByIndex(2);
    }
}