package com.day8.foodfest;

class Stall {
    String name;
    int footfall;

    public Stall(String name, int footfall) {
        this.name = name;
        this.footfall = footfall;
    }

    @Override
    public String toString() {
        return name + " (" + footfall + ")";
    }
}
