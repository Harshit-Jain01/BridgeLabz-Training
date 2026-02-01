package com.methodreferences.invoice;


public class Invoice {

	int transIDs;

	public Invoice(int transIDs) {
		this.transIDs = transIDs;
	}

	@Override
	public String toString() {
		return "Invoice [transactionIDs = " + transIDs + "]";
	}
	
}