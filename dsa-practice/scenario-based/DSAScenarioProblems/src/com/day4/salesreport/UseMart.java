package com.day4.salesreport;

public class UseMart {
	
	public static void main(String[] args) {

	    Sales[] transactions = {
	        new Sales("2026-01-10", 1200.50, 101),
	        new Sales("2026-01-08", 500.00, 102),
	        new Sales("2026-01-10", 500.00, 103),
	        new Sales("2026-01-09", 2200.75, 104),
	        new Sales("2026-01-08", 500.00, 105),
	        new Sales("2026-01-09", 320.75, 106),
	        new Sales("2026-01-09", 50.00, 107)
	    };

	    System.out.println("Before Sorting:");
	    for (Sales t : transactions) {
	        System.out.println(t.date + " | ₹" + t.amount + " | TxnID: " + t.transactionId);
	    }

	    
	    MartReport.mergeSort(transactions, 0, transactions.length - 1);

	    
	    System.out.println("\nAfter Sorting by Amount:");
	    for (Sales t : transactions) {
	        System.out.println(t.date + " | ₹" + t.amount + " | TxnID: " + t.transactionId);
	    }
	}

}
