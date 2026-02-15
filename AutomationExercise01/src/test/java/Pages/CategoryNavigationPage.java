package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CategoryNavigationPage {
    WebDriver driver;

    public CategoryNavigationPage(WebDriver driver) {
        this.driver = driver;
    }

    By womenCategory = By.xpath("//a[@href='#Women']");
    By dressSubCategory = By.xpath("//a[text()='Dress ']");

    public void openWomenDressCategory() {
        driver.findElement(womenCategory).click();
        driver.findElement(dressSubCategory).click();
    }
}
