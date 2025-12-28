package com.constructor.level1;

class Vehicle {

    // Instance variables
   private String ownerName;
   private String vehicleType;
    private static double registrationFee = 1500.0;

    // Constructor
    Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // display details
    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: ₹" + registrationFee);
    }

    // Class method
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    // Main method
    public static void main(String[] args) {

        Vehicle v1 = new Vehicle("Raj Mehta", "Car");
        Vehicle v2 = new Vehicle("Amit Sharma", "Bike");

        v1.displayVehicleDetails();
        System.out.println();

        v2.displayVehicleDetails();
        System.out.println("\nUpdating Registration Fee\n");

        // Updating registration fee
        Vehicle.updateRegistrationFee(2000.0);

        v1.displayVehicleDetails();
    }
}
