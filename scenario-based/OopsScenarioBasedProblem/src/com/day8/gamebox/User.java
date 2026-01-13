package com.day8.gamebox;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String name;
    private List<Game> ownedGames;

    public User(String name) {
        this.name = name;
        this.ownedGames = new ArrayList<>();
    }

    public void buyGame(Game game) {
        ownedGames.add(game);
        System.out.println(name + " purchased " + game.getTitle());
    }

    public void showOwnedGames() {
        System.out.println("Games owned by " + name + ":");
        for (Game g : ownedGames) {
            System.out.println(g.getTitle());
        }
    }
}
