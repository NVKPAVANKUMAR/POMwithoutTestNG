package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class LoginPage {

    public void doLogin(WebDriver driver) throws InterruptedException {
        driver.get("https://www.flipkart.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.className("_2zrpKA")).sendKeys("npavankumar144@gmail.com");
        driver.findElement(By.xpath("//*[@class=\"_2zrpKA _3v41xv\"]")).sendKeys("omsairam");
        driver.findElement(By.xpath("//*[@class=\"_2AkmmA _1LctnI _7UHT_c\"]")).click();
        Thread.sleep(5000);


        WebElement electronics = driver.findElement(By.xpath("//*[@id=\"container\"]/div/header/div[3]/ul/li[1]/a/span"));
        WebElement samsung = driver.findElement(By.xpath("//*[@id=\"container\"]/div/header/div[3]/ul/li[1]/ul/li/ul/li[1]/ul/li[2]/a/span"));

        Actions action = new Actions(driver);
        action.moveToElement(electronics).perform();
        Thread.sleep(3000);
        action.moveToElement(samsung).click().perform();
        List<WebElement> viewAllList = driver.findElements(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div[3]/div/div/div/div/div/div/a"));
        System.out.println(viewAllList.size());
        Random rand = new Random();
        int value = rand.nextInt(viewAllList.size());
        System.out.println(value);
        viewAllList.get(value).click();
        List<WebElement> productList = driver.findElements(By.xpath("//*[@id=\"container\"]/div/div[1]/div[2]/div/div[2]/div/div/div/div/a/div[2]/div[1]/div[1]"));
        System.out.println(productList.size());
        Random random = new Random();
        int value1 = random.nextInt(productList.size());
        System.out.println(value1);
        productList.get(value1).click();

    }
}
