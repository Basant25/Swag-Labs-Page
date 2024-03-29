package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class ProductPage {
    private WebDriver driver;

    public ProductPage (WebDriver driver) {

        this.driver = driver;
    }


    //Elements
    private By productPrice = By.className("inventory_details_price");
    private By addToCartButton = By.xpath("//button[@class=\"btn_primary btn_inventory\"]");
    private By cartIcon = By.id("shopping_cart_container");
    public By getProductPrice(){
        return productPrice;
    }

    //Actions
    public void addProductToCart(){
        driver.findElement(addToCartButton).click();
    }
    public void moveToCartPage(){
        driver.findElement(cartIcon).click();
    }

}
