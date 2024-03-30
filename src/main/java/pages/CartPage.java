package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class CartPage {
    private WebDriver driver;

    public CartPage(WebDriver driver){
        this.driver=driver;
    }

    //Elements
    private By productName = By.xpath("//div[text()=\"Sauce Labs Bolt T-Shirt\"]");
    private By checkoutButton = By.xpath("//a[@class=\"btn_action checkout_button\"]");
    private By removeButton = By.xpath("//button[@class=\"btn_secondary cart_button\"]");
    private By continueShoppingButton = By.xpath("//a[@class=\"btn_secondary\"]");


    //Actions
    public void checkout(){
        driver.findElement(checkoutButton).click();

    }
    public void emptyTheCart(){
        driver.findElement(removeButton).click();
        driver.findElement(continueShoppingButton).click();
    }

    //Assert
    public boolean isProductDisplayed(){
        return driver.findElement(productName).isDisplayed();
    }

}
