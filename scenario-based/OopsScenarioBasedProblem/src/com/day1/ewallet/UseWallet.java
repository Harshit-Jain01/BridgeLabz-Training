package com.day1.ewallet;

public class UseWallet {
	    public static void main(String[] args) {

	        User u1 = new User("Amit", new PersonalWallet(100));   // referral bonus
	        User u2 = new User("Neeta", new BusinessWallet());

	        u1.loadMoney(5000);
	        u2.loadMoney(20000);

	        u1.getWallet().transferTo(u2, 2000);
	        u2.getWallet().transferTo(u1, 3000);

	        System.out.println("Amit Balance: " + u1.getWallet().getBalance());
	        System.out.println("Neeta Balance: " + u2.getWallet().getBalance());

	        System.out.println("\nTransaction History:");
	        u1.getWallet().showHistory();
	        u2.getWallet().showHistory();
	    }
	}


