import drivers.BrowserInstance;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.DemoDashboardPage;
import pages.DemoLoginPage;
import utility.ConfigParser;

import java.io.IOException;

public class test_demoLogin extends BrowserInstance {


    public static void main(String[] args) throws IOException, InterruptedException {
        initiateDriver("chrome");
        driver.get(ConfigParser.fetchProperity("demologinurl").toString());
        DemoLoginPage loginPage = new DemoLoginPage(driver);
        loginPage.getUsername().sendKeys(ConfigParser.fetchProperity("demologinusername").toString());
        loginPage.getPassword().sendKeys(ConfigParser.fetchProperity("demologinpassword").toString());
        loginPage.getLoginButton().click();
        DemoDashboardPage demoDashboardPage = new DemoDashboardPage(driver);
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOf(demoDashboardPage.getLogoutButton()));
        demoDashboardPage.getLogoutButton().click();
        driver.quit();
    }
}
