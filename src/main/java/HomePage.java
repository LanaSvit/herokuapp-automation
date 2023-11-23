import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void navigate() {
        driver.get("https://thinking-tester-contact-list.herokuapp.com/");
    }

    public WebElement getEmailField() {
        return driver.findElement(By.xpath("//input[@id='email']"));
    }

    public WebElement getPasswordField() {
        return driver.findElement(By.xpath("//input[@id='password']"));
    }

    public WebElement getSubmitBtn() {
        return driver.findElement(By.xpath("//button[@id='submit']"));
    }

    public void logIn(String email, String password) {
        getEmailField().sendKeys(email);
        getPasswordField().sendKeys(password);
        getSubmitBtn().click();
    }

    public WebElement getErrorMessage() {
        waitTillVisible(By.xpath("//*[@id='error']"), 3);
        return driver.findElement(By.xpath("//*[@id='error']"));
    }

    public WebElement getHeaderTitle() {
        waitTillVisible(By.xpath("//*[contains(text(),'Contact List')]"), 3);
        return driver.findElement(By.xpath("//*[contains(text(),'Contact List')]"));
    }
}
