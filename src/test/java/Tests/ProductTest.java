package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ProductPage;

public class ProductTest extends BaseTest{
    String expectedPrice = "$29.99";



    @Test
    public void validateProductPrice() {
        new LoginPage(driver).login("standard_user","secret_sauce").openProduct();
        String actualValue = driver.findElement(ProductPage.ProductPrice()).getText();
        Assert.assertEquals(actualValue,expectedPrice);

    }
}
