package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class CommonMethods {

    public static WebDriver driver;

    @BeforeMethod(alwaysRun = true)
    public static void openBrowserAndLaunchApplication(){
        ConfigReader.readProperties("C:\\Users\\sohai\\IdeaProjects\\batch11\\TestNgBasicsBatch11\\src\\config\\config.properties");
        switch (ConfigReader.getPropertyValue("browser")){
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "src/Driver/chromedriver.exe");
                driver = new ChromeDriver();
                break;
            case "firefox":
                System.setProperty("webdriver.gecko.driver", "src/Driver/geckodriver.exe");
                driver = new FirefoxDriver();
                break;
            default:
                throw new RuntimeException("Invalid browser name");
        }

        driver.manage().window().maximize();
        driver.get(ConfigReader.getPropertyValue("url"));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @AfterMethod(alwaysRun = true)
    public static void closeBrowser(){
        driver.quit();
    }
}
