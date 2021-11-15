package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends BasePage {
    public AccountPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "username")
    WebElement inputLogin;
    @FindBy(id = "password")
    WebElement inputPassword;
    @FindBy(id = "Login")
    WebElement buttonLogin;

    public void openPage(){
        openPage(BASE_URL);
    }

    public void login(String username, String password) {
        inputLogin.sendKeys(username);
        inputPassword.sendKeys(password);
        buttonLogin.click();
    }
}
