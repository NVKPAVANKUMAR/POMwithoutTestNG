import drivers.BrowserInstance;
import pages.CartPage;
import pages.HomePage;
import pages.LoginPage;
import java.io.IOException;



public class test_AddToCart extends BrowserInstance {
    static LoginPage loginPage = new LoginPage();
    static HomePage homePage = new HomePage();
    static CartPage cartPage = new CartPage();

    public static void main(String[] args) throws InterruptedException, IOException {
        initiateDriver("chrome");
        loginPage.doLogin(driver);
        homePage.searchProduct(driver);
        cartPage.clickOnCart(driver);

      //  driver.quit();
    }
}
