package pages;

import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utils.DriverFactory;

public class DashboardPage {
    WebDriver driver;

    // Dashboard header / unique element
    By dashboardHeader = By.xpath("//h6[text()='Dashboard']");

    // Main menu items
    By pimMenu = By.xpath("//span[text()='PIM']");
    By adminMenu = By.xpath("//span[text()='Admin']");
    By leaveMenu = By.xpath("//span[text()='Leave']");

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    // Verify user is on Dashboard
    public boolean isDashboardDisplayed() {
        return driver.findElement(dashboardHeader).isDisplayed();
    }

    // Navigate to PIM module
    public void clickOnPIM() {
        driver.findElement(pimMenu).click();
    }

}
