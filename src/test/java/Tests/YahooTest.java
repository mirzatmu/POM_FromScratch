package Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class YahooTest {

    WebDriver driver;

    /*
       -When we try to import library of the some methods in maven , all we need to do is write the dependincy ,
       -When we chose the dependency we have to chose the (org.testng) one .
       -In testNG we don't use main method, because it will run the application as testNG , (junit will same as testNG)
       and main method is the method to run the java application.
     */


    @BeforeMethod
    public void setups(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
    }


    @AfterMethod
    public void EndTest(){
        driver.quit();
    }

    @Test(priority = 1)
    public void FirstTest(){
        driver.get("https://www.yahoo.com");
    }

    @Test(priority = 5)
    public void SecondTest() {
        driver.get("https://www.facebook.com");
    }

    @Test(priority = 6)
    public void ThirdTest() {
        driver.get("https://www.google.com");
    }
}
