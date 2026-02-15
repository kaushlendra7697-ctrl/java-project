package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactUsPage {
    WebDriver driver;

    public ContactUsPage(WebDriver driver) {
        this.driver = driver;
    }

    By contactUs = By.linkText("Contact us");
    By name = By.name("name");
    By email = By.name("email");
    By subject = By.name("subject");
    By message = By.id("message");
    By submitBtn = By.name("submit");

    public void submitContactForm(String user, String mail, String sub, String msg) {
        driver.findElement(contactUs).click();
        driver.findElement(name).sendKeys(user);
        driver.findElement(email).sendKeys(mail);
        driver.findElement(subject).sendKeys(sub);
        driver.findElement(message).sendKeys(msg);
        driver.findElement(submitBtn).click();
    }
}
