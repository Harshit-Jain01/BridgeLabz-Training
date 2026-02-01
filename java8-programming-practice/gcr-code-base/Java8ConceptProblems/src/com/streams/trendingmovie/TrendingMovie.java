package com.streams.trendingmovie;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class TrendingMovie {
	public static void main(String[] args) {
		
		List<Movie> movies = new ArrayList<>();

        movies.add(new Movie("Inception", 9, 2010));
        movies.add(new Movie("Interstellar", 2, 2014));
        movies.add(new Movie("The Dark Knight", 10, 2008));
        movies.add(new Movie("Avengers Endgame", 5, 2019));
        movies.add(new Movie("Parasite", 9, 2019));
        movies.add(new Movie("Titanic", 8, 1997));
        movies.add(new Movie("Joker", 8, 2019));
        movies.add(new Movie("Gladiator", 9, 2000));
        movies.add(new Movie("Avatar", 8, 2009));
        movies.add(new Movie("Forrest Gump", 9, 1994));
        
       Scanner kb=new Scanner(System.in);
        System.out.println("enter filter choice(rating/year)");
        String choice=kb.next().toLowerCase();
        Comparator<Movie>comp;
        
        //filtering based on rating, release year
        switch(choice) {
        case "rating":
        	comp=(a,b)->Integer.compare(b.rating,a.rating);
        	break;
        case "year":
        	comp=(a,b)->Integer.compare(b.year,a.year);
        	break;
    	default:
    		System.out.println("invalid");
    		return;
        	
        }
        
        //used stream to filter movie
        movies.stream().filter(x->x.rating>6).sorted(comp).limit(5).forEach(System.out::println);
		
	}
}
