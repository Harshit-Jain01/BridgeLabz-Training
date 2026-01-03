package com.linkedlist.singly.studentrecord;

public class UseStudent{

    public static void main(String[] args) {

        StudentLinkedList list = new StudentLinkedList();

        list.addAtBeginning(1, "Amit", 20, 'A');
        list.addAtEnd(2, "Neha", 21, 'B');
        list.addAtPosition(2, 3, "Karan", 19, 'A');

        System.out.println("All Students:");
        list.displayAll();

        System.out.println("\nSearch Roll No 2:");
        list.searchByRollNo(2);

        list.updateGrade(3, 'A');

        list.deleteByRollNo(1);

        System.out.println("\nAfter Deletion:");
        list.displayAll();
    }
}
