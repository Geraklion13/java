package ru.stqa.pft.addressbook.tests.Contact;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.NewContactData;
import ru.stqa.pft.addressbook.tests.TestBase;

public class ContactModificationTests extends TestBase {

    @Test(testName = "Редактирование существующего контакта")
    public void testModificationTest() {
        app.getContactHelper().selectContact();
        app.getContactHelper().initContactModification();
        app.getContactHelper().fillNewContactForm(new NewContactData("petr", "petrov", "SPB", "78111111111", "test@testest.ru"));
        app.getContactHelper().submitContactModification();
        app.getNavigationHelper().returnToContactPage();
    }

}
