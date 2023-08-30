package com.ey.shop;

import java.util.ArrayList;
import java.util.Vector;

public class ShoppingCart {

//	private Product[] products;
	private ArrayList<Product> products;
	private double total;
	private int index;

	public ShoppingCart() {
		products = new ArrayList<Product>();
	}

//	public void addToCart(Product p) throws CartException {
//		if (index == products.length)
//			throw new CartException("Your cart is full!");
//		else {
//		products[index] = p;
//		index++;
//		total += p.getPrice();}
//
//	}

	public void addToCart(Product p) {
		products.add(p);
		total += p.getPrice();
	}
//	public void checkout() {
//		System.out.println("Your order summary.....");
//		for (int i = 0; i < index; i++) {
//			products[i].print();
//			
//		}
//		System.out.println("Total Amount: " + total);
	public void checkout() {
		System.out.println("Your order summary.....");
		products.forEach(System.out::println);
		System.out.println("Total Amount: " + total);	
		}
		
	}

