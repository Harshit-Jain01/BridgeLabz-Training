package com.day8.gamebox;

public abstract class Game implements IDownloadable {

    private String title;
    private String genre;
    protected double price;
    private double rating;

    public Game(String title, String genre, double price, double rating) {
        this.title = title;
        this.genre = genre;
        this.price = price;
        this.rating = rating;
    }

    public Game(String title, String genre, double rating) {
        this(title, genre, 0.0, rating);
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public double getRating() {
        return rating;
    }

    public double applyOffer(double discount) {
        price = price - discount;
        if (price < 0) {
            price = 0;
        }
        return price;
    }
}
