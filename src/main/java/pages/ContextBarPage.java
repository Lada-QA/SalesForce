package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContextBarPage extends BasePage {

    public ContextBarPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = ".//*[@class='slds-icon-waffle_container']")
    WebElement iconContextBar;
    @FindBy(xpath = "//*[contains(@class,'slds-p-horizontal--small')]//*[contains(text(),'View All')]")
    WebElement linkViewAll;
    @FindBy(xpath = "//*[contains(@class,'slds-text-heading--medium')]")
    WebElement textHeading;

    public void clickIconContextBar() {
    actions.click(iconContextBar).build().perform();
    }

    public void clickLinkViewAll() {
        linkViewAll.click();
    }

    public String getTextHeaderModalPage() {
    return textHeading.getText();
    }

}
