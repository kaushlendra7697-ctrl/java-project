package Tests;

import Base.BaseClass;
import Pages.Cartpage;
import org.testng.annotations.Test;

public class CartTest extends BaseClass {


        @Test
        public void removeFromCart() {
            Cartpage cart = new Cartpage(driver);
            //cart.removeProduct();
        }
}
