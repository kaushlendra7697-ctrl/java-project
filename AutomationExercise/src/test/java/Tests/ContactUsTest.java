package Tests;

import Base.BaseClass;
import Pages.ContactUsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactUsTest extends BaseClass {
    @Test
    public void contactUsFormTest() {
        ContactUsPage contact = new ContactUsPage(driver);
        contact.submitContactForm("KK", "kk@test.com", "Query", "Test message");
      //  Assert.assertTrue(driver.getPageSource().contains("Success"));
    }
}
