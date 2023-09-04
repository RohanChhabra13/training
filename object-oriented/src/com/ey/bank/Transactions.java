package com.ey.bank;

public class Transactions {
	String type;
	double amount;
	double balance;
	
	public Transactions() {
		
	}
	
	public Transactions(String type, double amount, double balance) {
		this.type = type;
		this.amount = amount;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "transactions [type=" + type + ", amount=" + amount + ", balance=" + balance + "]";
	}
	
	
}
