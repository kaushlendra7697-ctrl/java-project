package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {

        private WebDriver driver;

        public ProductPage(WebDriver driver) {
            this.driver = driver;
        }

        private By addToCart =
                By.xpath("(//input[contains(@value,'Add to cart')])[1]");

        public void addProductToCart() {

            driver.findElement(addToCart).click();
        }
    }

