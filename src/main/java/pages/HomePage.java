package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class HomePage {
    private WebDriver driver;
    public HomePage (WebDriver driver) {
        this.driver = driver;
    }

    String productName = "Sauce Labs Bolt T-Shirt";

    //Elements
    private By headerArea = By.className("app_logo");
    private By productLink = By.xpath("//div[text()=\""+productName+"\"]");


    //getter
    public By getHeaderArea(){
        return headerArea;
    }

    //Actions
    public void openProduct (){
        driver.findElement(productLink).click();
    }

    //Assert
    public boolean isHeaderAreaDisplayed(){
        return driver.findElement(headerArea).isDisplayed();
    }

}
