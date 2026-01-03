package com.day2.ridehailing;

import java.util.Scanner;

public class UseRideService{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Driver input
        System.out.print("Enter driver name: ");
        String name = sc.nextLine();

        System.out.print("Enter license number: ");
        String license = sc.nextLine();

        System.out.print("Enter driver rating: ");
        double rating = sc.nextDouble();
        sc.nextLine();

        Driver driver = new Driver(name, license, rating);

        // Vehicle input
        System.out.print("Enter vehicle number: ");
        String vehicleNumber = sc.nextLine();

        System.out.print("Choose vehicle type (Mini / Sedan / SUV): ");
        String choice = sc.nextLine();

        Vehicle vehicle;
        if (choice.equalsIgnoreCase("Mini")) {
            vehicle = new Mini(vehicleNumber);
        } else if (choice.equalsIgnoreCase("Sedan")) {
            vehicle = new Sedan(vehicleNumber);
        } else {
            vehicle = new SUV(vehicleNumber);
        }

        // Ride input
        System.out.print("Enter distance (km): ");
        double distance = sc.nextDouble();

        IRideService rideService = new RideService();
        rideService.bookRide(driver, vehicle, distance);
        rideService.endRide();

        sc.close();
    }
}
