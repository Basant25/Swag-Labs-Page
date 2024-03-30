package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class HomePage {
    private final WebDriver driver;
    public HomePage (WebDriver driver) {
        this.driver = driver;
    }

    String productName = "Sauce Labs Bolt T-Shirt";

    //Elements
    private final By headerArea = By.className("app_logo");
    private final By productLink = By.xpath("//div[text()=\""+productName+"\"]");
    private final By productLabel = By.xpath("//div[@class=\"product_label\"]");


    //getter
    public By getHeaderArea(){
        return headerArea;
    }

    //Actions
    public void openProduct (){
        driver.findElement(productLink).click();
    }

    //Assert
    public boolean areProductsDisplayed(){
        return driver.findElement(productLabel).isDisplayed();
    }

}
