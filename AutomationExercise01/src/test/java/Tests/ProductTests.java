package Tests;

import Base.BaseClass;
import Pages.HomePage;
import Pages.ProductsPage;
import org.testng.annotations.Test;

public class ProductTests extends BaseClass {

        @Test
        public void searchProductTest() {
            HomePage home = new HomePage(driver);
            home.openProducts();

            ProductsPage products = new ProductsPage(driver);
            products.searchProduct("JEANS");
        }
}
