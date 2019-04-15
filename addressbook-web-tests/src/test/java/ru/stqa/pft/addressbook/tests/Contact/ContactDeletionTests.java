package ru.stqa.pft.addressbook.tests.Contact;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.tests.TestBase;

public class ContactDeletionTests extends TestBase {

    @Test(testName = "Удаление существующего контакта")
    public void testContactDeleting() {
        app.getContactHelper().selectContact();
        app.getContactHelper().deleteContact();
        app.getContactHelper().submitDeletingContact();
        app.getNavigationHelper().returnToContactPage();
    }
}
