package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactUsFormWithoutMandatoryField {
    WebDriver driver;

    public ContactUsFormWithoutMandatoryField(WebDriver driver) {
        this.driver = driver;
    }

    By contactUs = By.linkText("Contact us");
    By name = By.name("name");
    By email = By.name("email");
    By message = By.id("message");
    By submitBtn = By.name("submit");

    public void submitContactForm(String user, String mail, String msg) {
        driver.findElement(contactUs).click();
        driver.findElement(name).sendKeys(user);
        driver.findElement(email).sendKeys(mail);
        driver.findElement(message).sendKeys(msg);
        driver.findElement(submitBtn).click();
    }
}
