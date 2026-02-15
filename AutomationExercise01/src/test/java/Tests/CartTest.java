package Tests;

import Base.BaseClass;
import Pages.CartPage;
import org.testng.annotations.Test;

public class CartTest extends BaseClass {


        @Test
        public void removeFromCart() {
            CartPage cart = new CartPage(driver);
            //cart.removeProduct();
        }
}
