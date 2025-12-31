package com.objectmodelling.level1;

public class UseBank{
	
    public static void main(String[] args) {
    	Bank bank = new Bank("Central Bank of India");
        Customer c = new Customer("Amit");

        bank.openAccount(c);   // association created
        c.viewBalance();
    }
}


