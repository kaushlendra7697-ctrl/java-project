package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PimPage {
    WebDriver driver;

    By pimMenu = By.xpath("//span[text()='PIM']");
    By addBtn = By.xpath("//button[text()=' Add ']");
    By firstName = By.name("firstName");
    By lastName = By.name("lastName");
    By saveBtn = By.xpath("//button[@type='submit']");

    public PimPage(WebDriver driver) {
        this.driver = driver;
    }

    public void addEmployee() {
        driver.findElement(pimMenu).click();
        driver.findElement(addBtn).click();
        driver.findElement(firstName).sendKeys("John");
        driver.findElement(lastName).sendKeys("Doe");
        driver.findElement(saveBtn).click();
    }
}
