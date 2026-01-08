package com.day6.travelplanner;
import java.util.Arrays;

public class UseTravelPlan {
	public static void main(String[] args) {

        Trip domestic=new DomesticTrip("Goa",3,new Transport(15000),new Hotel(3000),
            Arrays.asList(new Activity(2000),new Activity(1500)));

        Trip international=new InternationalTrip("Paris",5,new Transport(60000),new Hotel(8000),
            Arrays.asList(new Activity(2000),new Activity(1500)));

        domestic.book();
        international.book();
    }
}
