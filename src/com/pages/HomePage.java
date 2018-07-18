package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage {
    private static WebElement element = null;

    public static WebElement searchBox(WebDriver driver) {
        element = driver.findElement(By.name("q"));
        return element;
    }

    public static WebElement searchIcon(WebDriver driver) {
        element = driver.findElement(By.className("_2BhAHa"));
        return element;
    }

    public static WebElement selectFirstProduct(WebDriver driver) {
        element = driver.findElement(By.xpath("//div[.=\"Apple iPhone SE (Space Grey, 32 GB)\"]"));
        return element;
    }

}
