package com.linkedlist.doubly.moviemanagement;

public class UseMovie{

    public static void main(String[] args) {

        MovieLinkedList list = new MovieLinkedList();

        list.addAtEnd("Inception", "Christopher Nolan", 2010, 9.0);
        list.addAtBeginning("Interstellar", "Christopher Nolan", 2014, 8.8);
        list.addAtPosition(2, "Avatar", "James Cameron", 2009, 8.2);

        System.out.println("Movies (Forward):");
        list.displayForward();

        System.out.println("\nMovies (Reverse):");
        list.displayReverse();

        System.out.println("\nSearch by Director:");
        list.search("Christopher Nolan");

        System.out.println("\nUpdate Rating:");
        list.updateRating("Avatar", 8.5);

        System.out.println("\nAfter Update:");
        list.displayForward();

        System.out.println("\nRemove Movie:");
        list.removeByTitle("Inception");

        System.out.println("\nFinal List:");
        list.displayForward();
    }
}

