package com.day8.gamerzone;

class Player {
    String username;
    int score;

    public Player(String username, int score) {
        this.username = username;
        this.score = score;
    }

    @Override
    public String toString() {
        return username + " : " + score;
    }
}
