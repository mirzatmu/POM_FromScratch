package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {

    WebDriver driver;

    @BeforeMethod
    public void setups(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
    }

    @AfterMethod
    public void EndTest(){
        driver.quit();
    }
}
