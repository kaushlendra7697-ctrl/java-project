package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;

public class HomePage {
    protected WebDriver driver;

    @BeforeTest
    public void setup (){
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC");

    }

    @AfterMethod
    public void tearDown()
    {
        driver.quit();
    }


}
