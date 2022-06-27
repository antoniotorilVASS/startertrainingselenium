package util;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import lombok.val;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobject.MainPageServices;

import javax.swing.*;

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
        val user = pedirUser();
        val pass = pedirPass();
        mainPage.userInsert(user);
        mainPage.passInsert(pass);
        mainPage.clickButton();
    }

    private static String pedirUser() {
        JFrame jFrame = new JFrame();
        return JOptionPane.showInputDialog(jFrame, "Enter your user");
    }

    private static String pedirPass() {
        JFrame jFrame = new JFrame();
        return JOptionPane.showInputDialog(jFrame, "Enter your pass");
    }

    @After
    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
        }
    }
}