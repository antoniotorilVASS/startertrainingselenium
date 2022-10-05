package pageobject;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@Getter
public class MainPageObject {

    @FindBy(xpath = "//input[@id='username']")
    private WebElement userInsert;
    @FindBy(xpath = "//input[@id='my_password']")
    private WebElement passInsert;
    @FindBy(xpath = "//button[@id='my_sign_on_button']")
    private WebElement clickButtonPingIdLogin;
    @FindBy(name = "date")
    private WebElement textoFecha;
    @FindBy(css = ".mx-datepicker-btn")
    private WebElement botonSelecionarFechas;
    @FindBy(xpath = "//button[@class='button negative xlsx']")
    private WebElement botonDescargarExcel;

    public MainPageObject(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}