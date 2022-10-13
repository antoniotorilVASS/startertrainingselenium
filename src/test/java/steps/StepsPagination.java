package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.MainPageServices;

import static util.HookDriver.driver;

public class StepsPagination {

    MainPageServices mainPage = new MainPageServices(driver);

    @When("visit almacen <page> as {string}")
    public void visitAlmacenPageAs(String url) {
        mainPage.go(url);
    }

    @Then("pulse number pagination")
    public void pulseNumberPagination() {
        mainPage.clickButtonTwoPagination();
    }

    @And("check button back pagination")
    public void checkButtonBackPagination() {
        try {
            mainPage.clickButtonBackPage();
        } catch (Exception e) {
            System.out.println("No more pages exist");
        }
    }

    @And("check button next pagination")
    public void checkButtonNextPagination() {
        try {
            mainPage.clickButtonNextPage();
            mainPage.clickButtonNextPage();
            mainPage.clickButtonNextPage();
        } catch (Exception e) {
            System.out.println("No more pages exist");
        }
    }
}
