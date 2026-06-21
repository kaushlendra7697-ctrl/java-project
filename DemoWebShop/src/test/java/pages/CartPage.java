package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {

        private WebDriver driver;

        public CartPage(WebDriver driver) {
            this.driver = driver;
        }

        private By shoppingCart = By.linkText("Shopping cart");

        public void openCart() {

            driver.findElement(shoppingCart).click();
        }

        public String getCartTitle() {

            return driver.getTitle();
        }
    }

