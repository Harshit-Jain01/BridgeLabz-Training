package com.linkedlist.circular.taskschedular;

public class UseTaskSchedular {
    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();

        list.addAtLast(101, "Code Review for Payment Module", 1, "05-04-2026");
        list.addAtLast(102, "Fix Production Bug - Login Service", 3, "15-09-2026");
        list.addAtBegining(103, "Daily Standup Meeting", 2, "12-05-2026");

        list.display();

        list.viewNextTask();
        list.viewNextTask();

        list.search(3);

        list.remove(101);
        list.display();
    }
}
