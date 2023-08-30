package com.ey.emp;

public class Clerk extends Employee {

	private static int commission;
	
	public Clerk() {
		super();
	}
	public Clerk(String empName, double salary,int commission) {
		// Constructor chaining: Calling constructor of parent class with matching signature
		super(empName, salary);
		this.commission = commission;
	}
	@Override
	public void payslip() {

		super.payslip();
		System.out.println("Commission is: "+commission);
	}
	@Override
	public double getSalary() {
		
		return super.getSalary()+commission;
	}
	
	
	
}
