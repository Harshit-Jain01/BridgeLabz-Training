package com.linkedlist.doubly.moviemanagement;

public class MovieLinkedList {

    private MovieNode head;
    private MovieNode tail;
    private int size;

    public void addAtBeginning(String title, String director, int year, double rating) {
        MovieNode node = new MovieNode(title, director, year, rating);

        if (head == null) {
            head = tail = node;
        } else {
            node.next = head;
            head.prev = node;
            head = node;
        }
        size++;
    }

    // Add at end
    public void addAtEnd(String title, String director, int year, double rating) {
        MovieNode node = new MovieNode(title, director, year, rating);

        if (tail == null) {
            head = tail = node;
        } else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
        size++;
    }

   
    public void addAtPosition(int position, String title, String director,
                              int year, double rating) {

        if (position <= 1) {
            addAtBeginning(title, director, year, rating);
            return;
        }
        if (position > size) {
            addAtEnd(title, director, year, rating);
            return;
        }

        MovieNode node = new MovieNode(title, director, year, rating);
        MovieNode temp = head;

        for (int i = 1; i < position - 1; i++) {
            temp = temp.next;
        }

        node.next = temp.next;
        node.prev = temp;
        temp.next.prev = node;
        temp.next = node;

        size++;
    }

    public void removeByTitle(String title) {
        if (head == null) {
            System.out.println("No movies available");
            return;
        }

        MovieNode temp = head;

        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {

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

                size--;
                System.out.println("Movie removed successfully");
                return;
            }
            temp = temp.next;
        }

        System.out.println("Movie not found");
    }

 
    public void search(String key) {
        if (head == null) {
            System.out.println("No movies available");
            return;
        }

        boolean found = false;
        MovieNode temp = head;

        while (temp != null) {
            if (temp.director.equalsIgnoreCase(key) ||
                String.valueOf(temp.rating).equals(key)) {

                printMovie(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found) {
            System.out.println("No matching movie found");
        }
    }
    
    public void updateRating(String title, double newRating) {
        MovieNode temp = head;

        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                temp.rating = newRating;
                System.out.println("Rating updated successfully");
                return;
            }
            temp = temp.next;
        }

        System.out.println("Movie not found");
    }

   
    public void displayForward() {
        if (head == null) {
            System.out.println("No movies available");
            return;
        }

        MovieNode temp = head;
        while (temp != null) {
            printMovie(temp);
            temp = temp.next;
        }
    }

    // Display reverse
    public void displayReverse() {
        if (tail == null) {
            System.out.println("No movies available");
            return;
        }

        MovieNode temp = tail;
        while (temp != null) {
            printMovie(temp);
            temp = temp.prev;
        }
    }

    private void printMovie(MovieNode m) {
        System.out.println( "Title: " + m.title +  ", Director: " + m.director + ", Year: " + m.year + ", Rating: " + m.rating );
    }
}
