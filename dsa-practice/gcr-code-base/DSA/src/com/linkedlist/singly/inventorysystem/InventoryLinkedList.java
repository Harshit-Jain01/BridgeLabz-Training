package com.linkedlist.singly.inventorysystem;

public class InventoryLinkedList {

    private ItemNode head;

    // Add at beginning
    public void addAtBeginning(int id, String name, int qty, double price) {
        ItemNode newNode = new ItemNode(id, name, qty, price);
        newNode.next = head;
        head = newNode;
    }

    // Add at end
    public void addAtEnd(int id, String name, int qty, double price) {
        ItemNode newNode = new ItemNode(id, name, qty, price);

        if (head == null) {
            head = newNode;
            return;
        }

        ItemNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Add at specific position (1-based)
    public void addAtPosition(int pos, int id, String name, int qty, double price) {
        if (pos <= 0) {
            System.out.println("Invalid position");
            return;
        }

        if (pos == 1) {
            addAtBeginning(id, name, qty, price);
            return;
        }

        ItemNode newNode = new ItemNode(id, name, qty, price);
        ItemNode temp = head;

        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Position out of range");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Remove by Item ID
    public void removeById(int id) {
        if (head == null) {
            System.out.println("Inventory empty");
            return;
        }

        if (head.itemId == id) {
            head = head.next;
            System.out.println("Item removed");
            return;
        }

        ItemNode temp = head;
        while (temp.next != null && temp.next.itemId != id) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Item not found");
        } else {
            temp.next = temp.next.next;
            System.out.println("Item removed");
        }
    }

    // Update quantity
    public void updateQuantity(int id, int newQty) {
        ItemNode temp = head;

        while (temp != null) {
            if (temp.itemId == id) {
                temp.quantity = newQty;
                System.out.println("Quantity updated");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found");
    }

    // Search by ID
    public void searchById(int id) {
        ItemNode temp = head;

        while (temp != null) {
            if (temp.itemId == id) {
                displayItem(temp);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found");
    }

    // Search by Name
    public void searchByName(String name) {
        ItemNode temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.itemName.equalsIgnoreCase(name)) {
                displayItem(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found) {
            System.out.println("Item not found");
        }
    }

    // Total inventory value
    public double calculateTotalValue() {
        double total = 0;
        ItemNode temp = head;

        while (temp != null) {
            total += temp.price * temp.quantity;
            temp = temp.next;
        }
        return total;
    }

    // Sort by Name
    public void sortByName(boolean ascending) {
        head = mergeSort(head, true, ascending);
    }

    // Sort by Price
    public void sortByPrice(boolean ascending) {
        head = mergeSort(head, false, ascending);
    }

    // Merge Sort
    private ItemNode mergeSort(ItemNode node, boolean sortByName, boolean asc) {
        if (node == null || node.next == null)
            return node;

        ItemNode middle = getMiddle(node);
        ItemNode nextOfMiddle = middle.next;
        middle.next = null;

        ItemNode left = mergeSort(node, sortByName, asc);
        ItemNode right = mergeSort(nextOfMiddle, sortByName, asc);

        return sortedMerge(left, right, sortByName, asc);
    }

    private ItemNode sortedMerge(ItemNode a, ItemNode b, boolean byName, boolean asc) {
        if (a == null) return b;
        if (b == null) return a;

        boolean condition;
        if (byName) {
            condition = asc
                    ? a.itemName.compareToIgnoreCase(b.itemName) <= 0
                    : a.itemName.compareToIgnoreCase(b.itemName) > 0;
        } else {
            condition = asc ? a.price <= b.price : a.price > b.price;
        }

        ItemNode result;
        if (condition) {
            result = a;
            result.next = sortedMerge(a.next, b, byName, asc);
        } else {
            result = b;
            result.next = sortedMerge(a, b.next, byName, asc);
        }
        return result;
    }

    private ItemNode getMiddle(ItemNode node) {
        if (node == null) return node;

        ItemNode slow = node, fast = node.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // Display inventory
    public void displayInventory() {
        if (head == null) {
            System.out.println("Inventory empty");
            return;
        }

        ItemNode temp = head;
        while (temp != null) {
            displayItem(temp);
            temp = temp.next;
        }
    }

    private void displayItem(ItemNode i) {
        System.out.println(
                "ID: " + i.itemId +
                ", Name: " + i.itemName +
                ", Qty: " + i.quantity +
                ", Price: " + i.price
        );
    }
}

