package com.linkedlist.singly.inventorysystem;

public class InventoryApp {

    public static void main(String[] args) {

        InventoryLinkedList inventory = new InventoryLinkedList();

        inventory.addAtEnd(101, "Laptop", 5, 50000);
        inventory.addAtBeginning(102, "Mouse", 20, 500);
        inventory.addAtPosition(2, 103, "Keyboard", 10, 1500);
        inventory.addAtEnd(104, "Monitor", 7, 12000);

        System.out.println("Inventory:");
        inventory.displayInventory();

        inventory.updateQuantity(102, 25);

        inventory.searchById(103);
        inventory.searchByName("Laptop");

        System.out.println("\nTotal Inventory Value: " + inventory.calculateTotalValue());

        System.out.println("\nSorted by Name (Ascending):");
        inventory.sortByName(true);
        inventory.displayInventory();

        System.out.println("\nSorted by Price (Descending):");
        inventory.sortByPrice(false);
        inventory.displayInventory();
    }
}
