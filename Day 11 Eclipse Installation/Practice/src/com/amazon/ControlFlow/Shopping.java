package com.amazon.ControlFlow;

public class Shopping {
	public double calculateDiscount(double amount) {
	double discount;
	if (amount < 2000)
		{
		discount = 0;
		System.out.println("Shopping Amount : " + amount);
		System.out.println("No Discount ");
		}
	else if (amount >= 2000 && amount <= 4999)
	{
		discount = amount - (amount * 5/100);
		System.out.println("Shopping Amount : " + amount);
		System.out.println("Discount : 5% Discount ");
		System.out.println("Discount Amount : " + (amount - discount));
		System.out.println("Final Amount : " + (discount - 5/100));
		
	}
	else if (amount > 5000 && amount <=9999 )
	{
		discount = amount - (amount * 10/100);
		System.out.println("Shopping Amount : " + amount);
		System.out.println("Discount : 10% Discount ");
		System.out.println("Discount Amount : " + (amount - discount));
		System.out.println("Final Amount : " + (discount - 10/100));
	}
	else
	{
			discount = amount - (amount * 15/100);
			System.out.println("Shopping Amount : " + amount);
			System.out.println("Discount : 15% Discount ");
			System.out.println("Discount Amount : " + (amount - discount));
			System.out.println("Final Amount : " + (discount - 15/100));
	}
	
	return discount;
	}
}
