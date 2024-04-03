package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class FinishPage {
    private final WebDriver driver;

    public FinishPage(WebDriver driver){
        this.driver=driver;
    }

    //Elements
    private final By confirmationMessage = By.xpath("//h2[text()=\"THANK YOU FOR YOUR ORDER\"]");


    //getter
    public static By ConfirmationMessage(){
        return By.xpath("//h2[text()=\"THANK YOU FOR YOUR ORDER\"]");
    }

}
