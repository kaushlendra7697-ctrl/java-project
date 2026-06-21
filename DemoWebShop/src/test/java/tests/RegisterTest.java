package tests;

import Base.BaseClass;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.RegisterPage;

public class RegisterTest extends BaseClass {

        @Test
        public void verifyRegistration() {

            HomePage homePage = new HomePage(driver);

            RegisterPage registerPage = homePage.clickRegister();

            String email = "user" + System.currentTimeMillis() + "@gmail.com";

            registerPage.registerUser("John", "Smith", email, "Password123");
        }
    }

