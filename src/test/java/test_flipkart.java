import com.pages.CartPage;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.pages.ProductPage;
import com.utility.ConfigParser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.*;
import java.util.concurrent.TimeUnit;

public class test_flipkart {
    private static WebDriver driver = null;
    private static Set<String> set = new LinkedHashSet<String>();
    private static List<String> list = null;
    private static CartPage cartPage = new CartPage();
    private static LoginPage loginPage = new LoginPage();
    private static HomePage homePage = new HomePage();
    private static ProductPage productPage = new ProductPage();
    private static String firstProductPrice, secondProductPrice, cartValue = null;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "DriverJars/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(ConfigParser.fetchProperity("url").toString());
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage.enterUsername(driver, ConfigParser.fetchProperity("username").toString());
        loginPage.enterPassword(driver, ConfigParser.fetchProperity("password").toString());
        loginPage.clickLogin(driver);
        System.out.println(" Login Successfully, now it is the time to Search.");
        Thread.sleep(3000);
        homePage.enterTxtInSearchbox(driver, ConfigParser.fetchProperity("firstsearchitem").toString());
        homePage.clickSearchIcon(driver);
        homePage.clickFirstProductTile(driver);
        set = driver.getWindowHandles();
        list = new ArrayList<String>(set);
        driver.switchTo().window(list.get(1));
        firstProductPrice = productPage.getProductPriceText(driver);
        System.out.println(firstProductPrice);
        Thread.sleep(1000);
        productPage.clickAddToCart(driver);
        productPage.clickOnCartButton(driver);
        Thread.sleep(2000);
        homePage.enterTxtInSearchbox(driver, ConfigParser.fetchProperity("secondsearchitem").toString());
        homePage.clickSearchIcon(driver);
        homePage.clickFirstProductTile(driver);
        set = driver.getWindowHandles();
        list = new ArrayList<String>(set);
        driver.switchTo().window(list.get(2));
        secondProductPrice = productPage.getProductPriceText(driver);
        System.out.println(secondProductPrice);
        Thread.sleep(1000);
        productPage.clickAddToCart(driver);
        Thread.sleep(2000);
        int productCount = cartPage.getCartSize(driver);
        cartValue = cartPage.getTotalCartValue(driver);
        System.out.println(cartValue);
        assert productCount == 2;
        assert Integer.valueOf(firstProductPrice + secondProductPrice) == Integer.valueOf(cartValue);
        Thread.sleep(2000);
        while (productCount > 0) {
            cartPage.removeProduct(driver);
            Thread.sleep(3000);
        }
        assert productCount == 0;
        driver.quit();

    }
}
