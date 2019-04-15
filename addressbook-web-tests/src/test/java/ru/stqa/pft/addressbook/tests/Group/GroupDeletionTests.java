package ru.stqa.pft.addressbook.tests.Group;


import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.tests.TestBase;

public class GroupDeletionTests extends TestBase {

    @Test(testName = "Удаление существующей группы")
    public void testGroupDeletionTests() {
        app.getNavigationHelper().goToGroupPage();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().deleteSelectedGroups();
        app.getGroupHelper().returnToGroupPage();
    }
}
