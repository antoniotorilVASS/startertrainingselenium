package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpPage {
    private final WebDriver driver;
    private final By firsTbox = By.xpath("//input[@placeholder='First Name']");
    private final By userInsert = By.xpath("//input[@id='userName']");
    private final By passInsert = By.xpath("//input[@id='userPassword']");
    private final By clickButton = By.xpath("//button[@class='login-btn']");
    private final By clickAvanzaButton = By.xpath("//*[@id=\"details-button\"]");
    private final By clickEnlaceAvanzada = By.xpath("//*[@id=\"proceed-link\"]");

    public SignUpPage(WebDriver driver) {
        this.driver = driver;
    }

    public void go(String url) {
        this.driver.get(url);
    }

    public void writeFirstName(String firstname) {
        this.driver.findElement(this.firsTbox).sendKeys(firstname);
    }

    public void userInsert(String userName) {
        this.driver.findElement(this.userInsert).sendKeys(userName);
    }

    public void passInsert(String passName) {
        this.driver.findElement(this.passInsert).sendKeys(passName);
    }

    public void clickButton() {
        this.driver.findElement(this.clickButton).click();
    }

    public void clickAvanzaButton() {
        this.driver.findElement(this.clickAvanzaButton).click();
    }

    public void clickEnlaceAvanzada() {
        this.driver.findElement(this.clickEnlaceAvanzada).click();
    }
}