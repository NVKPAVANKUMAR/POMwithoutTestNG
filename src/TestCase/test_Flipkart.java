package TestCase;

import com.pages.CartPage;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.pages.ProductPage;
import com.utility.ConfigParser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class test_Flipkart {
    private static WebDriver driver = null;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "DriverJars/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.flipkart.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        LoginPage.txtbx_Username(driver).sendKeys(ConfigParser.fetchProperity("username").toString());
        LoginPage.txtbx_Password(driver).sendKeys(ConfigParser.fetchProperity("password").toString());
        LoginPage.txtbx_LoginButton(driver).click();
        System.out.println(" Login Successfully, now it is the time to Search.");
        Thread.sleep(3000);
        HomePage.searchBox(driver).sendKeys("Iphone");
        HomePage.searchIcon(driver).click();
        HomePage.selectFirstProduct(driver).click();
        Set<String> st = driver.getWindowHandles();
        Iterator<String> it = st.iterator();
        String parent = it.next();
        String child = it.next();
        driver.switchTo().window(child);
        Thread.sleep(1000);
        ProductPage.addToCartButton(driver).click();
        ProductPage.cartIcon(driver).click();
        String cartSummaryText = CartPage.cartSummaryText(driver).getText();
        assert cartSummaryText.equalsIgnoreCase("My Cart (1)");
        driver.quit();


    }
}
