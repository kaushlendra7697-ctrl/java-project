package Tests;

import Base.BaseClass;
import Pages.ContactUsFormWthoutMandatoryField;
import Pages.ContactUsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactUsFormWithoutMandatoryField extends BaseClass {

    @Test
    public void contactUsFormTest() {
        ContactUsFormWthoutMandatoryField contact = new ContactUsFormWthoutMandatoryField(driver);
        contact.submitContactForm("KK", "kk@test.com", "Test message");

    }
}
