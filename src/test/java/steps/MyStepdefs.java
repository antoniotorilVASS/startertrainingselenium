package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.MainPageServices;

import java.time.Duration;

import static util.HookDriver.driver;

public class MyStepdefs {

    MainPageServices mainPage = new MainPageServices(driver);
    @Given("login to page")
    public void loginToPage() {
        mainPage.go("http://localhost:8080/");
    }

    @When("login to page <user> as {string}")
    public void loginToPageUserAs(String user) {
        mainPage.userInsert(user);
    }

    @Then("login to page <pass> as {string}")
    public void loginToPagePassAs(String pass) {
        mainPage.passInsert(pass);
    }

    @And("click to login button")
    public void clickToLoginButton() {
        mainPage.clickButtonPingIdLogin();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
    }

    @When("introduce <date> as {string}")
    public void intrucedDateAs(String textoFecha) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
        mainPage.campoFecha(textoFecha);
    }

    @Then("select date")
    public void selectDate() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
        mainPage.clickBotonSelecionarFechas();
    }

    @And("click button DownloadExcel")
    public void clickButtonDownloadExcel() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
        mainPage.clickBotonDescargar();
    }
}
