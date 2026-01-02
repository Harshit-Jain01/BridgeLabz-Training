package com.day1.vehiclerental;

public class UseVehicle{

    public static void main(String[] args) {

        Customer customer = new Customer(1, "Aman");

        Vehicle bike = new Bike("B101", "Hero", 300);
        Vehicle car = new Car("C201", "Honda", 1500);
        Vehicle truck = new Truck("T301", "Tata", 2500);

        customer.rentVehicle(bike, 3);
        customer.rentVehicle(car, 2);
        customer.rentVehicle(truck, 4);
    }
}

