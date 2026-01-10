package com.day1.TabHistoryManager;

public class Tab {

    private Node head;
    private Node tail;
    private Node current;

    public void addWeb(String webname) {
        Node p = new Node(webname);

        if (head == null) {
            head = p;
            tail = p;
            current = p;
            return;
        }

        current.setNext(p);
        p.setPrev(current);
        current = p;
        tail = p;
    }

    public void forwardHistory() {
        if (current != null && current.getNext() != null) {
            current = current.getNext();
            System.out.println("Forward to: " + current.getName());
        } else {
            System.out.println("No forward page");
        }
    }

    public void backwardHistory() {
        if (current != null && current.getPrev() != null) {
            current = current.getPrev();
            System.out.println("Back to: " + current.getName());
        } else {
            System.out.println("No previous page");
        }
    }
}
