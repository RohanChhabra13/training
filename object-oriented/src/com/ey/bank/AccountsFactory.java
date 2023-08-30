package com.ey.bank;

public final class AccountsFactory { // making it final 

	private AccountsFactory() { //making constructor private
		
	}
	public static Savings createSavingsAccount(String holder) {
		return new Savings(holder);
	}
	public static Current createCurrentAccount(String holder) {
		return new Current(holder);
	}
}
