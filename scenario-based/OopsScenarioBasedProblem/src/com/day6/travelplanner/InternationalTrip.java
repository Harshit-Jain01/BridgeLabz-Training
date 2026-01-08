package com.day6.travelplanner;

import java.util.List;

public class InternationalTrip extends Trip {

    public InternationalTrip(String destination, int duration,
                             Transport transport, Hotel hotel,
                             List<Activity> activities) {
        super(destination, duration, transport, hotel, activities);
    }

    @Override
    public void book() {
        System.out.println("Booking international trip to " + destination);
        System.out.println("Passport & visa verification completed.");
        System.out.println("Total Budget: " + budget);
    }

    @Override
    public void cancel() {
        System.out.println("International trip cancelled. Refund as per policy.");
    }
}
