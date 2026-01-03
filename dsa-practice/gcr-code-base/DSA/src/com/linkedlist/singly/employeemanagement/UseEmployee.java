package com.linkedlist.singly.employeemanagement;

public class UseEmployee {

    public static void main(String[] args) {

        // Create LinkedList object
        LinkedList list = new LinkedList();

        // Add employees at last
        list.addAtLast(101, "Pihoo", "Senoir Analyst", 100000);
        list.addAtLast(102, "Rohit", "Developer", 200000);
        list.addAtLast(103, "Deepak", "Hiring group", 300000);

        // Add employee at position 2
        list.addAtPosition(104, "Ram", "IT", 6546, 2);

        // Display all employees
        list.display();

        // Delete employee (not found)
        list.delete(109);

        // Delete existing employee
        list.delete(102);

        // Display after deletion
        list.display();

        // Search employee (not found)
        list.search(109);

        // Search existing employee
        list.search(103);
    }
}
