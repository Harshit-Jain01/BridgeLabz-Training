package com.day6.artexpo;

public class UseArtist{

    public static void insertionSort(Artist[] artists){
        for(int i=1;i<artists.length;i++){
            Artist key=artists[i];
            int j=i-1;

            while(j>=0&&artists[j].registrationTime>key.registrationTime){
                artists[j+1]=artists[j];
                j--;
            }
            artists[j+1]=key;
        }
    }

    public static void main(String[] args){

        Artist[] artists={
            new Artist("Ravi",120),
            new Artist("Anita",60),
            new Artist("Karan",180),
            new Artist("Meera",90)
        };

        System.out.println("Before Sorting:");
        for(Artist a:artists){
            System.out.println(a);
        }

        //calling insertion sort method
        insertionSort(artists);

        System.out.println("\nAfter Sorting by Registration Time:");
        for(Artist a:artists){
            System.out.println(a);
        }
    }
}
