package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {


        private WebDriver driver;

        public LoginPage(WebDriver driver) {
            this.driver = driver;
        }

        private By email = By.id("Email");
        private By password = By.id("Password");
        private By loginBtn = By.xpath("//input[@value='Log in']");
        private By logoutLink = By.linkText("Log out");

        public void login(String username, String pwd) {
            driver.findElement(email).sendKeys(username);
            driver.findElement(password).sendKeys(pwd);
            driver.findElement(loginBtn).click();
        }

        public boolean isLogoutDisplayed() {
            return driver.findElement(logoutLink).isDisplayed();
        }
    }

