package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SD04_CucumberBackground_01 {

    //Background
    @Given("user is on homepage")
    public void user_is_on_homepage() {
        System.out.println("This is background method");
    }
    //Scenario-1
    @Given("user clicks on account link from homepage")
    public void user_clicks_on_account_link_from_homepage() {
        System.out.println(" this is Given step in scenario-1");
    }
    @Then("user is navigated to Create an Account page")
    public void user_is_navigated_to_create_an_account_page() {
        System.out.println(" this is Then step in scenario-1");
    }
    //Scenario-2
    @Given("user clicks on StoreLocator link from homepage")
    public void user_clicks_on_store_locator_link_from_homepage() {
        System.out.println(" this is Given step in scenario-2");
    }
    @Then("User is navigates to StoreLocator page")
    public void user_is_navigates_to_store_locator_page() {
        System.out.println(" this is Then step in scenario-2");
    }

}
