package com.interfaces.basic.rentvehicle;

public interface Rentable {
    // rents the vehicle for the given number of hours
    void rent(int hours);

    void returnVehicle();
}