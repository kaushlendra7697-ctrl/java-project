package tests;

import base.BaseClass;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;


    public class LoginTest extends BaseClass {

        @Test
        public void verifyLogin() {

            driver.get("https://dev3.openmrs.org/openmrs/spa/login");


            LoginPage loginPage = new LoginPage(driver);

            loginPage.login("admin","Admin123");

            Assert.assertTrue(driver.getCurrentUrl().contains("home"));
        }
}
