package stepdefintions;

import io.cucumber.java.en.*;
import org.testng.Assert;
import pages.LoginPage;

public class stepdef {

    LoginPage loginPage = new LoginPage();

    @Given("User is on login page")
    public void user_on_login_page() {
        loginPage.navigateToLogin();
    }

    @When("User enters email and password")
    public void enter_credentials() {
        loginPage.enterEmail("testuser12345@gmail.com");
        loginPage.enterPassword("Test@123");
    }

    @When("User clicks login button")
    public void click_login() {
        loginPage.clickLogin();
    }

    @Then("User should be logged in successfully")
    public void verify_login() {
        Assert.assertTrue(loginPage.isUserLoggedIn());
    }

    @Then("User should be log out Successfully")
    public void userShouldBeLogOutSuccessfully() {
            loginPage.clickLogout();
    }
}