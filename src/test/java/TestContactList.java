import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestContactList extends TestInit {
    @Test
    public void addNewContactTest() {
        HomePage homePage = new HomePage(driver);
        homePage.navigate();
        homePage.logIn(correctEmail, correctPassword);
        ContactListPage contactListPage = new ContactListPage(driver);
        contactListPage.addBtn().click();
        ContactFormPage contactFormPage = new ContactFormPage(driver);
        contactFormPage.fillAddContactForm(firstContactName, firstContactLastName, firstContactEmail, firstContactPhone);
        Assert.assertTrue(contactListPage.getContactByTextWithTimeout(firstContactName, 3).isDisplayed(), "New contact is not present in contact list");
    }

    @Test
    public void editNewContactTest() {
        HomePage homePage = new HomePage(driver);
        homePage.navigate();
        homePage.logIn(correctEmail, correctPassword);
        ContactListPage contactListPage = new ContactListPage(driver);
        contactListPage.addBtn().click();
        ContactFormPage contactFormPage = new ContactFormPage(driver);
        contactFormPage.fillAddContactForm(firstContactName, firstContactLastName, firstContactEmail, firstContactPhone);
        contactListPage.getContactByTextWithTimeout(firstContactName, 3).click();
        ContactDetailsPage contactDetailsPage = new ContactDetailsPage(driver);
        contactDetailsPage.getEditBtn().click();
        contactFormPage.editContactForm(newContactName, newContactLastName);
        contactDetailsPage.getReturnBtn().click();
        Assert.assertTrue(contactListPage.getContactByTextWithTimeout(newContactName, 3).isDisplayed(), "New contact is not present in contact list");
        Assert.assertTrue(contactListPage.getContactByTextWithTimeout(newContactLastName, 3).isDisplayed(), "New contact is not present in contact list");
    }

    @Test
    public void deleteNewContactTest() {
        HomePage homePage = new HomePage(driver);
        homePage.navigate();
        homePage.logIn(correctEmail, correctPassword);
        ContactListPage contactListPage = new ContactListPage(driver);
        contactListPage.addBtn().click();
        ContactFormPage contactFormPage = new ContactFormPage(driver);
        contactFormPage.fillAddContactForm(firstContactName, firstContactLastName, firstContactEmail, firstContactPhone);
        contactListPage.getContactByTextWithTimeout(firstContactName, 3).click();
        ContactDetailsPage contactDetailsPage = new ContactDetailsPage(driver);
        contactDetailsPage.getDeleteBtn().click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        Assert.assertEquals(0, contactListPage.getAllContactByText(newContactName).size());
        Assert.assertEquals(0, contactListPage.getAllContactByText(newContactLastName).size());
    }
}
