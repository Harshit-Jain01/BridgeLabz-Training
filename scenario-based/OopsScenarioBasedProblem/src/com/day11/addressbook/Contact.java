package com.day11.addressbook;

public class Contact {

    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private Address address;

    public Contact(String firstName, String lastName, String phone, String email, Address address) {
        this.firstName = firstName.toLowerCase();
        this.lastName = lastName.toLowerCase();
        this.phone = phone;
        this.email = email;
        this.address = address;
    }

    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getPhone() { return phone; }
    public Address getAddress() { return address; }

    public void updateName(String first, String last) {
        this.firstName = first.toLowerCase();
        this.lastName = last.toLowerCase();
    }
}
