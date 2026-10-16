package com.amazon.ControlFlow;

public class ElectricityBill {
	public double calculateBill(int units)
	{
		double rate;
		double calulate;
		
		if (units < 100)
		{	
			rate = 2.0;
			calulate = units * rate;
			System.out.println("Units : " +units);
			System.out.println("Bill : " +calulate);
		}
		else if(units > 101 && units <= 200)
		{
			rate = 3.0;
			calulate = units * rate;
			System.out.println("Units : " +units);
			System.out.println("Bill : " +calulate);
		}
		else if(units > 201 && units <= 500)
		{
			rate = 5.0;
			calulate = units * rate;
			System.out.println("Units : " +units);
			System.out.println("Bill : " +calulate);
		}
		else
		{
			rate = 2.0;
			calulate = units * rate;
			System.out.println("Units : " +units);
			System.out.println("Bill : " +calulate);
		}
		return rate;
	}
}
