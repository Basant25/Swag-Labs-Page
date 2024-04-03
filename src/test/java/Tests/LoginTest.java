package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends BaseTest{

    @Test
    public void validLogin (){
        new LoginPage(driver).login("standard_user","secret_sauce");
        boolean isHeaderAreaDisplayed = driver.findElement(HomePage.HeaderArea()).isDisplayed();
        Assert.assertTrue(isHeaderAreaDisplayed);
    }

    @Test
    public void invalidLogin(){
        new LoginPage(driver).login("standard_use","secret_sauc");
        boolean isErrorButtonDisplayed=driver.findElement(LoginPage.ErrorButton()).isDisplayed();
        Assert.assertTrue(isErrorButtonDisplayed);
    }
}
