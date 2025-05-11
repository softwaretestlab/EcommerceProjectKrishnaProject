package SeleniumCucumberCode;
import PropertiesFile.ReadPropertiesFile;
import org.junit.Test;
import java.io.IOException;
import BaseClass.OpenBrowser;
import org.openqa.selenium.By;
public class AT08_DDT_CreateAnAccount extends OpenBrowser {

    //this method we are navigating to registration page of the website

    public static void NavtoCrateAcc() throws IOException {
        NavToWeb(ReadPropertiesFile.PropFile("GGCrtAcc"));
    }

    //this method we are entering data
    public static void EnterAccDetails(String FirstName, String LastName, String EmailAddress){
        //FirstName clearned
        driver.findElement(By.id("regAddForm_firstName")).clear();
        //Enter data in FirstName field
        driver.findElement(By.id("regAddForm_firstName")).sendKeys(FirstName);
        //lastname
        driver.findElement(By.id("regAddForm_lastName")).clear();
        driver.findElement(By.id("regAddForm_lastName")).sendKeys(LastName);
        //emailaddress
        driver.findElement(By.id("regAddForm_email1")).clear();
        driver.findElement(By.id("regAddForm_email1")).sendKeys(EmailAddress);

    }

}
