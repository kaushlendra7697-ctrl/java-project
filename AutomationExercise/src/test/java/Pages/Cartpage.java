package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Cartpage {
    WebDriver driver;

    public Cartpage(WebDriver driver) {
        this.driver = driver;
    }

    By deleteBtn = By.className("cart_quantity_delete");

    public void removeProduct() {
        driver.findElement(deleteBtn).click();
    }
}
