package com.day4.eventmanager;

public class EventManager {
    public static void main(String[] args) {

        Ticket[] tickets = {
            new Ticket("Rock Concert", 2500),
            new Ticket("Comedy Show", 800),
            new Ticket("Tech Conference", 5000),
            new Ticket("Music Fest", 1500),
            new Ticket("Drama Night", 1200)
         };

        System.out.println("Before Sorting:");
        for (Ticket t : tickets)
            System.out.println(t.eventName + " -> ₹" + t.price);

        TicketSorter.quickSort(tickets, 0, tickets.length - 1);

        System.out.println("\nAfter Sorting (Cheapest First):");
        for (Ticket t : tickets)
            System.out.println(t.eventName + " -> ₹" + t.price);
    }
}
