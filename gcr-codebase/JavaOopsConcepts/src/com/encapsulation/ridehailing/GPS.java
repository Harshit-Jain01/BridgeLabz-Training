package com.encapsulation.ridehailing;


public interface GPS {

    void updateLocation(String location);

    String getCurrentLocation();
}
