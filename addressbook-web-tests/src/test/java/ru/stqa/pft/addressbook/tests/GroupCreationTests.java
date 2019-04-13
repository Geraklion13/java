package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;
import ru.stqa.pft.addressbook.model.NewContactData;

public class GroupCreationTests  extends TestBase {

  @Test(testName = "Создание новой группы")
  public void testGroupCreation() throws Exception {
    app.getNavigationHelper().goToGroupPage();
    app.getGroupHelper().initGroupCreation();
    app.getGroupHelper().fillGroupForm(new GroupData("test1", "test2", "test3"));
    app.getGroupHelper().submitGroupCreation();
    app.getGroupHelper().returnToGroupPage();
  }

  @Test(testName = "Создание нового контакта")
  public void testContactCreation() throws Exception {
    app.getContactHelper().initContactCreation();
    app.getContactHelper().fillNewContactForm(new NewContactData("Ivan", "Petrov", "Moscow", "78000005555", "test@test.ru"));
    app.getContactHelper().submitContactCreation();
    app.getNavigationHelper().returnToContactPage();
  }
}
