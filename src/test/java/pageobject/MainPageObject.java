package pageobject;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@Getter
public class MainPageObject {

    @FindBy(xpath = "//input[@id='userName']")
    private WebElement userInsert;
    @FindBy(xpath = "//input[@id='userPassword']")
    private WebElement passInsert;
    @FindBy(xpath = "//button[@class='login-btn']")
    private WebElement clickButtonPingIdLogin;
    @FindBy(name = "date")
    private WebElement textoFecha;
    @FindBy(css = ".mx-datepicker-btn")
    private WebElement botonSelecionarFechas;
    @FindBy(xpath = "//button[@class='button negative xlsx']")
    private WebElement botonDescargarExcel;
	@FindBy(xpath="//div[normalize-space()='2']")
	private WebElement paginationTwo;
	@FindBy(css=".icon-arrowLeft")
	private WebElement buttonBackPage;
	@FindBy(css=".icon-arrowRight")
	private WebElement buttonNextPage;

	@FindBy(xpath="//span[@class='icon-menu-hamburger']")
	private WebElement hamburguer;

	@FindBy(xpath="//label[normalize-space()='Almacén']")
	private WebElement almacen;







    public MainPageObject(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}