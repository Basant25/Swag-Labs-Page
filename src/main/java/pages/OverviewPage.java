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
    private final By paymentInf = By.xpath("//div[text()=\"Payment Information:\"]");
    private final By errorInf = By.xpath("//button[@class=\"error-button\"]");


    //getter
    public static By PaymentInf(){
        return By.xpath("//div[text()=\"Payment Information:\"]");
    }


    //Actions
    public FinishPage finishCheckout(){
        driver.findElement(finishButton).click();

        return new FinishPage(driver);
    }
}
