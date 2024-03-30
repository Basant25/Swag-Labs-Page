package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class ProductPage {
    private final WebDriver driver;

    public ProductPage (WebDriver driver) {

        this.driver = driver;
    }


    //Elements
    private final By productPrice = By.className("inventory_details_price");
    private final By addToCartButton = By.xpath("//button[@class=\"btn_primary btn_inventory\"]");
    private final By cartIcon = By.id("shopping_cart_container");
    private final By removeButton = By.xpath("//button[@class=\"btn_secondary btn_inventory\"]");

    //getter
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

    //Assert
    public boolean isRemoveButtonDisplayed() {
        return driver.findElement(removeButton).isDisplayed();
    }
}
