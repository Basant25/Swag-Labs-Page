package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class HomePage {
    private final WebDriver driver;
    public HomePage (WebDriver driver) {
        this.driver = driver;
    }

    String productName = "Sauce Labs Backpack";

    //Elements
    private final By headerArea = By.className("app_logo");
    private final By productLink = By.xpath("//div[text()=\""+productName+"\"]");
    private final By productLabel = By.xpath("//div[@class=\"product_label\"]");


    //getter
    public static By HeaderArea(){
        return By.className("app_logo");
    }

    public static By ProductLabel(){
        return By.xpath("//div[@class=\"product_label\"]");
    }


    //Actions
    public ProductPage openProduct (){
        driver.findElement(productLink).click();

        return new ProductPage(driver);
    }

}
