package com.day2.trafficmanager;

public class TrafficManager {
    public static void main(String[] args) {

        Roundabout roundabout = new Roundabout();
        VehicleQueue waitingQueue = new VehicleQueue(3);

        waitingQueue.enqueue("KA01");
        waitingQueue.enqueue("KA02");
        waitingQueue.enqueue("KA03");
        waitingQueue.enqueue("KA04"); 
        String v1 = waitingQueue.dequeue();
        if (v1 != null) roundabout.addVehicle(v1);

        String v2 = waitingQueue.dequeue();
        if (v2 != null) roundabout.addVehicle(v2);

        roundabout.display();

        roundabout.removeVehicle("KA01");
        roundabout.display();

        String v3 = waitingQueue.dequeue();
        if (v3 != null) roundabout.addVehicle(v3);

        roundabout.display();

        waitingQueue.dequeue();
        waitingQueue.dequeue();
    }
}
