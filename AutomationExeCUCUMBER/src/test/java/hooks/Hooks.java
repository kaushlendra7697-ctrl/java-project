package hooks;

import base.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


public class Hooks {

    @Before
    public void setup() {
        BaseClass.initializeDriver();
    }

    @After
    public void tearDown(Scenario scenario) {

        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) BaseClass.getDriver())
                    .getScreenshotAs(OutputType.BYTES);

            scenario.attach(screenshot, "image/png", "Failed Screenshot");
        }

        BaseClass.quitDriver();
    }
}