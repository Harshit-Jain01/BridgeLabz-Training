package com.generics.warehousemanagement;

public class SmartWarehouseApp {
    public static void main(String[] args) {
    	
        Storage<Electronics> techVault = new Storage<>();
        techVault.addItem(new Electronics("OLED TV"));
        techVault.addItem(new Electronics("Smartphone"));

        Storage<Furniture> homeDepot = new Storage<>();
        homeDepot.addItem(new Furniture("Ergonomic Chair"));

        WarehouseManager.displayInventory(techVault.getItems());
        WarehouseManager.displayInventory(homeDepot.getItems());
    }
}