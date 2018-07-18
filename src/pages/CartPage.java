package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class CartPage {

    public void clickOnCart(WebDriver driver){
        driver.findElement(By.name("_1jJkOg")).click();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        String numberInCart= driver.findElement(By.className("_1WMqsr")).getText();
        assert numberInCart.equalsIgnoreCase("My Cart (1)");
    }
}
