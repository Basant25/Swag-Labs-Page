package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CheckoutPage;
import pages.LoginPage;
import pages.OverviewPage;

public class OverviewTest extends BaseTest {

    @Test
    public void validateCheckoutOverview() {
        new LoginPage(driver).login("standard_user", "secret_sauce")
                .openProduct()
                .addProductToCart()
                .moveToCartPage()
                .checkout()
                .enterYourInf("Basant", "Sayed", "1234");
        boolean isPaymentInfDisplayed = driver.findElement(OverviewPage.PaymentInf()).isDisplayed();
        Assert.assertTrue(isPaymentInfDisplayed);
    }

    @Test
    public void validateEmptyFields() {
        new LoginPage(driver).login("standard_user", "secret_sauce")
                .openProduct()
                .addProductToCart()
                .moveToCartPage()
                .checkout()
                .enterYourInf("Basant","","");
        boolean isErrorDisplayed = driver.findElement(CheckoutPage.ErrorInf()).isDisplayed();
        Assert.assertTrue(isErrorDisplayed);

    }
}
