package Tests;

import Base.BaseClass;
import Pages.HomePage;
import Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends BaseClass {


        @Test
        public void validLogin() {
            HomePage home = new HomePage(driver);
            home.clickSignupLogin();

            LoginPage login = new LoginPage(driver);
            login.login("userkk@gmail.com", "password123");

           // Assert.assertTrue(driver.getPageSource().contains("Logged in as"));
        }
    }

