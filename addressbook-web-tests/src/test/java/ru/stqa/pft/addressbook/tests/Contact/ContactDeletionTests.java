package ru.stqa.pft.addressbook.tests.Contact;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;
import ru.stqa.pft.addressbook.model.NewContactData;
import ru.stqa.pft.addressbook.tests.TestBase;

public class ContactDeletionTests extends TestBase {

    @Test(testName = "Удаление существующего контакта")
    public void testContactDeleting() {

        if (!app.getContactHelper().isThereAContact()) {
            app.getNavigationHelper().goToGroupPage();
            if (!app.getGroupHelper().isThereAGroup()) {
                app.getGroupHelper().createGroup(new GroupData("test1", null, null));
            }
            app.getNavigationHelper().returnToContactPage();
            app.getContactHelper().createContact(new NewContactData("petr", "petrov", "SPB", "78111111111", "test@testest.ru", "test1"), true);
            app.getNavigationHelper().returnToContactPage();
        }
        app.getContactHelper().selectContact();
        app.getContactHelper().deleteContact();
        app.getContactHelper().submitDeletingContact();
        app.getNavigationHelper().returnToContactPage();
    }
}
