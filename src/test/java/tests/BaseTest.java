package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import pages.AccountHierarchyPage;
import pages.AccountPage;
import pages.ContextBarPage;
import pages.NewAccountModalPage;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    WebDriver driver;
    NewAccountModalPage newAccountModalPage;
    AccountPage accountPage;
    AccountHierarchyPage accountHierarchyPage;
    ContextBarPage contextBarPage;

    @BeforeMethod
    public void initTest() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        newAccountModalPage = new NewAccountModalPage(driver);
        accountPage = new AccountPage(driver);
        accountHierarchyPage = new AccountHierarchyPage(driver);
        contextBarPage = new ContextBarPage(driver);
    }
}
