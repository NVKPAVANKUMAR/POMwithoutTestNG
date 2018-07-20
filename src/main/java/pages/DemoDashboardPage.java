package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DemoDashboardPage {
    private WebDriver driver;

    private WebElement logoutButton;

    public DemoDashboardPage(WebDriver driver) {
        this.driver = driver;
        this.logoutButton = driver.findElement(By.xpath("//*[@title=\"Log out\"]"));
    }

    public WebElement getLogoutButton() {
        return logoutButton;
    }

    public void setLogoutButton(WebElement logoutButton) {
        this.logoutButton = logoutButton;
    }




}
