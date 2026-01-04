package com.linkedlist.circular.ticketreservation;


public class TicketCircularList {

    private TicketNode head;
    private int count;

  
    public void addTicket(int ticketId, String customerName,
                          String movieName, String seatNumber, String bookingTime) {

        TicketNode p = new TicketNode(ticketId, customerName, movieName, seatNumber, bookingTime);

        if (head == null) {
            head = p;
            p.next = head;
        } else {
            TicketNode temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = p;
            p.next = head;
        }
        count++;
    }

    public void removeTicket(int ticketId) {
        if (head == null) {
            System.out.println("No tickets booked");
            return;
        }

        TicketNode curr = head;
        TicketNode prev = null;

        do {
            if (curr.ticketId == ticketId) {

                if (curr == head && curr.next == head) {
                    head = null;
                } else {
                    if (curr == head) {
                        TicketNode last = head;
                        while (last.next != head) {
                            last = last.next;
                        }
                        head = head.next;
                        last.next = head;
                    } else {
                        prev.next = curr.next;
                    }
                }
                count--;
                System.out.println("Ticket removed successfully");
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);

        System.out.println("Ticket ID not found");
    }

    // Display all tickets
    public void displayTickets() {
        if (head == null) {
            System.out.println("No tickets booked");
            return;
        }

        TicketNode temp = head;
        do {
            System.out.println("Ticket ID: " + temp.ticketId +
                    ", Customer: " + temp.customerName +
                    ", Movie: " + temp.movieName +
                    ", Seat: " + temp.seatNumber +
                    ", Time: " + temp.bookingTime);
            temp = temp.next;
        } while (temp != head);
    }

    // Search by customer or movie name
    public void searchTicket(String key) {
        if (head == null) {
            System.out.println("No tickets booked");
            return;
        }

        boolean found = false;
        TicketNode temp = head;

        do {
            if (temp.customerName.equalsIgnoreCase(key) ||
                temp.movieName.equalsIgnoreCase(key)) {

                System.out.println("Ticket ID: " + temp.ticketId +
                        ", Customer: " + temp.customerName +
                        ", Movie: " + temp.movieName +
                        ", Seat: " + temp.seatNumber +
                        ", Time: " + temp.bookingTime);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found) {
            System.out.println("No matching ticket found");
        }
    }

    // Total number of booked tickets
    public int getTotalTickets() {
        return count;
    }
}
