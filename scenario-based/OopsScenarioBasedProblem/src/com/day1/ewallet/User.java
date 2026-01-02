package com.day1.ewallet;

public class User {
    private String name;
    private Wallet wallet;

    public User(String name, Wallet wallet) {
        this.name = name;
        this.wallet = wallet;
    }

    public String getName() {
        return name;
    }

    public Wallet getWallet() {
        return wallet;
    }

    public void loadMoney(double amount) {
        wallet.credit(amount);
        System.out.println(amount + " loaded into wallet");
    }
}
