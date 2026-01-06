package com.day4.eventease;

abstract class Event implements ISchedulable {
    private final int eventId;   
    String eventName;
    String location;
    String date;
    int attendees;

    protected double venueCost;
    protected double serviceCost;
    protected double discount;

    User organizer;

    
    public Event(int eventId,String eventName,String location,String date,
                 int attendees,User organizer,double venueCost) {
        this.eventId=eventId;
        this.eventName=eventName;
        this.location=location;
        this.date=date;
        this.attendees=attendees;
        this.organizer=organizer;
        this.venueCost=venueCost;
        this.serviceCost=0;
        this.discount=0;
    }

    // Event with catering / decoration
    public Event(int eventId,String eventName,String location,String date,
                 int attendees,User organizer,double venueCost,
                 double serviceCost,double discount) {
        this.eventId=eventId;
        this.eventName=eventName;
        this.location=location;
        this.date=date;
        this.attendees=attendees;
        this.organizer=organizer;
        this.venueCost=venueCost;
        this.serviceCost=serviceCost;
        this.discount=discount;
    }

    public double calculateCost() {
        return venueCost+serviceCost-discount;
    }

    public abstract void schedule();
}
