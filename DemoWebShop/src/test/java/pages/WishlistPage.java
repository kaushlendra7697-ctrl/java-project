package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WishlistPage {

        private WebDriver driver;

        public WishlistPage(WebDriver driver) {
            this.driver = driver;
        }

        private By wishlistLink = By.linkText("Wishlist");

        public void openWishlist() {

            driver.findElement(wishlistLink).click();
        }
    }

