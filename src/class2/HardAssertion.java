package class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.CommonMethods;

import java.util.concurrent.TimeUnit;

public class HardAssertion extends CommonMethods {



    @Test
    public void validationOfTitle(){
        String actualTitle = driver.getTitle();
        String expectedTitle = "Human Management System";
        Assert.assertEquals(actualTitle, expectedTitle);

        WebElement username = driver.findElement(By.id("txtUsername"));
        Assert.assertTrue(username.isDisplayed());
        System.out.println("I am test code");
/*
        if(expectedTitle.equals(actualTitle)){
            System.out.println("Test is passed");
        }else{
            System.out.println("Test is failed");
        }

 */
    }




}
