package Tests;

import Base.BaseClass;
import org.testng.annotations.Test;

public class ContactUsFormWithoutMandatoryField extends BaseClass {

    @Test
    public void contactUsFormTest() {
        Pages.ContactUsFormWithoutMandatoryField contact = new Pages.ContactUsFormWithoutMandatoryField(driver);
        contact.submitContactForm("KK", "kk@test.com", "Test message");

    }
}
