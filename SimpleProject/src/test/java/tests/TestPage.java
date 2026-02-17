package tests;

import base.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class TestPage extends HomePage {
    @Test
    public void verifyLogin(){
        LoginPage lp = new LoginPage(driver);
        lp.login("MYac123", "MYac123");
        //Assert.assertTrue(driver.getTitle().contains("ParaBank | Welcome | Online Banking"));

    }

}
