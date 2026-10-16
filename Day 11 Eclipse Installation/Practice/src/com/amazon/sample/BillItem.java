package com.amazon.sample;

public class BillItem {
	static double gstPercent = 18.0;
	String item;
	int quantity;
	double unitPrice;

	BillItem(String item, int quantity, double unitPrice) {
		this.item = item;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
	}
	void generateBill()
	{
		double total = quantity*unitPrice;
		double tax = total*(gstPercent/100);
		System.out.println("Item : " +item);
		System.out.println("Quatity : " +quantity);
		System.out.println("Unit Price : " +unitPrice);
		System.out.println("Total before tax : " +total);
		System.out.println("Tax amount : " +tax);
		System.out.println("Final Total : " +(total+tax));
	}
}
