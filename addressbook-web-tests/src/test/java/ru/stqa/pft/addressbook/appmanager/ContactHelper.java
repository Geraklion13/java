package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.addressbook.model.NewContactData;

public class ContactHelper extends HelperBase {

    public ContactHelper(FirefoxDriver wd) {
        super(wd);
    }

    public void initContactCreation() {
        click(By.linkText("add new"));
    }

    public void fillNewContactForm(NewContactData newContactData) {
        type(By.name("firstname"), newContactData.getFirstname());
        type(By.name("lastname"), newContactData.getLastname());
        type(By.name("address"), newContactData.getAddress());
        type(By.name("home"), newContactData.getPhone());
        type(By.name("email"), newContactData.getEmail());

    }

    public void submitContactCreation() {
        click(By.name("submit"));
    }
}