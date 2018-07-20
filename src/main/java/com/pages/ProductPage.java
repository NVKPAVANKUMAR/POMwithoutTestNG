package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPage {
    private static WebElement element = null;

    private static WebElement addToCartButton(WebDriver driver) {
        element = driver.findElement(By.xpath("//button[@class=\"_2AkmmA _2Npkh4 _2MWPVK\"]"));
        return element;
    }

    private static WebElement cartIcon(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@id=\"container\"]/div/header/div[1]/div/div/div/div[2]/a/div/span"));
        return element;
    }

    private static WebElement priceText(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div[1]/div/div[2]/div[2]/div[4]/div[1]/div/div[1]"));
        return element;
    }

    public void clickAddToCart(WebDriver driver) {
        addToCartButton(driver).click();
    }

    public void clickOnCartButton(WebDriver driver) {
        cartIcon(driver).click();
    }

    public String getProductPriceText(WebDriver driver) {
        String result = priceText(driver).getText().substring(1);
        return result;
    }
}
