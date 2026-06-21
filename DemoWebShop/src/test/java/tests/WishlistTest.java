package tests;

import Base.BaseClass;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.WishlistPage;

public class WishlistTest extends BaseClass {


        @Test
        public void verifyWishlistPage() {

            WishlistPage wishlist = new WishlistPage(driver);

            wishlist.openWishlist();

            Assert.assertTrue(driver.getTitle().contains("Wishlist"));
        }
    }

