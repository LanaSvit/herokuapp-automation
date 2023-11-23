import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactDetailsPage extends BasePage {
    public ContactDetailsPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getEditBtn() {
        waitTillVisible(By.xpath("//button[@id='edit-contact']"), 3);
        return driver.findElement(By.xpath("//button[@id='edit-contact']"));
    }

    public WebElement getReturnBtn() {
        waitTillVisible(By.xpath("//button[@id='return']"), 3);
        return driver.findElement(By.xpath("//button[@id='return']"));
    }

    public WebElement getDeleteBtn() {
        waitTillVisible(By.xpath("//button[@id='delete']"), 3);
        return driver.findElement(By.xpath("//button[@id='delete']"));
    }
}
