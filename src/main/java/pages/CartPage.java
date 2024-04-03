package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class CartPage {
    private final WebDriver driver;

    public CartPage(WebDriver driver){
        this.driver=driver;
    }


    //Elements
    private static By productName = By.xpath("//div[text()=\"Sauce Labs Backpack\"]");
    private final By checkoutButton = By.xpath("//a[@class=\"btn_action checkout_button\"]");
    private final By removeButton = By.xpath("//button[@class=\"btn_secondary cart_button\"]");
    private final By continueShoppingButton = By.xpath("//a[@class=\"btn_secondary\"]");

    //getter
    public static By removeButton(){
        return By.xpath("//button[@class=\"btn_secondary cart_button\"]");
    }


    //Setter
    public static By ProductName(String name){
        return productName = By.xpath("//div[text()=\""+name+"\"]");
    }


    //Actions
    public CheckoutPage checkout(){
        driver.findElement(checkoutButton).click();

        return new CheckoutPage(driver);
    }
    public CartPage emptyTheCart(){
        driver.findElement(removeButton).click();
        driver.findElement(continueShoppingButton).click();

        return this;
    }

}
