package testNG;

import org.testng.annotations.Test;

public class invocation_count {
    @Test
    public void testMethod1(){
        System.out.println("This is test method 1");
    }
    @Test
    public void testMethod2(){
        System.out.println("This is test method 2");
    }
    @Test
    public void testMethod3(){
        System.out.println("This is test method 3");
    }
    @Test(invocationCount = 0)
    public void testMethod4(){
        System.out.println("This is test method 4");
    }

    @Test(invocationCount = 3)
    public void testMethod5(){
        System.out.println("This is testMethod 5");
    }
    @Test(invocationCount = 5)
    public void testMethod6(){
        System.out.println("This is test method6");
    }

}



