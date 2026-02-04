package com.designprinciples.librarycasestudy;

public class SmartLibraryApp {

    public static void main(String[] args) {
	System.out.println("SMART UNIVERSITY LIBRARY MANAGEMENT SYSTEM");
	
        LibraryCatalog catalog = LibraryCatalog.getInstance();

        // Create books using Builder pattern
        Book dsBook = new Book.BookBuilder("978-0262033848", "Introduction to Data Structures")
                .withAuthors("Hellen Keller", "Robert Frost", "Willamsion", "Stein Lay")
                .withEdition(3)
                .withPublisher("IIT Colonosier")
                .withGenre("Information Tech Master")
                .build();

        Book javaBook = new Book.BookBuilder("978-0134685991", "Effective Java")
                .withAuthors("Joshua Bloch")
                .withEdition(3)
                .withPublisher("James-Gosslings")
                .withGenre("Programming")
                .build();

        catalog.addBook(dsBook);
        catalog.addBook(javaBook);

        User u1 = UserFactory.createUser("Ajay", "Student");
        User u2= UserFactory.createUser("Bindu", "Faculty");
        User librarian1 = UserFactory.createUser("Deepak Sharma", "Librarian");
        User librarian2 = UserFactory.createUser("Mohan Yadav", "Librarian");

        dsBook.attach(u1);
        dsBook.attach(u2);

        dsBook.attach(librarian1);

        System.out.println("Someone borrowed 'Introduction to Algorithms'");
        catalog.updateBookAvailability("945-0338480262", false);

        System.out.println("\n--> Book returned (All subscribers notified)");
        catalog.updateBookAvailability("912-9953398573", true);

        // Librarian two subscribed later
        dsBook.attach(librarian2);

        System.out.println("\n--> Book borrowed again (Subscribed librarians notified)");
        catalog.updateBookAvailability("978-0338480262", false);
        
	System.out.println("Thank You");

    }
}