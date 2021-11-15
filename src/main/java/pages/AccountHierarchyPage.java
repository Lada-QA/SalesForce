package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountHierarchyPage extends BasePage {

    public AccountHierarchyPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//button[contains(@class,'slds-button')]//*[text()='View Account Hierarchy']")
    WebElement buttonViewAccountHierarchy;
    @FindBy(linkText = "Automation Account")
    WebElement testAccount;

    public void clickButtonViewAccountHierarchy() {
        waitForElementLocated(buttonViewAccountHierarchy, 10);
        actions.click(buttonViewAccountHierarchy).build().perform();
    }

    public String addNewAutomationAccount() {
        waitForElementLocated(testAccount, 10);
        return testAccount.getText();
    }
}
