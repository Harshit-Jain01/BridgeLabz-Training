package com.streams.foreach;


import java.util.Arrays;
import java.util.List;

public class EventAttendes{

    public static void main(String[] args) {

        List<String> attendees = Arrays.asList(
                "Amit",
                "Neha",
                "Rahul",
                "Pooja",
                "Suresh"
        );

        attendees.forEach(name ->
                System.out.println("Welcome to the event, " + name + "!")
        );
    }
}
