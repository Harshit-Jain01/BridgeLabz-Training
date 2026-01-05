package com.stackandqueue.circulartour;

public class UsePetrolPump{
    public static void main(String[] args) {

        PetrolPump[] pumps = {new PetrolPump(6, 4),new PetrolPump(3, 6),new PetrolPump(7, 3)};

        int start = CircularTour.findStart(pumps);
        System.out.println("Start Pump Index: " + start);
    }
}
