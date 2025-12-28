package com.constructor.level1;

public class UseBankAccount{

    public static void main(String[] args) {

        SavingsAccount sa = new SavingsAccount(4363356,"Rahul",7546,4.5);
        sa.displayDetails();

        // modify balance using public method
        sa.setBalance(60000);
        System.out.println("Updated Balance: " + sa.getBalance());
    }
}
