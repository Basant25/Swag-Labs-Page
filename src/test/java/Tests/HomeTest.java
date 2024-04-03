package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class HomeTest extends BaseTest{

    @Test
    public void testHomePage(){

        new LoginPage(driver).login("standard_user","secret_sauce");
        boolean areProductsDisplayed=driver.findElement(HomePage.HeaderArea()).isDisplayed();
        Assert.assertTrue(areProductsDisplayed);
    }
}
