package com.amazon.ControlFlow;

public class MakeMyTrip {
	public double offerDiscount(double fare) {

		double discount = fare;

		if (fare < 5000) {
			discount = 0;
			System.out.println("Fare : " + fare);

			System.out.println("Sorry, No Discount");
			System.out.println("Total discount : " + (fare - discount));

		} else if (fare >= 5000 && fare < 10000) {
			discount = fare - (fare * .10);
			System.out.println("Fare : " + fare);
			System.out.println("Hurry!!! 10% Discount");

			System.out.println(discount);
			System.out.println("Total discount : " + (fare - discount));
		} else if (fare >= 10000 && fare < 15000) {
			discount = fare - (fare * .15);
			System.out.println("Fare : " + fare);
			System.out.println("Hurry!! 15% Discount");

			System.out.println(discount);
			System.out.println("Total discount : " + (fare - discount));
		} else {
			System.out.println("Fare : " + fare);
			System.out.println("Maximum discount per customer is 1250 only..");

		}
		return discount;
	}
}
