package com.amazon.Loop;

public class Product {
	int id;
	String name;
	double price;
	
	public Product(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	void showProduct()
	{
		System.out.println("ID : " +id);
		System.out.println("Name of the product : " +name);
		System.out.println("Cost of the product : " +price);
	}
}
