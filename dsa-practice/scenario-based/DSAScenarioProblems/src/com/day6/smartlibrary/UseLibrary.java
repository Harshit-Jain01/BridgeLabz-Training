package com.day6.smartlibrary;

public class UseLibrary {
	
    public static void insertionSort(Book[] books){
        for(int i=1;i<books.length;i++){
            Book key=books[i];
            int j=i-1;

            while(j>=0&&books[j].title.compareTo(key.title)>0){
                books[j+1]=books[j];
                j--;
            }
            books[j+1]=key;
        }
    }

    public static void main(String[] args){

        Book[] books={
            new Book("Data Structures"),
            new Book("Algorithms"),
            new Book("Operating Systems"),
            new Book("Computer Networks"),
            new Book("Java Programming")
        };

        System.out.println("Before Sorting:");
        for(Book b:books){
            System.out.println(b);
        }

        insertionSort(books);

        System.out.println("\nAfter Alphabetical Sorting:");
        for(Book b:books){
            System.out.println(b);
        }
    }
}
