package Tests;

import Base.BaseClass;
import Pages.HomePage;
import Pages.SignupPage;
import org.testng.annotations.Test;

public class SignupTestes extends BaseClass {

        @Test
        public void signupTest() {
            HomePage home = new HomePage(driver);
            home.clickSignupLogin();

            SignupPage signup = new SignupPage(driver);
            signup.signup("NewUser", "newuser123@gmail.com");
        }
}
