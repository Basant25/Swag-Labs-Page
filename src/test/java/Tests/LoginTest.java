package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest{

    @Test
    public void testValidLogin (){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user","secret_sauce");
        Assert.assertTrue(loginPage.isLoggedSuccessfully());
    }

    @Test
    public void testInvalidLogin(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_use","secret_sauc");
        Assert.assertTrue(loginPage.isNotLoggedSuccessfully());
    }
}
