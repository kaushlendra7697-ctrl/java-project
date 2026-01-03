package testNG;

import org.testng.annotations.*;

public class demo2 {
    @Test

    @BeforeClass
    public void beforeClass(){
        System.out.println("This is beforeclass");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("this is aftersuite");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("this is afterclass");

    }

    @AfterGroups
    public void afterGroup(){
        System.out.println("this is aftergroup");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("this is aftermethod");

    }
    @AfterTest
    public void afterTest(){
        System.out.println("this is aftertest");

    }
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("this is beforesuite");
    }

}
