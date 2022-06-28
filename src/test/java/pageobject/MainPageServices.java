package pageobject;

import org.openqa.selenium.WebDriver;

public class MainPageServices {

    private WebDriver driver;

    private MainPageObject mainPageObject;

    public MainPageServices(WebDriver driver) {
        this.driver = driver;
        mainPageObject = new MainPageObject(driver);
    }

    public void go(String url) {
        this.driver.get(url);
    }

    public void writeFirstName(String firstname) {
        this.mainPageObject.getFirsTbox().sendKeys(firstname);
    }

    public void userInsert(String userName) {
        this.mainPageObject.getUserInsert().sendKeys(userName);
    }

    public void passInsert(String passName) {
        this.mainPageObject.getPassInsert().sendKeys(passName);
    }

    public void clickButton() {
        this.mainPageObject.getClickButton().click();
    }

    public void clickAvanzaButton() {
        this.mainPageObject.getClickAvanzaButton().click();
    }

    public void clickEnlaceAvanzada() {
        this.mainPageObject.getClickEnlaceAvanzada().click();
    }


}
