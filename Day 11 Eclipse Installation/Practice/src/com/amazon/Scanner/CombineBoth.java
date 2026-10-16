package com.amazon.Scanner;

public class CombineBoth {
	int serialNo;
	String product;
	int cost;

	CombineBoth(int serialNo, String product, int cost) {
		super();
		this.serialNo = serialNo;
		this.product = product;
		this.cost = cost;
	}

	void doShowDetails() {
		System.out.println("Serial No : " + serialNo);
		System.out.println("Product Name : " + product);
		System.out.println("Cost of the Product : " + cost);

	}

}
