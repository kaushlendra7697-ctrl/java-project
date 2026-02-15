package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignupPage {
    WebDriver driver;

    public SignupPage(WebDriver driver) {
        this.driver = driver;
    }

    By name = By.name("name");
    By email = By.xpath("//input[@data-qa='signup-email']");
    By signupBtn = By.xpath("//button[text()='Signup']");

    public void signup(String user, String mail) {
        driver.findElement(name).sendKeys(user);
        driver.findElement(email).sendKeys(mail);
        driver.findElement(signupBtn).click();
    }
}
