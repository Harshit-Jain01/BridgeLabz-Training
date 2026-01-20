package com.day10.toystorage;

import java.util.ArrayList;
import java.util.List;

public class ToyStorageApp {

    public static void main(String[] args) {

        List<Bag> bags = new ArrayList<>();

        Bag redBag = new Bag("B1", "Red", 2);
        Bag blueBag = new Bag("B2", "Blue", 3);

        bags.add(redBag);
        bags.add(blueBag);

        Ball ball1 = new Ball("BALL1", "Yellow", "Small");
        Ball ball2 = new Ball("BALL2", "Green", "Medium");
        Ball ball3 = new Ball("BALL3", "Blue", "Large");

        redBag.addBall(ball1);
        redBag.addBall(ball2);
        redBag.addBall(ball3); 

        redBag.displayBalls();

        redBag.removeBall("BALL1");
        redBag.displayBalls();

        System.out.println("\n--- All Bags Status ---");
        for (Bag bag : bags) {
            System.out.println(bag.getDescription());
        }
    }
}
