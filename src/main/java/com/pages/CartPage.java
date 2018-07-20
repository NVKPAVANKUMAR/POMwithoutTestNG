package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CartPage {

    private static WebElement element = null;

    private static WebElement cartSummaryText(WebDriver driver){
        element = driver.findElement(By.className("_1WMqsr"));
        return element;
    }

    private static WebElement removeProductFromCart(WebDriver driver){
        element = driver.findElement(By.xpath("//div[@class=\"gdUKd9\"]/child::span[contains(text(),\"Remove\")]"));
        return element;
    }

    private static WebElement cartSummary(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div[1]/div/div[2]/div/div[1]/a/img\n"));
        return element;
    }

    private static WebElement totalCartValue(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div[2]/div/div/div[1]/div[2]/div[3]/div/div[2]"));
        return element;
    }
    public String getCartSummaryText(WebDriver driver){
        return cartSummaryText(driver).getText();
    }

    public void removeProduct(WebDriver driver){
        removeProductFromCart(driver).click();
    }

    public int getCartSize(WebDriver driver){
        List<WebElement> cart = driver.findElements(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div[1]/div/div[2]/div/div[1]/a/img"));
        return cart.size();
    }

    public String getTotalCartValue(WebDriver driver){
        return (totalCartValue(driver).getText().substring(1));
    }




}
