package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class HomePage {
    private static WebElement element = null;

    private static WebElement searchBox(WebDriver driver) {
        element = driver.findElement(By.name("q"));
        return element;
    }

    private static WebElement searchIcon(WebDriver driver) {
        element = driver.findElement(By.className("_2BhAHa"));
        return element;
    }

    private static WebElement firstProductTile(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[2]/div[1]/div[2]/div/div/div/div/a/div[2]/div[1]/div/div"));
        return element;
    }

    public void enterTxtInSearchbox(WebDriver driver,String searchText){
        searchBox(driver).sendKeys(searchText);
    }

    public void clickSearchIcon(WebDriver driver){
        searchIcon(driver).click();
    }

    public void clickFirstProductTile(WebDriver driver){
        firstProductTile(driver).click();
    }

}
