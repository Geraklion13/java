package ru.stqa.pft.addressbook.tests.Contact;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;
import ru.stqa.pft.addressbook.model.NewContactData;
import ru.stqa.pft.addressbook.tests.TestBase;

public class ContactModificationTests extends TestBase {

    @Test(testName = "Редактирование существующего контакта")
    public void testModificationTest() {
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
        app.getContactHelper().initContactModification();
        app.getContactHelper().fillNewContactForm(new NewContactData("petr", "petrov", "SPB", "78111111111", "test@testest.ru", null), false);
        app.getContactHelper().submitContactModification();
        app.getNavigationHelper().returnToContactPage();
    }

}
