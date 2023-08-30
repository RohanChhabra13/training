package com.ey.bank;
public class Savings extends Accounts {

	public Savings() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Savings(String holder) {
		super(holder, 1000);
		
	}

	@Override
	public void withdraw(double amount) {
		
		
		
	}

	@Override
	public void witdraw(double amount) throws BalanceException {
		if(amount<= (balance-1000))
			balance-=amount;
		else
			throw new BalanceException("Insufficient balance!");
		
	}

	
}
