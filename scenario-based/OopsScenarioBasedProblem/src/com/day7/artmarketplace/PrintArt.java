package com.day7.artmarketplace;

public class PrintArt extends Artwork {

    public PrintArt(String title, String artist, double price, String licenseType, boolean hasPreview) {
        super(title, artist, price, licenseType, hasPreview);
    }

    @Override
    public void license() {
        System.out.println("Print Art License: " + licenseType + " (limited prints allowed)");
    }
}
