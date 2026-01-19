package com.collectionsframework.list;

class Node2 {
    String data;
    Node2 next;

    Node2(String data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node2 head;

    public void add(String data) {
        Node2 newNode = new Node2(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node2 temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public String findNthFromEnd(int n) {
        Node2 temp = head;
        Node2 next = head;

        for (int i = 0; i < n; i++) {
            if (next == null) {
                return "Invalid N";
            }
            next = next.next;
        }

        while (next != null) {
            next = next.next;
            temp = temp.next;
        }

        return temp.data;
    }
}

public class ElementFromEnd{
    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        int n = 2;
        System.out.println("Nth element from end: " + list.findNthFromEnd(n));
    }
}
