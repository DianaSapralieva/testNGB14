package class03;

import org.testng.annotations.*;

public class Annotations {
    @BeforeTest
    public void beforeTest(){
        System.out.println("I am before test");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("I am after test");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("I am before class");
    }

    @BeforeMethod
    public void BeforeMethod(){
        System.out.println("i am before method");
    }
    @Test
    public void firstTest(){
        System.out.println("I am a 1st method");
    }

    @Test
    public void secondTest(){
        System.out.println("I am a 2nd method");
    }

    @AfterMethod
    public void AfterMethod(){
        System.out.println("I am after method");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("I am after class");

    }


}
