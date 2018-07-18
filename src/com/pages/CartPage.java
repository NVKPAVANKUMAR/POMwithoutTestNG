package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {

    private static WebElement element = null;

    public static WebElement cartSummaryText(WebDriver driver){
        element = driver.findElement(By.className("_1WMqsr"));
        return element;
    }
}
