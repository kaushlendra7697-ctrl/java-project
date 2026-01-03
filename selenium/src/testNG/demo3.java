package testNG;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class demo3 {

    @Test
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("This is testMethod1");
    }
    @AfterMethod
    public void beforeMethod()
    {
        System.out.println("This is testMethod2");
    }
}
