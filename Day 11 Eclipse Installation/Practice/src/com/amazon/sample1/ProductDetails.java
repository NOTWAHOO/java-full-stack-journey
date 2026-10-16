package com.amazon.sample1;

public class ProductDetails {

	int id;
	String name;
	double price;
	boolean inStock;

	ProductDetails(int id, String name, double price, boolean inStock) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.inStock = inStock;
	}

	void displayProduct() {
		System.out.println("Identification No : " + this.id);
		System.out.println("Name : " + this.name);
		System.out.println("Price : " + this.price);
		System.out.println("In Stock : " + this.inStock);

	}

}
