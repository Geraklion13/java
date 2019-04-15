package ru.stqa.pft.addressbook.tests.Contact;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.NewContactData;
import ru.stqa.pft.addressbook.tests.TestBase;

public class ContactCreationTests extends TestBase {

    @Test(testName = "Создание нового контакта")
    public void testContactCreation() {
        app.getContactHelper().initContactCreation();
        app.getContactHelper().fillNewContactForm(new NewContactData("Ivan", "Petrov", "Moscow", "78000005555", "test@test.ru"));
        app.getContactHelper().submitContactCreation();
        app.getNavigationHelper().returnToContactPage();
    }
}
