package pageobject;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@Getter
public class MainPageObject {

    @FindBy(xpath = "//input[@placeholder='First Name']")
    private WebElement firsTbox;
    @FindBy(xpath = "//input[@id='userName']")
    private WebElement userInsert;
    @FindBy(xpath = "//input[@id='userPassword']")
    private WebElement passInsert;
    @FindBy(xpath = "//button[@class='login-btn']")
    private WebElement clickButton;
    @FindBy(xpath = "//*[@id=\"details-button\"]")
    private WebElement clickAvanzaButton;
    @FindBy(xpath = "//*[@id=\"proceed-link\"]")
    private WebElement clickEnlaceAvanzada;

    public MainPageObject(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

}