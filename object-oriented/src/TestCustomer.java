
public class TestCustomer {
public static void main(String[] args) {
	Customer c1 = new Customer("Sankalp",10000);
	c1.details();
	System.out.println("Credit limit is: "+c1.getCreditLimit());
	Customer c2 = new Customer("Sankalp",10000);
	c2.details();
}
}
