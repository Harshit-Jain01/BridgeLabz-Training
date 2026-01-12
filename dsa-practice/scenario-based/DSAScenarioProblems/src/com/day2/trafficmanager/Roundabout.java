package com.day2.trafficmanager;

class Roundabout {
    private VehicleNode head = null;

    public void addVehicle(String vehicleNumber) {
        VehicleNode newNode = new VehicleNode(vehicleNumber);

        if (head == null) {
            head = newNode;
            newNode.next = head;
        } else {
            VehicleNode temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
        }
        System.out.println("Vehicle entered roundabout: " + vehicleNumber);
    }

    // Remove vehicle
    public void removeVehicle(String vehicleNumber) {
        if (head == null) {
            System.out.println("Roundabout is empty");
            return;
        }

        VehicleNode curr = head;
        VehicleNode prev = null;

        do {
            if (curr.vehicleNumber.equals(vehicleNumber)) {
                if (prev == null) { // removing head
                    VehicleNode last = head;
                    while (last.next != head) {
                        last = last.next;
                    }
                    head = head.next;
                    last.next = head;
                } else {
                    prev.next = curr.next;
                }
                System.out.println("Vehicle exited roundabout: " + vehicleNumber);
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);

        System.out.println("Vehicle not found in roundabout");
    }

    // Display roundabout
    public void display() {
        if (head == null) {
            System.out.println("Roundabout is empty");
            return;
        }

        VehicleNode temp = head;
        System.out.print("Roundabout Vehicles: ");
        do {
            System.out.print(temp.vehicleNumber + " -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(back to start)");
    }
}
