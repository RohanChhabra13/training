package com.ey.emp;
public class Manager extends Employee {

	private double incentives;

	public Manager() {
		//Optional: By default a child classs calls the default constructor of parent.
		super();
	}

	public Manager(String empName, double salary,double incentives) {
		// Constructor chaining: Calling constructor of parent class with matching signature
		super(empName, salary);
		this.incentives = incentives;
	}

	@Override
	public void payslip() {
		super.payslip(); //calling payslip of  superclass
		System.out.println("Incentives: "+ incentives);
	}

	@Override
	public double getSalary() {
		return super.getSalary()+incentives;
	}
	
	
	
	
}
