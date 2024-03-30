package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class CartTest extends BaseTest{

    @Test
    public void validateAddingProduct() {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        ProductPage productPage = new ProductPage(driver);
        CartPage cartPage = new CartPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        OverviewPage checkoutOverview = new OverviewPage(driver);
        FinishPage finishPage = new FinishPage(driver);

        loginPage.login("standard_user", "secret_sauce");
        homePage.openProduct();
        productPage.addProductToCart();
        productPage.moveToCartPage();
        Assert.assertTrue(cartPage.isProductDisplayed());

        cartPage.checkout();
        checkoutPage.enterYourInf("Basant","Sayed","12345");
        checkoutOverview.finishCheckout();
        Assert.assertTrue(finishPage.isConfirmationMessageDisplayed());
    }

    @Test
    public void validateRemovingProduct(){
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        ProductPage productPage = new ProductPage(driver);
        CartPage cartPage = new CartPage(driver);

        loginPage.login("standard_user", "secret_sauce");
        homePage.openProduct();
        productPage.addProductToCart();
        productPage.moveToCartPage();
        Assert.assertTrue(cartPage.isRemoveButtonDisplayed());
        cartPage.emptyTheCart();
    }
}
