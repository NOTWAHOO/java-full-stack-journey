package com.amazon.Scanner;

public class E_CommerceApplication {

	public static void main(String[] args) {
		String material = args[0];

		int num = Integer.parseInt(args[1]);
		E_CommerceApplication application = new E_CommerceApplication();
		double dis = application.calculateDiscount(material, num);
		System.out.println("Amount : " + num);
		System.out.println("Material : " + material);
		System.out.println("Discount : " + dis);
		System.out.println("Amount after discount : " + (num - dis));

	}

	double calculateDiscount(String material, int choice) {

		double discount = 0.0;
		if (choice >= 1000) {

			switch (material) {
			case "Gold":

				discount = choice * 0.2;

				break;

			case "Silver":

				discount = choice * 0.1;

				break;
			case "Regular":

				discount = choice * 0.05;

				break;

			default:

				System.err.println("Enter a number between [1-3] ");
				break;
			}
		}
		if (discount > 2500)
			discount = 2500;
		return discount;
	}

}
