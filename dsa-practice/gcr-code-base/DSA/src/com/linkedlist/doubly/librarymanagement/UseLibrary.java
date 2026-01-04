package com.linkedlist.doubly.librarymanagement;

public class UseLibrary{

    public static void main(String[] args) {

        LibraryLinkedList library = new LibraryLinkedList();

        library.addAtEnd("Clean Code", "Robert Martin", "Programming", 101, true);
        library.addAtBeginning("Effective Java", "Joshua Bloch", "Programming", 102, true);
        library.addAtPosition(2, "The Alchemist", "Paulo Coelho", "Fiction", 103, false);

        System.out.println("Books (Forward):");
        library.displayForward();

        System.out.println("\nBooks (Reverse):");
        library.displayReverse();

        System.out.println("\nSearch by Author:");
        library.search("Joshua Bloch");

        System.out.println("\nUpdate Availability:");
        library.updateAvailability(103, true);

        System.out.println("\nAfter Update:");
        library.displayForward();

        System.out.println("\nRemove Book ID 101");
        library.removeByBookId(101);

        System.out.println("\nFinal Book List:");
        library.displayForward();

        System.out.println("\nTotal Books: " + library.getTotalBooks());
    }
}




