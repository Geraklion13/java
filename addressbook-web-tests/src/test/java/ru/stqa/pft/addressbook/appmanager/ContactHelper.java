package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.addressbook.model.NewContactData;

public class ContactHelper extends HelperBase {

    public ContactHelper(WebDriver wd) {
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

    public void selectContact() {
        click(By.name("selected[]"));
    }

    public void submitContactCreation() {
        click(By.name("submit"));
    }

    public void deleteContact() {
        click(By.cssSelector("input[value='Delete']"));
    }

    public void submitDeletingContact() {
        wd.switchTo().alert().accept();
    }

    public void initContactModification() {
        click(By.cssSelector("img[alt='Edit']"));
    }

    public void submitContactModification() {
        click(By.cssSelector("input[value='Update']"));
    }
}
