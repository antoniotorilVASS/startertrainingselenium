package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.MainPageServices;
import util.HookDriver;

public class MyStepdefs {
    @Given("link to test page")
    public void linkToTestPage() {
        /*MainPageServices mainPage = new MainPageServices(HookDriver.driver);
        mainPage.go("http://demo.automationtesting.in/Register.html");
        mainPage.writeFirstName("Tomaa!!!");*/

        MainPageServices mainPage = new MainPageServices(HookDriver.driver);
        mainPage.userInsert(getUserName());
        mainPage.passInsert(getPassName());
        mainPage.clickButton();

        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @When("connect to page advanced options")
    public void connectToPageAdvancedOptions() {
    }

    @Then("introduced user-pass in SD")
    public void introducedUserPassInSD() {
    }

    private String getUserName() {
        return "30094971";
    }

    private String getPassName() {
        return "P3F3.hp6*L8\"X%/";
    }
}