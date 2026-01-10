package com.day1.TabHistoryManager;

public class Node {

    private Node prev;
    private String name;
    private Node next;

    public Node(String name) {
        this.prev = null;
        this.name = name;
        this.next = null;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public String getName() {
        return name;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
