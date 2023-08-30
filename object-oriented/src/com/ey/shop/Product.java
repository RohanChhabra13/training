package com.ey.shop;
/**This class represents Product class
 * @author HS652CZ
 * @version 1.0
 */
public class Product {

	private String name;
	private double price;
	/**
	 * This is the default constructor
	 */
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	public void print() {
		System.out.println("Name: "+name+"\tPrice: "+price);
	}
	
	@Override
	public String toString() {
		return "Product [Name: "+name+", Price: "+price+"]";
	}

	public double getPrice() {
		return price;
	}
}
