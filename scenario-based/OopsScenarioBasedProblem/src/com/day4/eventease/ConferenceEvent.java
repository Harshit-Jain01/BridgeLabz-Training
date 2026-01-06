package com.day4.eventease;

class ConferenceEvent extends Event {

    public ConferenceEvent(int eventId,String name,String location,String date,
                            int attendees,User organizer,double venueCost,
                            double serviceCost,double discount) {
        super(eventId,name,location,date,attendees,organizer,
              venueCost,serviceCost,discount);
    }

   
    public void schedule() {
        System.out.println("Conference scheduled with registrations open");
        System.out.println("Total Cost:"+calculateCost());
    }

    
    public void reschedule(String newDate) {
        date=newDate;
        System.out.println("Conference rescheduled to "+date);
    }

  
    public void cancel() {
        System.out.println("Conference cancelled and refunds initiated");
    }
}
