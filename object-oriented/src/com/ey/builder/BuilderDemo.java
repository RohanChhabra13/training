package com.ey.builder;

public class BuilderDemo {
public static void main(String[] args) {
	Computer c1 = new Computer.Builder("Intel i3",16,512).build();
	System.out.println(c1);
	Computer c2 = new Computer.Builder("Intel i3",16,512).build();
	System.out.println(c2);
	Computer c3 = new Computer.Builder("Intel i3",16,512).build();
	System.out.println(c3);
}
}
