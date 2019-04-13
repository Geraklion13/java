package ru.stqa.pft.addressbook;

import org.testng.annotations.Test;

public class GroupCreationTests  extends TestBase {

  @Test(testName = "Создание новой группы")
  public void testGroupCreation() throws Exception {
    goToGroupPage();
    initGroupCreation();
    fillGtoupForm(new GroupData("test1", "test2", "test3"));
    submitGroupCreation();
    returnToGroupPage();
  }

  @Test(testName = "Создание нового контакта")
  public void testContactCreation() throws Exception {
    initContactCreation();
    fillNewContactForm(new NewContactData("Ivan", "Petrov", "Moscow", "78000005555", "test@test.ru"));
    submitContactCreation();
    returnToContactPage();
  }

}
