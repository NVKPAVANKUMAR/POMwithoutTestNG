package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private static WebElement element = null;

    private static WebElement txtbx_Username(WebDriver driver) {
        element = driver.findElement(By.className("_2zrpKA"));
        return element;
    }

    private static WebElement txtbx_Password(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@class=\"_2zrpKA _3v41xv\"]"));
        return element;
    }

    private static WebElement loginButton(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@class=\"_2AkmmA _1LctnI _7UHT_c\"]"));
        return element;
    }

    public void enterUsername(WebDriver driver,String username){
        txtbx_Username(driver).sendKeys(username);
    }

    public void enterPassword(WebDriver driver,String password){
        txtbx_Password(driver).sendKeys(password);
    }

    public void clickLogin(WebDriver driver){
        loginButton(driver).click();

    }

}
