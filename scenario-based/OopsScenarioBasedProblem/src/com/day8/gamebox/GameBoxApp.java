package com.day8.gamebox;

public class GameBoxApp {

    public static void main(String[] args) {

        Game game1 = new ArcadeGame("Speed Racer", 300, 4.5);
        Game game2 = new StrategyGame("Empire Builder", 500, 4.7);

        User user = new User("Raman");

        game1.download();
        game1.playDemo();

        game2.download();
        game2.playDemo();

        game2.applyOffer(100);

        user.buyGame(game1);
        user.buyGame(game2);

        user.showOwnedGames();
    }
}
