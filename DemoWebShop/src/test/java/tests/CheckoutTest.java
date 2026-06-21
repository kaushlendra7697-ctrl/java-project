package tests;

import Base.BaseClass;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.CheckoutPage;

public class CheckoutTest extends BaseClass {

        @Test
        public void verifyCheckoutButton() {

            CartPage cart = new CartPage(driver);

            cart.openCart();

            CheckoutPage checkout = new CheckoutPage(driver);

            checkout.proceedCheckout();

            Assert.assertTrue(driver.getCurrentUrl().contains("login"));
        }
    }

