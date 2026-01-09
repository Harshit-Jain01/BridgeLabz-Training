package com.day7.artmarketplace;

public abstract class Artwork implements IPurchasable {

    private String title;
    private String artist;
    protected double price;          
    protected String licenseType;     
    private boolean hasPreview;

    public Artwork(String title, String artist, double price, String licenseType) {
        this(title, artist, price, licenseType, false);
    }

    public Artwork(String title, String artist, double price, String licenseType, boolean hasPreview) {
        this.title = title;
        this.artist = artist;
        this.price = price;
        this.licenseType = licenseType;
        this.hasPreview = hasPreview;
    }

    @Override
    public void purchase(User user) {
        if (user.getWalletBalance() >= price) {
            user.deductBalance(price);   
            System.out.println(title + " purchased successfully.");
        } else {
            System.out.println("Insufficient wallet balance.");
        }
    }
}
