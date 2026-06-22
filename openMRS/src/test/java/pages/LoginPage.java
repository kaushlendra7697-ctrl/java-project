package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

        WebDriver driver;

        By username = By.id("username");
        By button1 = By.xpath("//div[@class='-esm-login__footer__footer___2aydd']");
        By password = By.id("password");
        By button2 = By.xpath("//button[@type='submit']");


        public LoginPage(WebDriver driver) {
            this.driver = driver;
        }

        public void login(String user,String pass) {

            driver.findElement(username).sendKeys(user);
            driver.findElement(button1).click();
            driver.findElement(password).sendKeys(pass);
            driver.findElement(button2).click();

        }
}
