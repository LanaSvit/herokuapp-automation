import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLogIn extends TestInit {
    @Test
    public void negativeLogInTest(){
        HomePage homePage = new HomePage(driver);
        homePage.navigate();
        homePage.logIn(incorrectEmail, incorrectPassword);
        Assert.assertTrue(homePage.getErrorMessage().isDisplayed(), "Error message is not displayed");
    }

    @Test
    public void positiveLogInTest(){
        HomePage homePage = new HomePage(driver);
        homePage.navigate();
        homePage.logIn(correctEmail, correctPassword);
        Assert.assertTrue(homePage.getHeaderTitle().isDisplayed(), "Header title is not displayed");
    }
}
