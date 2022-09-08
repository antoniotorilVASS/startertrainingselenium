package util;

import io.cucumber.java.Before;
import lombok.val;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobject.MainPageServices;

import javax.swing.*;
import java.time.Duration;

public class HookDriver {
    public static WebDriver driver;

    @Before
    public static void createDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        driver = new ChromeDriver();
        MainPageServices mainPage = new MainPageServices(HookDriver.driver);
        mainPage.go("http://localhost:8080/login");
        val user = pedirUser();
        val pass = pedirPass();
        mainPage.userInsert(user);
        mainPage.passInsert(pass);
        mainPage.clickButtonPingIdLogin();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
        mainPage.campoFecha();
        mainPage.clickBotonSelecionarFechas();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
        mainPage.clickBotonDescargar();

    }

    private static String pedirUser() {
        JFrame jFrame = new JFrame();
        return JOptionPane.showInputDialog(jFrame, "Enter your user");
    }

    private static String pedirPass() {
        JFrame jFrame = new JFrame();
        return JOptionPane.showInputDialog(jFrame, "Enter your pass");
    }
}