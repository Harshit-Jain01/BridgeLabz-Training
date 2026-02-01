package com.collectors.revenuesummary;

class Order {
	String customer;
	double total;

	public Order(String customer, double total) {
		this.customer = customer;
		this.total = total;
	}

	@Override
	public String toString() {
		return "Order [customer=" + customer + ", total=" + total + "]";
	}
}