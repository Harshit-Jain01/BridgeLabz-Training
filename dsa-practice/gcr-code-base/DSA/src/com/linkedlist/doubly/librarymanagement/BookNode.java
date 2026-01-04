package com.linkedlist.doubly.librarymanagement;


public class BookNode {

    String title;
    String author;
    String genre;
    int bookId;
    boolean available;

    BookNode next;
    BookNode prev;

    public BookNode(String title, String author, String genre,
                    int bookId, boolean available) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.bookId = bookId;
        this.available = available;
        this.next = null;
        this.prev = null;
    }
}
