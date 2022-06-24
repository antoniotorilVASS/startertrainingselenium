package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.MainPageServices;
import util.HookDriver;

public class MyStepdefs {
    @Given("link to test page")
    public void linkToTestPage() {
        MainPageServices mainPage = new MainPageServices(HookDriver.driver);
    }

    @When("connect to page advanced options")
    public void connectToPageAdvancedOptions() {
    }

    @Then("introduced user-pass in SD")
    public void introducedUserPassInSD() {
    }

}