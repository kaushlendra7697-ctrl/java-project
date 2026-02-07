package stepdefinitions;

import io.cucumber.java.en.And;
import utils.DriverFactory;

public class LogoutSteps {
    @And("user logs out from application")
    public void logout() {
        // click profile → logout
        DriverFactory.getDriver().quit();
    }
}
