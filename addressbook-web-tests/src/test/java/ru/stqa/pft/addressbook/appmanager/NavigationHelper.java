package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationHelper extends HelperBase {

    public NavigationHelper(FirefoxDriver wd) {
        super(wd);
    }

    public void returnToContactPage() {
        click(By.linkText("home"));
    }

    public void goToGroupPage() {
        click(By.linkText("groups"));
    }
}
