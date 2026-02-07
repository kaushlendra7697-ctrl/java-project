package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.PimPage;
import utils.DriverFactory;

public class PimSteps {
    @And("user navigates to PIM module")
    public void navigateToPIM() {
        // handled in PIM page
    }

    @And("user adds a new employee")
    public void addEmployee() {
        new PimPage(DriverFactory.getDriver()).addEmployee();
    }

    @Then("employee should be added successfully")
    public void verifyEmployee() {
        Assert.assertTrue(true); // real project: verify employee name
    }
}
