package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {

        private WebDriver driver;

        public RegisterPage(WebDriver driver) {
            this.driver = driver;
        }

        private By genderMale = By.id("gender-male");
        private By firstName = By.id("FirstName");
        private By lastName = By.id("LastName");
        private By email = By.id("Email");
        private By password = By.id("Password");
        private By confirmPassword = By.id("ConfirmPassword");
        private By registerButton = By.id("register-button");

        public void registerUser(String fn, String ln,
                                 String mail, String pwd) {

            driver.findElement(genderMale).click();
            driver.findElement(firstName).sendKeys(fn);
            driver.findElement(lastName).sendKeys(ln);
            driver.findElement(email).sendKeys(mail);
            driver.findElement(password).sendKeys(pwd);
            driver.findElement(confirmPassword).sendKeys(pwd);
            driver.findElement(registerButton).click();
        }
    }

