package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CheckoutPage;
import pages.LoginPage;

public class CheckoutTest extends BaseTest{

    @Test
    public void validateCheckout(){
        new LoginPage(driver).login("standard_user", "secret_sauce")
                .openProduct()
                .addProductToCart()
                .moveToCartPage()
                .checkout();
        boolean isContinueButtonDisplayed = driver.findElement(CheckoutPage.ContinueButton()).isDisplayed();
        Assert.assertTrue(isContinueButtonDisplayed);
    }

}
