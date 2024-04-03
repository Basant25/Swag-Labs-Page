package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class CartTest extends BaseTest{

    @Test
    public void validateProductPurchase() {

        new LoginPage(driver).login("standard_user", "secret_sauce")
                .openProduct()
                .addProductToCart()
                .moveToCartPage()
                .checkout()
                .enterYourInf("Basant","Sayed","1234")
                .finishCheckout();
        boolean isConfirmationMessageDisplayed = driver.findElement(FinishPage.ConfirmationMessage()).isDisplayed();
        Assert.assertTrue(isConfirmationMessageDisplayed);


    }

    @Test
    public void validateEmptyCart(){
        new LoginPage(driver).login("standard_user", "secret_sauce")
                .openProduct()
                .addProductToCart()
                .moveToCartPage()
               .emptyTheCart();
        boolean isHomePageDisplayed = driver.findElement(HomePage.ProductLabel()).isDisplayed();
        Assert.assertTrue(isHomePageDisplayed);
    }


}
