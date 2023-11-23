import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactFormPage extends BasePage{
    public ContactFormPage(WebDriver driver) {
        super(driver);
    }

    public WebElement firstNameInput() {
        return driver.findElement(By.xpath("//input[@id='firstName']"));
    }

    public WebElement lastNameInput() {
        return driver.findElement(By.xpath("//input[@id='lastName']"));
    }

    public WebElement emailInput() {
        return driver.findElement(By.xpath("//input[@id='email']"));
    }

    public WebElement phoneInput() {
        return driver.findElement(By.xpath("//input[@id='phone']"));
    }

    public WebElement submitBtn() {
        return driver.findElement(By.xpath("//button[@id='submit']"));
    }

    public void fillAddContactForm(String name, String lastName, String email, String phone) {
        firstNameInput().sendKeys(name);
        lastNameInput().sendKeys(lastName);
        emailInput().sendKeys(email);
        phoneInput().sendKeys(phone);
        submitBtn().click();
    }

    public void editContactForm(String name, String lastName) {
        waitTillVisible(By.xpath("//input[@id='firstName']"), 3);
        firstNameInput().click();
        firstNameInput().clear();
        firstNameInput().sendKeys(name);
        lastNameInput().clear();
        lastNameInput().sendKeys(lastName);
        submitBtn().click();
    }
}
