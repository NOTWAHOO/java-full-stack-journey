package com.amazon.ControlFlow;

public class Product {
	int pid;
	String productName;
	double price;
	
	public Product(int pid, String productName, double price) {
		super();
		this.pid = pid;
		this.productName = productName;
		this.price = price;
	}
	void displayProduct()
	{
		System.out.println("Product ID : " +pid);
		System.out.println("ProductName" +productName);
		System.out.println("Price : " +price);
	}
	
	
}
