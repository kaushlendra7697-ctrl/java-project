package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    By signupLogin = By.linkText("Signup / Login");
    By products = By.linkText("Products");

    public void clickSignupLogin() {
        driver.findElement(signupLogin).click();
    }

    public void openProducts() {
        driver.findElement(products).click();
    }
}
