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

<<<<<<< HEAD
    @When("^requiered information$")
    public void requieredInformation() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        SignUpPage signUpPage = new SignUpPage(driver);
        signUpPage.go("https://vpeslmwsesb.es.corp.leroymerlin.com:6555/ws/authServiceREST/");
        signUpPage.clickAvanzaButton();
        signUpPage.clickEnlaceAvanzada();
        signUpPage.go("https://store-delivery-web-pre.sales-pre-eslm.tech.adeo.cloud/");
        signUpPage.userInsert(getUserName());
        signUpPage.passInsert(getPassName());
        signUpPage.clickButton();

    }


    //Introducir usuario
    private String getUserName() {
        return "30095945";
    }

    //Introducir contraseña
    private String getPassName() {
        return "Fix2022!";
    }

    @Then("^he should be told$")
    public void heShouldBeTold() {
    }
=======
    @When("connect to page advanced options")
    public void connectToPageAdvancedOptions() {
    }

    @Then("introduced user-pass in SD")
    public void introducedUserPassInSD() {
    }

>>>>>>> main
}