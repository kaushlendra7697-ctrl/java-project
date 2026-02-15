package Tests;

import Base.BaseClass;
import Pages.CategoryNavigationPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CategoryNavigationTest extends BaseClass {
    @Test
    public void categoryNavigationTest() {
        CategoryNavigationPage category = new CategoryNavigationPage(driver);
        category.openWomenDressCategory();
       // Assert.assertTrue(driver.getPageSource().contains("WOMEN"));
    }
}
