package com.day6.fleetmanager;

public class Vehicle {
    public String vehicleId;
    public int mileage;

    public Vehicle(String vehicleId,int mileage){
        this.vehicleId=vehicleId;
        this.mileage=mileage;
    }

    @Override
    public String toString(){
        return vehicleId+" (Mileage:"+mileage+")";
    }
}
