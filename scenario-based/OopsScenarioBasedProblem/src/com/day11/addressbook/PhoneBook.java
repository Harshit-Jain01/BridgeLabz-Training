package com.day11.addressbook;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class PhoneBook {

    private List<Contact> contacts = new ArrayList<>();
    private Set<String> phoneSet = new HashSet<>();

    // Add Contact
    public void addContact(Contact c) {
        if (phoneSet.add(c.getPhone())) {
            contacts.add(c);
            System.out.println("Contact added successfully");
        } else {
            System.out.println("Duplicate phone number!");
        }
    }

    // Delete Contact 
    public void deleteContact(String phone) {
        Iterator<Contact> it = contacts.iterator();
        boolean found = false;

        while (it.hasNext()) {
            Contact c = it.next();
            if (c.getPhone().equals(phone)) {
                it.remove();          
                phoneSet.remove(phone);
                found = true;
                break;
            }
        }

        if (found)
            System.out.println("Contact deleted");
        else
            System.out.println("Contact not found");
    }

    // Edit Contact
    public void editContact(String phone, String first, String last) {
        boolean found = false;

        for (Contact c : contacts) {
            if (c.getPhone().equals(phone)) {
                c.updateName(first, last);
                found = true;
                System.out.println("Contact updated");
                break;
            }
        }

        if (!found)
            System.out.println("Contact not found");
    }

    // Search by City 
    public void searchByCity(String city) {
        boolean found = false;

        for (Contact c : contacts) {
            if (c.getAddress() != null &&
                c.getAddress().getCity().equalsIgnoreCase(city)) {

                System.out.println(c.getFirstName() + " " + c.getLastName());
                found = true;
            }
        }

        if (!found)
            System.out.println("No contacts found in this city");
    }

    // Display contacts sorted alphabetically
    public void display() {
        Collections.sort(contacts, new Comparator<Contact>() {
            @Override
            public int compare(Contact c1, Contact c2) {
                return c1.getFirstName().compareToIgnoreCase(c2.getFirstName());
            }
        });

        for (Contact c : contacts) {
            System.out.println(
                c.getFirstName() + " " +
                c.getLastName() + " : " +
                c.getPhone()
            );
        }
    }
}
