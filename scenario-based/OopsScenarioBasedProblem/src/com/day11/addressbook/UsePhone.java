package com.day11.addressbook;

import java.util.Scanner;

public class UsePhone {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PhoneBook phoneBook = new PhoneBook();

        while (true) {
            System.out.println("1. Add Contact");
            System.out.println("2. Edit Contact");
            System.out.println("3. Delete Contact");
            System.out.println("4. Display Contacts");
            System.out.println("5. Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("First Name: ");
                    String first = sc.nextLine();
                    System.out.print("Last Name: ");
                    String last = sc.nextLine();
                    System.out.print("Phone: ");
                    String phone = sc.nextLine();
                    System.out.print("Email: ");
                    String email = sc.nextLine();

                    System.out.print("City: ");
                    String city = sc.nextLine();
                    System.out.print("State: ");
                    String state = sc.nextLine();
                    System.out.print("Zip: ");
                    String zip = sc.nextLine();

                    Address address = new Address(city, state, zip);
                    Contact c = new Contact(first, last, phone, email, address);
                    phoneBook.addContact(c);
                }

                case 2 -> {
                    System.out.print("Phone to Edit: ");
                    String phone = sc.nextLine();
                    System.out.print("New First Name: ");
                    String f = sc.nextLine();
                    System.out.print("New Last Name: ");
                    String l = sc.nextLine();
                    phoneBook.editContact(phone, f, l);
                }

                case 3 -> {
                    System.out.print("Phone to Delete: ");
                    phoneBook.deleteContact(sc.nextLine());
                }

                case 4 -> phoneBook.display();

                case 5 -> {
                    System.out.println("Goodbye!");
                    return;
                }

                default -> System.out.println("Invalid choice");
            }
        }
    }
}
