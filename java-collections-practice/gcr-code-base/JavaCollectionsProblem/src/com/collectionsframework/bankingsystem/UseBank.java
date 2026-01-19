package com.collectionsframework.bankingsystem;

import java.util.*;

public class UseBank{
	
	static HashMap<Integer, Double> accounts = new HashMap<>();

    static Queue<WithdrawalRequest> withdrawalQueue = new LinkedList<>();

	
	 // Queue-based withdrawal processing
    static void processWithdrawals() {
        while (!withdrawalQueue.isEmpty()) {
            WithdrawalRequest req = withdrawalQueue.poll();
            double balance = accounts.getOrDefault(req.accountNumber, 0.0);

            if (balance >= req.amount) {
                accounts.put(req.accountNumber, balance - req.amount);
                System.out.println("Withdrawal successful for Account "
                        + req.accountNumber);
            } else {
                System.out.println("Insufficient balance for Account "
                        + req.accountNumber);
            }
        }
    }
    // TreeMap to sort customers by balance
    static void displaySortedByBalance() {
        TreeMap<Double, Integer> sortedAccounts = new TreeMap<>();

        for (Map.Entry<Integer, Double> entry : accounts.entrySet()) {
            sortedAccounts.put(entry.getValue(), entry.getKey());
        }

        System.out.println("\nAccounts Sorted by Balance:");
        for (Map.Entry<Double, Integer> entry : sortedAccounts.entrySet()) {
            System.out.println("Account: " + entry.getValue()
                    + " | Balance: " + entry.getKey());
        }
    }
    
    public static void main(String[] args) {

        // Add customer accounts
        accounts.put(1001, 50000.0);
        accounts.put(1002, 25000.0);
        accounts.put(1003, 75000.0);

        // Add withdrawal requests
        withdrawalQueue.add(new WithdrawalRequest(1001, 10000));
        withdrawalQueue.add(new WithdrawalRequest(1002, 30000));
        withdrawalQueue.add(new WithdrawalRequest(1003, 20000));

        processWithdrawals();
        displaySortedByBalance();
    }

   
   
}
