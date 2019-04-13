package ru.stqa.pft.addressbook.model;

public class NewContactData {
    private final String firstname;
    private final String lastname;
    private final String address;
    private final String phone;
    private final String email;

    public NewContactData(String firstname, String lastname, String address, String phone, String email) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }
}