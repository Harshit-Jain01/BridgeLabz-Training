package com.day4.eventease;

public class UseEventEase{
    public static void main(String[] args) {

        User u1=new User("Aarav","aarav@gmail.com");

        Event e1=new BirthdayEvent(101,"Birthday Party","Delhi",
                "12-Apr-2026",50,u1,20000,8000,2000);

        Event e2=new ConferenceEvent(102,"Tech Conference","Bangalore",
                "20-May-2026",300,u1,50000,20000,5000);

        e1.schedule();
        e2.schedule();

        e1.reschedule("15-Apr-2026");
        e2.cancel();
    }
}

