package pageobject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MainPageServices {
    private final WebDriver driver;
    private final MainPageObject mainPageObject;

    public MainPageServices(WebDriver driver) {
        this.driver = driver;
        mainPageObject = new MainPageObject(driver);
    }

    public void go(String url) {
        this.driver.get(url);
    }

    public void userInsert(String userName) {
        this.mainPageObject.getUserInsert().sendKeys(userName);
    }

    public void passInsert(String passName) {
        this.mainPageObject.getPassInsert().sendKeys(passName);
    }

    public void clickButtonPingIdLogin() {
        this.mainPageObject.getClickButtonPingIdLogin().click();
    }

    public void clickBotonSelecionarFechas() {
        this.mainPageObject.getBotonSelecionarFechas().click();
    }

    public void clickBotonDescargar() {
        this.mainPageObject.getBotonDescargarExcel().click();
    }

    public void campoFecha(String textoFecha) {
        WebElement element = this.mainPageObject.getTextoFecha();
        Actions builder = new Actions(driver);
        builder.doubleClick(element).perform();
        element.sendKeys(Keys.chord(Keys.CONTROL, "a"), textoFecha);
    }
}