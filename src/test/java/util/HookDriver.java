package util;

import io.cucumber.java.Before;
import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobject.MainPageServices;

public class HookDriver {
    public static WebDriver driver;

    @Before
    public static void createDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        driver = new ChromeDriver();
        MainPageServices mainPage = new MainPageServices(HookDriver.driver);
        mainPage.go("https://vpeslmwsesb.es.corp.leroymerlin.com:6555/ws/authServiceREST/");
        mainPage.clickAvanzaButton();
        mainPage.clickEnlaceAvanzada();
        mainPage.go("https://store-delivery-web-pre.sales-pre-eslm.tech.adeo.cloud/");
    }

    @After
    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver.close();
        }
    }
}