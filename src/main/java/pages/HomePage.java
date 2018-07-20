package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class HomePage {
    public void searchProduct(WebDriver driver) throws InterruptedException {
        driver.findElement(By.name("q")).sendKeys("iphone");
        driver.findElement(By.className("_2BhAHa")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div[.=\"Apple iPhone SE (Space Grey, 32 GB)\"]")).click();
        Thread.sleep(2000);
        WebElement addToCartButton = driver.findElement(By.cssSelector("#container > div > div:nth-child(2) > div > div > div._1GRhLX._3N5d1n > div > div._3S6yHr._1i2f2k > div._1k1QCg._3QNwd7 > ul > li:nth-child(1) > button"));
        JavascriptExecutor executor = ((JavascriptExecutor) driver);
        executor.executeScript("arguments[0].scrollIntoView(true);", addToCartButton);
        addToCartButton.click();


    }
}
