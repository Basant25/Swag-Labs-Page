package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    String url = "https://www.saucedemo.com/v1/";

    public WebDriver driver;

    @BeforeMethod
    public void setUp (){
        driver = new ChromeDriver();
        driver.navigate().to(url);
    }

//    @AfterMethod
//    public void tearOut (){
//        driver.quit();
//    }

}
