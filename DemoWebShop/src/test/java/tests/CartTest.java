package tests;


import Base.BaseClass;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.ProductPage;

public class CartTest extends BaseClass {

        @Test
        public void verifyAddToCart() {

            driver.get("https://demowebshop.tricentis.com/books");

            ProductPage productPage = new ProductPage(driver);

            productPage.addProductToCart();

            CartPage cartPage = new CartPage(driver);

            cartPage.openCart();

            Assert.assertTrue(cartPage.getCartTitle().contains("Shopping Cart"));
        }
    }

