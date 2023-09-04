package com.ey.bank;
public class Current extends Accounts{
private double overdraft;
	public Current() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Current(String holder) {
		super(holder, OPENING_CURRENT_BAL);
		this.overdraft=OVERDRAFT_LIMIT;
		txns.add(new CurrentTransactions("OB",OPENING_CURRENT_BAL,balance,overdraft));
	}
	

	@Override
	public void summary() {
		super.summary();
		System.out.println("Overdraft: "+overdraft);
	}

/*	@Override
	public void deposit(double amount) {
		if((OVERDRAFT_LIMIT-overdraft)>=amount ) {
			overdraft+=amount;
			amount=0;
		}
		else {
			overdraft =OVERDRAFT_LIMIT;
			amount-=(OVERDRAFT_LIMIT-overdraft);
		}
		
		balance+=amount;
	} */

	@Override
	public void deposit(double amount) {
		overdraft+=amount;
		if(overdraft>10000) {
			balance+=(overdraft-10000);
			overdraft=10000;
			txns.add(new CurrentTransactions("CR",amount,balance,overdraft));
		}
	}

	
//	@Override
//	public void withdraw(double amount) {
//		if(balance < amount) {
//				amount-=balance;
//				balance=MIN_CURRENT_BAL;
//				overdraft-=amount;
//		}
//		else balance-=amount;
//	}

	@Override
	public void witdraw(double amount) throws BalanceException {
		
		if(amount<=(balance+overdraft)) {
			balance-=amount;
			if(balance<0) {
				overdraft-=balance;
				balance=0;
			}
		txns.add(new CurrentTransactions("DR",amount,balance,overdraft));}
		else 
			{throw new BalanceException("Insufficient balance!");}
	}

	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		
	}


}






//@Override
//public void withdraw(double amount) {
//	
//}