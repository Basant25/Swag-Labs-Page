package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class HomeTest extends BaseTest{

    @Test
    public void testHomePage(){
        LoginPage loginPage = new LoginPage(driver);
        HomePage homepage = new HomePage(driver);
        loginPage.login("standard_user","secret_sauce");
        Assert.assertTrue(homepage.isHeaderAreaDisplayed());

    }
}
