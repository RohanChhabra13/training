package com.ey.bank;

public class CurrentTransactions extends Transactions {
	private double overdraft;

	public CurrentTransactions() {
		super();
	}


	public CurrentTransactions(String type, double amount, double balance, double overdraft) {
		super(type, amount, balance);
		this.overdraft = overdraft;
	}
	

	@Override
	public String toString() {
		return super.toString()+"\t"+overdraft;
	}
	p
	

}
