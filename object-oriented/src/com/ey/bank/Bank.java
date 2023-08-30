package com.ey.bank;

public interface Bank {
	//Application constants
	int INIT_ACCOUNT_NO = 10101;
	double MIN_SAVINGS = 1000;
	double OPENING_CURRENT_BAL = 5000;
	double MIN_CURRENT_BAL = 0;
	double OVERDRAFT_LIMIT =10000;
	// Application behavior (API)
	void summary();
	void deposit(double amount);
	void witdraw(double amount) throws BalanceException;
	
}
