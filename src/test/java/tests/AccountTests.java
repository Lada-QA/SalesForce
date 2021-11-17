package tests;

import org.testng.Assert;
import org.testng.annotations.Test;


public class AccountTests extends BaseTest {

    @Test
    public void createAccountTest() {
        accountPage.openPage();
        accountPage.login("lada-pjfg@force.com","Gq2KPsXekAb*ySd%");
        newAccountModalPage.openPage();
        newAccountModalPage.create("Automation Account", "www.tut.by");
        newAccountModalPage.createTextArea("no cash", "Tverskaya street.22, app.12",
                "1234 Main Street, Apartment 101");
        accountHierarchyPage.clickButtonViewAccountHierarchy();
        Assert.assertEquals(accountHierarchyPage.getAddedNewAutomationAccount(),"Automation Account");
    }

    @Test
    public void usingIconContextBarModalPageTest() {
        accountPage.openPage();
        accountPage.login("lada-pjfg@force.com","Gq2KPsXekAb*ySd%");
        contextBarPage.clickIconContextBar();
        contextBarPage.clickLinkViewAll();
        Assert.assertEquals(contextBarPage.getTextHeaderModalPage(), "App Launcher");
    }
}