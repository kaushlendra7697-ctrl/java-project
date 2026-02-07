package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.LoginPage;
import utils.DriverFactory;

public class LoginSteps {
    @Given("user is on OrangeHRM login page")
    public void openLoginPage() {
        DriverFactory.initDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @When("user logs in with valid credentials")
    public void login() {
        new LoginPage(DriverFactory.getDriver())
                .login("Admin", "admin123");
    }
}
