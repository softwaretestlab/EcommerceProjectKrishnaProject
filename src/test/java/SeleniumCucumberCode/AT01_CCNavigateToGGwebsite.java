package SeleniumCucumberCode;

import BaseClass.OpenBrowser;
import PropertiesFile.ReadPropertiesFile;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class AT01_CCNavigateToGGwebsite {


    public static void CCNavtoGG() throws IOException, IOException {
        OpenBrowser.NavToWeb(ReadPropertiesFile.PropFile("GGUrl"));
    }
    public static void AssertTitle() {
        String ActualTitle = OpenBrowser.driver.getTitle();
        System.out.println("ActualTitle : "+ActualTitle);
        String ExpectedTitle = "The Good Guys - Online Electrical & Home Appliances";
        Assert.assertEquals(ExpectedTitle,ActualTitle);
    }
}
