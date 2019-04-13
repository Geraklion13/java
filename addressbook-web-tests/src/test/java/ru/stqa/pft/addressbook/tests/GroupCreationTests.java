package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;
import ru.stqa.pft.addressbook.model.NewContactData;

public class GroupCreationTests  extends TestBase {

  @Test(testName = "Создание новой группы")
  public void testGroupCreation() throws Exception {
    app.goToGroupPage();
    app.initGroupCreation();
    app.fillGtoupForm(new GroupData("test1", "test2", "test3"));
    app.submitGroupCreation();
    app.returnToGroupPage();
  }

  @Test(testName = "Создание нового контакта")
  public void testContactCreation() throws Exception {
    app.initContactCreation();
    app.fillNewContactForm(new NewContactData("Ivan", "Petrov", "Moscow", "78000005555", "test@test.ru"));
    app.submitContactCreation();
    app.returnToContactPage();
  }

}
