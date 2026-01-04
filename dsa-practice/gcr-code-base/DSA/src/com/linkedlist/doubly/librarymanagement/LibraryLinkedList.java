package com.linkedlist.doubly.librarymanagement;

public class LibraryLinkedList {

    private BookNode head;
    private BookNode tail;
    private int count;

    
    public void addAtBeginning(String title, String author, String genre,
                               int bookId, boolean available) {

        BookNode node = new BookNode(title, author, genre, bookId, available);

        if (head == null) {
            head = tail = node;
        } else {
            node.next = head;
            head.prev = node;
            head = node;
        }
        count++;
    }

    // Add at end
    public void addAtEnd(String title, String author, String genre,
                         int bookId, boolean available) {

        BookNode node = new BookNode(title, author, genre, bookId, available);

        if (tail == null) {
            head = tail = node;
        } else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
        count++;
    }

    
    public void addAtPosition(int position, String title, String author,
                              String genre, int bookId, boolean available) {

        if (position <= 1) {
            addAtBeginning(title, author, genre, bookId, available);
            return;
        }
        if (position > count) {
            addAtEnd(title, author, genre, bookId, available);
            return;
        }

        BookNode node = new BookNode(title, author, genre, bookId, available);
        BookNode temp = head;

        for (int i = 1; i < position - 1; i++) {
            temp = temp.next;
        }

        node.next = temp.next;
        node.prev = temp;
        temp.next.prev = node;
        temp.next = node;

        count++;
    }

 
    public void removeByBookId(int bookId) {
        if (head == null) {
            System.out.println("Library is empty");
            return;
        }

        BookNode temp = head;

        while (temp != null) {
            if (temp.bookId == bookId) {

                if (temp == head && temp == tail) {
                    head = tail = null;
                } else if (temp == head) {
                    head = head.next;
                    head.prev = null;
                } else if (temp == tail) {
                    tail = tail.prev;
                    tail.next = null;
                } else {
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                }

                count--;
                System.out.println("Book removed successfully");
                return;
            }
            temp = temp.next;
        }

        System.out.println("Book ID not found");
    }

    
    public void search(String key) {
        if (head == null) {
            System.out.println("Library is empty");
            return;
        }

        boolean found = false;
        BookNode temp = head;

        while (temp != null) {
            if (temp.title.equalsIgnoreCase(key) ||
                temp.author.equalsIgnoreCase(key)) {

                printBook(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found) {
            System.out.println("No matching book found");
        }
    }


    public void updateAvailability(int bookId, boolean status) {
        BookNode temp = head;

        while (temp != null) {
            if (temp.bookId == bookId) {
                temp.available = status;
                System.out.println("Availability updated successfully");
                return;
            }
            temp = temp.next;
        }

        System.out.println("Book ID not found");
    }

    public void displayForward() {
        if (head == null) {
            System.out.println("Library is empty");
            return;
        }

        BookNode temp = head;
        while (temp != null) {
            printBook(temp);
            temp = temp.next;
        }
    }

    public void displayReverse() {
        if (tail == null) {
            System.out.println("Library is empty");
            return;
        }

        BookNode temp = tail;
        while (temp != null) {
            printBook(temp);
            temp = temp.prev;
        }
    }

    
    public int getTotalBooks() {
        return count;
    }

    private void printBook(BookNode b) {
    	System.out.println("ID: " + b.bookId + ", Title: " + b.title + ", Author: " + b.author + ", Genre: " + b.genre + ", Available: " + b.available);
    }
}
