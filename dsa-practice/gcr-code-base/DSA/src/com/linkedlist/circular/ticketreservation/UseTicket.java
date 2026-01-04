package com.linkedlist.circular.ticketreservation;

public class UseTicket{

    public static void main(String[] args) {

        TicketCircularList list = new TicketCircularList();

        list.addTicket(101, "Amit", "Inception", "A1", "10:30 AM");
        list.addTicket(102, "Param", "Avatar", "B3", "11:00 AM");
        list.addTicket(103, "Namita", "Avatar", "C2", "11:30 AM");

        System.out.println("All Tickets:");
        list.displayTickets();

        System.out.println("\nSearch by Movie Name:");
        list.searchTicket("Avatar");

        System.out.println("\nRemove Ticket ID 102");
        list.removeTicket(102);

        System.out.println("\nUpdated Ticket List:");
        list.displayTickets();

        System.out.println("\nTotal Tickets Booked: " + list.getTotalTickets());
    }
}
