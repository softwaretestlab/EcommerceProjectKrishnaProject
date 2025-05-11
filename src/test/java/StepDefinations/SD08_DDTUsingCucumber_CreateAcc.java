package StepDefinations;

import SeleniumCucumberCode.AT08_DDT_CreateAnAccount;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.io.IOException;

public class SD08_DDTUsingCucumber_CreateAcc {

    @Given("user navigates to create an account screen")
    public void user_navigates_to_create_an_account_screen() throws IOException {
        AT08_DDT_CreateAnAccount.NavtoCrateAcc();
    }
    @Then("enter data {string},{string},{string}")
    public void enter_data(String FirstName, String LastName, String EmailAddress) {
        AT08_DDT_CreateAnAccount.EnterAccDetails(FirstName,LastName,EmailAddress);

    }
}