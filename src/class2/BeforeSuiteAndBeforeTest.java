package class2;

import org.testng.annotations.*;

public class BeforeSuiteAndBeforeTest {
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("I am before suite");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("I am after suite");
    }

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

    @Test(groups = "alfadhli")
    public void regressionTest(){
        System.out.println("I am regression test");
    }

    @Test(groups = "smoke")
    public void smokeTest(){
        System.out.println("I am smoke test");
    }

}
