package pages;

import base.BaseClass;
import org.openqa.selenium.By;

public class LoginPage extends BaseClass {

    private By loginLink = By.linkText("Signup / Login");
    private By emailField = By.name("email");
    private By passwordField = By.name("password");
    private By loginButton = By.xpath("//button[text()='Login']");
    private By loggedInText = By.xpath("//a[contains(text(),'Logged in as')]");
    private By logoutButton= By.xpath("//a[normalize-space()='Logout']");

    public void navigateToLogin() {
        driver.findElement(loginLink).click();
    }

    public void enterEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }

    public boolean isUserLoggedIn() {
        return driver.findElement(loggedInText).isDisplayed();

    }
    public void clickLogout(){
        driver.findElement(logoutButton).click();
    }
}