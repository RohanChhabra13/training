package com.ey.bank;

import java.util.ArrayList;
import java.util.List;

public abstract class Accounts implements Bank {
	private int acntNo;
	private String holder;
	protected double balance;
	protected List<Transactions> txns;
	//private static int actNoCounter= 10;
	
	//Application Constants
	
	
	private static int counter = INIT_ACCOUNT_NO;
	public Accounts() {
		// TODO Auto-generated constructor stub
	}

	public Accounts(String holder, double balance) {
		this.acntNo = counter++;
		this.holder = holder;
		this.balance = balance;
		txns = new ArrayList<>();
	}

	public void summary() {
		System.out.println("A/C No. " + acntNo);
		System.out.println("Holder: " + holder);
		System.out.println("Balance: " + balance);

	}

	public void deposit(double amount) {
		balance += amount;
		txns.add(new Transactions("CR",amount,balance));
	}

@Override
	public void statement() {
		for (Transactions transactions : txns) {
			txns.forEach(System.out::println);
		}
	}

public abstract void withdraw(double amount);
//		if (amount <= balance)
//			balance -= amount;
//		else
//			System.out.println("Insufficient balance!");
//	}

}
