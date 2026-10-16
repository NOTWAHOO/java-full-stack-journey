package com.amazon.sample;

public class BillItemDriver {

	public static void main(String[] args) {
		int arr = Integer.parseInt(args[1]);
		double arr2 = Double.parseDouble(args[2]);
		BillItem item = new BillItem(args[0], arr, arr2);
		item.generateBill();

	}

}
