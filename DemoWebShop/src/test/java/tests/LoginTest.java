package tests;


import Base.BaseClass;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends BaseClass {

        @Test
        public void verifyValidLogin() {

            HomePage homePage = new HomePage(driver);

            LoginPage loginPage = homePage.clickLogin();

            loginPage.login("testuser@gmail.com", "Password123");

            Assert.assertTrue(loginPage.isLogoutDisplayed(),
                    "Login Failed");
        }
    }

