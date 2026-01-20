package com.generics.warehousemanagement;

import java.util.List;

class WarehouseManager {

	public static void displayInventory(List<? extends WarehouseItem> inventory) {
		
        for (WarehouseItem item : inventory) {
            System.out.println("- " + item);
        }
        System.out.println();
    }
}