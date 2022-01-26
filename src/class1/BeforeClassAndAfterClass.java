package class1;

import org.testng.annotations.*;

public class BeforeClassAndAfterClass {

    @BeforeClass
    public void beforeClass(){
        System.out.println("I am before class");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("I am after class");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("I am before method");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("I am after method");
    }

    @Test
    public void thirdTest(){
        System.out.println("I am third test");
    }

    @Test
    public void secondTest(){
        System.out.println("I am second test");
    }

    @Test
    public void firstTest(){
        System.out.println("I am first test");
    }
}
