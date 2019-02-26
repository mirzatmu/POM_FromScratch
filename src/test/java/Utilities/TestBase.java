package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {

   public MyLibrary mylib;   //has needed methods
   public static WebDriverWait wait;
   public static WebDriver driver;
   public static Actions act; //if any test extends TestBase, we can use act at any places.


    @BeforeMethod
    public void setups(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        mylib=new MyLibrary(driver);
        wait = new WebDriverWait(driver,50);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void EndTest(){
        mylib.sleep(3.5);
        driver.quit();
    }
}
