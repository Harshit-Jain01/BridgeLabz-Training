package com.generics.warehousemanagement;

import java.util.ArrayList;
import java.util.List;

class Storage<T extends WarehouseItem> {
    private List<T> contents = new ArrayList<>();

    public void addItem(T item) {
        contents.add(item);
        System.out.println("Stored: " + item.getName());
    }

    public List<T> getItems() {
        return contents;
    }
}
