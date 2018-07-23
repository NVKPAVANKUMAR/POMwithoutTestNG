import drivers.BrowserInstance;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.DemoDashboardPage;
import pages.DemoLoginPage;
import utility.ConfigParser;

import java.io.IOException;

public class test_demoLogin extends BrowserInstance {


    public static void main(String[] args) throws IOException, InterruptedException {
        initiateDriver(ConfigParser.fetchProperity("browsername").toString());
        driver.get(ConfigParser.fetchProperity("demologinurl").toString());
        DemoLoginPage loginPage = new DemoLoginPage(driver);
        loginPage.enterUsernameText(ConfigParser.fetchProperity("demologinusername").toString());
        loginPage.enterPasswordText(ConfigParser.fetchProperity("demologinpassword").toString());
        loginPage.clickLoginButton();
        DemoDashboardPage demoDashboardPage = new DemoDashboardPage(driver);
        Thread.sleep(2000);
        demoDashboardPage.clickLogoutButton();
        driver.quit();
    }
}
