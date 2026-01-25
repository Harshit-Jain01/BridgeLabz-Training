package com.day9.tailorshop;

import java.time.LocalDate;
import java.util.Arrays;

class Order {
    int orderId;
    String customerName;
    LocalDate deadline;

    public Order(int orderId, String customerName, LocalDate deadline) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.deadline = deadline;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", customerName='" + customerName + '\'' +
                ", deadline=" + deadline +
                '}';
    }
}

