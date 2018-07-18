package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPage {
    private static WebElement element = null;

    public static WebElement addToCartButton(WebDriver driver){
        element = driver.findElement(By.xpath("//button[@class=\"_2AkmmA _2Npkh4 _2MWPVK\"]"));
        return element;
    }

    public static WebElement cartIcon(WebDriver driver){
        element = driver.findElement(By.xpath("//*[.=\"My Cart (1)\"]"));
        return element;
    }

}
