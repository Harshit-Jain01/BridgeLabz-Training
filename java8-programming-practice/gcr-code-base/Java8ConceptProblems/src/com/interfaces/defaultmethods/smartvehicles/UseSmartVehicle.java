package com.interfaces.defaultmethods.smartvehicles;

import java.util.Scanner;

public class UseSmartVehicle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // sample vehicles
        Vehicle petrolCar = new PetrolCar("Ertiga", 85);
        Vehicle electricScooter = new ElectricScooter("Surya S1 ", 45, 79);
        Vehicle electricCar = new ElectricCar("M&M EV", 60, 28);

        System.out.println("Smart Vehicle Dashboard Demo");
        System.out.println("1 - Petrol Car (no battery info)");
        System.out.println("2 - Electric Scooter");
        System.out.println("3 - Electric Car");
        System.out.print("Select vehicle to view dashboard (1-3): ");

        int choice = input.nextInt();

        Vehicle selectedVehicle;

        if (choice == 1) {
            selectedVehicle = petrolCar;
        } else if (choice == 2) {
            selectedVehicle = electricScooter;
        } else if (choice == 3) {
            selectedVehicle = electricCar;
        } else {
            System.out.println("Invalid choice.");
            input.close();
            return;
        }

        System.out.println("\nDashboard reading:");
        selectedVehicle.displaySpeed();
        selectedVehicle.displayBatteryPercentage();

        input.close();
    }
}