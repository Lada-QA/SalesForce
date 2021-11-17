package pages;

import elements.InputField;
import elements.TextArea;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewAccountModalPage extends BasePage {

    public NewAccountModalPage(WebDriver driver) {
        super(driver);
    }

    public static final String NEW_ACCOUNT_URL = "/lightning/o/Account/new";

    @FindBy(xpath = "//*[contains(@class,'forceActionButton')]//*[text()='Save']")
    WebElement saveButtonXpath;

    public void create(String accountName, String webSite) {
        new InputField(driver, "Account Name").writeText(accountName);
        new InputField(driver, "Website").writeText(webSite);
    }

    public void createTextArea(String description, String billingStreet, String shippingStreet) {
        new TextArea(driver, "Description").writeText(description);
        new TextArea(driver, "Billing Street").writeText(billingStreet);
        new TextArea(driver, "Shipping Street").writeText(shippingStreet);
        clickSave();
    }

    public void clickSave() {
        saveButtonXpath.click();
    }

    public void openPage() {
        openPage(BASE_URL + NEW_ACCOUNT_URL);
    }

}