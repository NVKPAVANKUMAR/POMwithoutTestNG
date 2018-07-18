package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private static WebElement element = null;

    public static WebElement txtbx_Username(WebDriver driver) {
        element = driver.findElement(By.className("_2zrpKA"));
        return element;
    }

    public static WebElement txtbx_Password(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@class=\"_2zrpKA _3v41xv\"]"));
        return element;
    }

    public static WebElement txtbx_LoginButton(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@class=\"_2AkmmA _1LctnI _7UHT_c\"]"));
        return element;
    }


}
