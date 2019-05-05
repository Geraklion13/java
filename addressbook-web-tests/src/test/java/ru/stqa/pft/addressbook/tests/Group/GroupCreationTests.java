package ru.stqa.pft.addressbook.tests.Group;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;
import ru.stqa.pft.addressbook.tests.TestBase;

public class GroupCreationTests extends TestBase {

    @Test(testName = "Создание новой группы")
    public void testGroupCreation() {
        app.getNavigationHelper().goToGroupPage();
        app.getGroupHelper().initGroupCreation();
        app.getGroupHelper().fillGroupForm(new GroupData("test1", null, null));
        app.getGroupHelper().submitGroupCreation();
        app.getGroupHelper().returnToGroupPage();
    }
}