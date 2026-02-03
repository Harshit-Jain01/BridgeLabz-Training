package com.day1.functionalinterface.predicate;

import java.util.function.Predicate;

public class FreeDeliveryCheck {
    public static void main(String[] args) {

        Predicate<Double> freeDelivery = amount -> amount >= 999;

        double orderAmount = 1200;

        System.out.println(
            freeDelivery.test(orderAmount)
            ? "Eligible for free delivery"
            : "Delivery charges apply"
        );
    }
}
