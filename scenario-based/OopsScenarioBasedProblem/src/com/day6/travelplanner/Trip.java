package com.day6.travelplanner;

import java.util.List;

public abstract class Trip implements IBookable {

    protected String destination;
    protected int duration;     
    protected double budget;

    protected Transport transport;
    protected Hotel hotel;
    protected List<Activity> activities;

    public Trip(String destination, int duration,
                Transport transport, Hotel hotel,
                List<Activity> activities) {

        this.destination = destination;
        this.duration = duration;
        this.transport = transport;
        this.hotel = hotel;
        this.activities = activities;

        this.budget = calculateTotalBudget();
    }

    private double calculateTotalBudget() {
        double total = 0;

        total += transport.getCost();                  // operator +
        total += hotel.getCost(duration);

        for (Activity a : activities) {
            total += a.getCost();
        }
        return total;
    }

    public double getBudget() {
        return budget;
    }

    @Override
    public abstract void book();
}
