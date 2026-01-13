package com.day8.gamebox;

public class StrategyGame extends Game {

    public StrategyGame(String title, double price, double rating) {
        super(title, "Strategy", price, rating);
    }

    @Override
    public void download() {
        System.out.println("Downloading strategy game: " + getTitle());
    }

    @Override
    public void playDemo() {
        System.out.println("Playing strategy demo with limited levels for " + getTitle());
    }
}
