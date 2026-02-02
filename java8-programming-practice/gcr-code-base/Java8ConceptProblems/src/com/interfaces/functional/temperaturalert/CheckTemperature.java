package com.interfaces.functional.temperaturalert;

@FunctionalInterface
public interface CheckTemperature {

	boolean threshold(int temp);

}