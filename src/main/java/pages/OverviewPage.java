package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class OverviewPage {
    private final WebDriver driver;

    public OverviewPage(WebDriver driver){
        this.driver=driver;
    }

    //Elements
    private final By finishButton = By.xpath("//a[@class=\"btn_action cart_button\"]");

    //Actions
    public void finishCheckout(){
        driver.findElement(finishButton).click();
    }
}
