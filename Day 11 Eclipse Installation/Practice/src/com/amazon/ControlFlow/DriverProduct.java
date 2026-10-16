package com.amazon.ControlFlow;

public class DriverProduct {

	public static void main(String[] args) {
		Product product[] = { new Product(101, "Earphones", 1499.0), new Product(102, "Smartphones", 24999.0),
				new Product(103, "USB Cables", 299.0), new Product(104, "Power Bank", 1999.0) };
		Product cheapProduct = product[0];

		for (int i = 0; i < product.length; i++) {
			if (product[i].price < cheapProduct.price) {
				cheapProduct = product[i];
			}
		}
		System.out.println("--- Cheapest Product Details ---");
		cheapProduct.displayProduct();
		//System.out.println(cheapProduct);
	}

}
