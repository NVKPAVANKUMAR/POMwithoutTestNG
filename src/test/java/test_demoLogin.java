import drivers.BrowserInstance;
import pages.DemoDashboardPage;
import pages.DemoLoginPage;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class test_demoLogin extends BrowserInstance {


    public static void main(String[] args) throws IOException, InterruptedException {
        initiateDriver("chrome");
        driver.get("https://demo.silverstripe.org/Security/login?BackURL=%2Fadmin%2Fpages%2F");
        DemoLoginPage loginPage = new DemoLoginPage(driver);
        loginPage.getUsername().sendKeys("admin");
        loginPage.getPassword().sendKeys("password");
        loginPage.getLoginButton().click();
        DemoDashboardPage demoDashboardPage = new DemoDashboardPage(driver);
        Thread.sleep(2000);
        demoDashboardPage.getLogoutButton().click();
        driver.quit();
    }
}
