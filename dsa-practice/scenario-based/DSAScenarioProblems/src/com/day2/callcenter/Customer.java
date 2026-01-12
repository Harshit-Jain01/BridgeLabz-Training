package com.day2.callcenter;


import java.time.LocalTime;
import java.util.*;

public class Customer {
	
	 // Main method
    public static void main(String[] args) {

        Telephone t = new Telephone();

        t.receiveCall("Amit", true);
        t.receiveCall("Nancy", false);
        t.receiveCall("Saket", false);
        
       

        System.out.println("\nHandling Calls:\n");

       
        t.handleCall();
        t.handleCall();
        t.handleCall();

        t.displayCallCount();
    }

}