package com.day1.lambdaexpression.banking;

import java.util.ArrayList;
import java.util.List;

public class UseAccountLambda {
	  public static void main(String[] args) {

	        List<Account> accounts = new ArrayList<>();

	        accounts.add(new Account("Harshit", 8000));
	        accounts.add(new Account("Amit", 3000));
	        accounts.add(new Account("Neha", 12000));

	        // 1. check minimum balance rule (minimum balance = 5000)
	        System.out.println("Minimum balance check:");
	        accounts.forEach(a ->
	                System.out.println(
	                        a.holderName + " : " +
	                        (a.balance >= 5000 ? "Minimum balance maintained" : "Below minimum balance")
	                )
	        );

	        // 2. calculate simple interest (rate = 5%, time = 1 year)
	        System.out.println("\nSimple interest for each account:");
	        accounts.forEach(a ->
	                System.out.println(
	                        a.holderName + " Interest: " + (a.balance * 5 * 1 / 100)
	                )
	        );

	        // 3. validate withdrawal amount (withdraw 4000)
	        double withdrawAmount = 4000;
	        System.out.println("\nWithdrawal validation:");
	        accounts.forEach(a ->
	                System.out.println(
	                        a.holderName + " : " +
	                        (a.balance >= withdrawAmount ? "Withdrawal allowed" : "Insufficient balance")
	                )
	        );

	        // 4. print account details
	        System.out.println("\nAccount details:");
	        accounts.forEach(a -> System.out.println(a));

	        // 5. compare two account balances
	        System.out.println("\nCompare first two account balances:");
	        Account a1 = accounts.get(0);
	        Account a2 = accounts.get(1);

	        System.out.println(
	                a1.holderName + " vs " + a2.holderName + " : " +
	                (a1.balance > a2.balance ? a1.holderName + " has higher balance"
	                        : a2.holderName + " has higher balance")
	        );
	    }
	}
