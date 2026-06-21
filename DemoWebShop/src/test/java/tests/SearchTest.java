package tests;

import Base.BaseClass;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SearchPage;


public class SearchTest extends BaseClass {

        @Test
        public void verifyProductSearch() {

            HomePage homePage = new HomePage(driver);

            homePage.searchProduct("Laptop");

            SearchPage searchPage = new SearchPage(driver);

            Assert.assertTrue(searchPage.searchResultDisplayed());
        }
    }

