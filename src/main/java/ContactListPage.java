import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ContactListPage extends BasePage {
    public ContactListPage(WebDriver driver) {
        super(driver);
    }

    public WebElement addBtn() {
        waitTillVisible(By.xpath("//button[@id='add-contact']"), 3);
        return driver.findElement(By.xpath("//button[@id='add-contact']"));
    }

    public List<WebElement> getAllContactByText(String text) {
        return driver.findElements(By.xpath("//*[@class='contactTableBodyRow']//child::td[contains(text(), '"+text+"')]"));
    }

    public WebElement getContactByTextWithTimeout(String text, int sec) {
        return getElement("//*[@class='contactTableBodyRow']//child::td[contains(text(), '"+text+"')]", sec);
    }
}
