package com.amazon.ControlFlow;

public class MobileRecharge {
	public double calculateRecharge(double amount)
	{
		double cashback;
		if(amount < 199)
		{	
			cashback = 0;
			System.out.println("Recharge Amount : " +amount);
			System.out.println("Cashback : " +cashback + " Cashback");
			System.out.println("Final Amount : " +(amount - cashback));

		}
		else if (amount > 199 && amount <= 499)
		{
			cashback = 20;
			System.out.println("Recharge Amount : " +amount);
			System.out.println("Cashback : " +cashback + " Cashback");
			System.out.println("Final Amount : " +(amount - cashback));
		}
		else if (amount > 500 && amount <= 999)
		{
			cashback = 50;
			System.out.println("Recharge Amount : " +amount);
			System.out.println("Cashback : " +cashback + " Cashback");
			System.out.println("Final Amount : " +(amount - cashback));
		}
		else 
		{
			cashback = 100;
			System.out.println("Recharge Amount : " +amount);
			System.out.println("Cashback : " +cashback + " Cashback");
			System.out.println("Final Amount : " +(amount - cashback));
		}
		return cashback;
	}

}
