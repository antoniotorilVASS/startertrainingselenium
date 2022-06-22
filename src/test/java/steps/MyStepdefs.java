package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobject.SignUpPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class MyStepdefs {
    @Given("^user wants to have account$")
    public void userWantsToHaveAccount() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        SignUpPage signUpPage = new SignUpPage(driver);
        signUpPage.go("http://demo.automationtesting.in/Register.html");
        signUpPage.writeFirstName("Tomaa!!!");
        driver.close(); //closes the browser
    }

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
        return "30094971";
    }

    //Introducir contraseña
    private String getPassName() {
        return "P3F3.hp6*L8\"X%/";
    }

    @Then("^he should be told$")
    public void heShouldBeTold() {
    }
}