
public class Customer {

	private int CustId;
	private String CustName;
	private int CreditLimit;
	
	private static int custIdCounter=1;
	public Customer() {
		
	}
	public Customer(String custName, int creditLimit) {
		CustId = custIdCounter++;
		CustName = custName;
		CreditLimit = creditLimit;
	}
	public void details() {
		System.out.println("Customer Id: "+CustId);
		System.out.println("Customer Name: "+CustName);
		System.out.println("Credit Limit: "+CreditLimit);
	}
	public int getCreditLimit() {
		return CreditLimit;
	}
	
}
