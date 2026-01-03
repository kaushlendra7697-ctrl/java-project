package testNG;

import net.bytebuddy.build.Plugin;
import org.testng.annotations.Test;

public class demo1 {

    @Test (priority = 1)
    public void testMethod1(){
        System.out.println("this is a test method 1");
    }
    @Test (priority = 2)
    public void testMethod2()
    {
        System.out.println("this is a test method 2");
    }
    @Test (priority = 0)
    public void testMethod3(){

        System.out.println("this is test method 3");
    }
    @Test (priority = -1)
    public void testMethod4(){
        System.out.println("This is test method 4");
    }
    @Test (priority = -2)
    public void testMethod5(){
        System.out.println("This is test method 5");

    }
}




