package com.day1.ambulanceroute;

class AmbulanceRoute {

    private HospitalUnit head;

    public void addUnit(String name, boolean available) {
        HospitalUnit newUnit = new HospitalUnit(name, available);

        if (head == null) {
            head = newUnit;
            newUnit.setNext(head);
            return;
        }

        HospitalUnit temp = head;
        while (temp.getNext() != head) {
            temp = temp.getNext();
        }
        temp.setNext(newUnit);
        newUnit.setNext(head);
    }

    public void redirectPatient() {
        if (head == null) {
            System.out.println("No hospital units available!");
            return;
        }

        HospitalUnit temp = head;
        do {
            if (temp.isAvailable()) {
                System.out.println("Patient redirected to: " + temp.getName());
                return;
            }
            temp = temp.getNext();
        } while (temp != head);

        System.out.println("All units are currently busy!");
    }

    public void removeUnit(String unitName) {
        if (head == null) return;

        if (head.getNext() == head && head.getName().equals(unitName)) {
            head = null;
            return;
        }

        HospitalUnit curr = head;
        HospitalUnit prev = null;

        do {
            if (curr.getName().equals(unitName)) {
                if (curr == head) {
                    HospitalUnit last = head;
                    while (last.getNext() != head) {
                        last = last.getNext();
                    }
                    head = head.getNext();
                    last.setNext(head);
                } else {
                    prev.setNext(curr.getNext());
                }
                System.out.println(unitName + " removed (maintenance).");
                return;
            }
            prev = curr;
            curr = curr.getNext();
        } while (curr != head);
    }

    public void displayUnits() {
        if (head == null) return;

        HospitalUnit temp = head;
        do {
            System.out.print(temp.getName() + " → ");
            temp = temp.getNext();
        } while (temp != head);
        System.out.println("(back to " + head.getName() + ")");
    }
}
