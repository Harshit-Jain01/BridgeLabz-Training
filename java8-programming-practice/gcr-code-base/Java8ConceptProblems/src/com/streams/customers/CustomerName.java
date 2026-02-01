package com.streams.customers;

import java.util.Arrays;
import java.util.List;

public class CustomerName {

    public static void main(String[] args) {

        List<String> customers = Arrays.asList(
                "Rahul",
                "amit",
                "Neha",
                "pooja",
                "Suresh",
                "Anita"
        );

        customers.stream()
                 .map(String::toUpperCase)   // transform to uppercase
                 .sorted()                   // alphabetical order
                 .forEach(System.out::println);
    }
}
