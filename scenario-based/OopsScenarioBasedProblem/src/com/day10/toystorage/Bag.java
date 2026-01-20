package com.day10.toystorage;


import java.util.ArrayList;
import java.util.List;

public class Bag implements Storable {

    private String id;
    private String color;
    private int capacity;
    private List<Ball> balls;

    public Bag(String id, String color, int capacity) {
        this.id = id;
        this.color = color;
        this.capacity = capacity;
        this.balls = new ArrayList<>();
    }

    // Add ball (capacity check)
    public boolean addBall(Ball ball) {
        if (balls.size() >= capacity) {
            System.out.println("Bag " + id + " is full. Cannot add ball.");
            return false;
        }
        balls.add(ball);
        return true;
    }

    // Remove ball by ID
    public boolean removeBall(String ballId) {
        return balls.removeIf(ball -> ball.getId().equals(ballId));
    }

    // Display balls
    public void displayBalls() {
        System.out.println("Balls in Bag " + id + ":");
        if (balls.isEmpty()) {
            System.out.println("No balls in this bag.");
        } else {
            for (Ball ball : balls) {
                System.out.println(ball.getDescription());
            }
        }
    }

    public int getBallCount() {
        return balls.size();
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getDescription() {
        return "Bag [ID=" + id + ", Color=" + color +
               ", Capacity=" + capacity +
               ", Balls=" + balls.size() + "]";
    }
}
