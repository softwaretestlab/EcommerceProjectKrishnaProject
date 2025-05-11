package StepDefinations;

import BaseClass.OpenBrowser;
import PropertiesFile.ReadPropertiesFile;
import SeleniumCucumberCode.AT01_CCNavigateToGGwebsite;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.io.IOException;

public class SD01_NavigateToGGWebsite {
    @Given("open browser and enter url and navigate to GG website")
    public void open_browser_and_enter_url_and_navigate_to_gg_website() throws IOException, IOException {
//        OpenBrowser.NavToWeb(ReadPropertiesFile.PropFile("GGUrl"));

        AT01_CCNavigateToGGwebsite.CCNavtoGG();
    }
    @Then("get title and assert")
    public void get_title_and_assert() {
//        String ActualTitle = OpenBrowser.driver.getTitle();
//        System.out.println("ActualTitle : "+ActualTitle);
//        String ExpectedTitle = "The Good Guys - Online Electrical & Home Appliances";
//        Assert.assertEquals(ExpectedTitle,ActualTitle);
        AT01_CCNavigateToGGwebsite.AssertTitle();
    }

}
