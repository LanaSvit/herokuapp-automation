import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestInit {
    public WebDriver driver;
    public String correctEmail = "jdkajkdj@ljklj.com";
    public String incorrectEmail = "jjfjfjfjfj@d.com";
    public String correctPassword = "qm.JR8JmW8T!Aj";
    public String incorrectPassword = "jjjfjfjjfjfj";
    public String firstContactName = "FirstName";
    public String firstContactLastName = "LastName";
    public String firstContactEmail = "firstContactEmail@gdfd.com";
    public String firstContactPhone = "23829389238";
    public String newContactName = "NewName";
    public String newContactLastName = "NewLastName";

    @BeforeMethod
    public void before() {
        System.setProperty("webdriver.chrome.driver", "/Users/svit/IdeaProjects/calm-automation/src/main/resources/chromedriver_mac64/chromedriver");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
