package com.day6.travelplanner;

import java.util.List;

public class DomesticTrip extends Trip {

    public DomesticTrip(String destination, int duration,
                        Transport transport, Hotel hotel,
                        List<Activity> activities) {
        super(destination, duration, transport, hotel, activities);
    }

    @Override
    public void book() {
        System.out.println("Booking domestic trip to " + destination);
        System.out.println("Aadhar verification completed.");
        System.out.println("Total Budget: " + budget);
    }

    @Override
    public void cancel() {
        System.out.println("Domestic trip cancelled. Partial refund processed.");
    }
}
