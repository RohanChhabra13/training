import com.ey.bank.Bank;
import com.ey.bank.Bank;
import com.ey.bank.Current;
import com.ey.bank.AccountsFactory;
import com.ey.bank.BalanceException;

public class TestAccounts {
	public static void main(String[] args) {
//		Accounts a1 = new Accounts("Polo", 5000);
//		a1.summary();
//
//		a1.deposit(1000);
//		a1.summary();
//
//		a1.withdraw(3000);
//		a1.summary();
//
//		a1.withdraw(4000);
//		Accounts a2 = new Accounts("Polo", 5000);
//		a2.summary();
//
//		Savings s1 = new Savings("Polo");
//		s1.summary();
//
//		s1.withdraw(1);
//
//		s1.deposit(1000);
//		s1.summary();

//		Bank c1 = new Current("Polo");
//	c1.summary();
//		
//		c1.witdraw(3000);
//		c1.summary();
//		
//		c1.witdraw(6000);
//		c1.summary();
//		
		
//		c1.deposit(2000);
//		c1.summary();
//		
//		c1.deposit(5000);
//		c1.summary();
		
//		AccountsFactory factory = new AccountsFactory();
//		
//		Bank c1 = AccountsFactory.createCurrentAccount("Sam");
//		c1.summary();
//		
		Bank s1 = AccountsFactory.createSavingsAccount("Ben");
		try {
			s1.witdraw(10);
		} catch (BalanceException e) {
			
//			e.printStackTrace(); // Developers troubleshoot the issues ( also mention path and exception type
//			System.out.println(e); // for logging ; auditing purposes ( also mention exception type)
			System.out.println(e.getMessage());//End users (only type message)
		}
	}
}
