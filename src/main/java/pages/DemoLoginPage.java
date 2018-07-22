package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DemoLoginPage {

    private WebDriver driver;
    private WebElement username;
    private WebElement password;
    private WebElement loginButton;


    public DemoLoginPage(WebDriver driver) {
        this.driver = driver;
        this.username = driver.findElement(By.id("MemberLoginForm_LoginForm_Email"));
        this.password = driver.findElement(By.id("MemberLoginForm_LoginForm_Password"));
        this.loginButton = driver.findElement(By.id("MemberLoginForm_LoginForm_action_doLogin"));
    }

    private WebElement getUsername() {
        return username;
    }

    public void setUsername(WebElement username) {
        this.username = username;
    }

    private WebElement getPassword() {
        return password;
    }

    public void setPassword(WebElement password) {
        this.password = password;
    }

    private WebElement getLoginButton() {
        return loginButton;
    }

    public void setLoginButton(WebElement loginButton) {
        this.loginButton = loginButton;
    }

    public void enterUsernameText(String username){
        getUsername().sendKeys(username);
    }

    public void enterPasswordText(String password){
        getPassword().sendKeys(password);
    }

    public void clickLoginButton(){
        getLoginButton().click();
    }

}
