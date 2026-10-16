package com.amazon.ControlFlow;

public class FastDelivery {
	
	public String doOrder (int order)
	{
	 
	String charge;
	
	
	if(order < 300)
	{
		charge = "50";
		System.out.println("Order Amount : " +order);
		System.out.println("Delivery Charges : " +charge);
		
	}
	else if(order > 300 && order <=699 )
	{
		charge = "30";
		System.out.println("Order Amount : " +order);
		System.out.println("Delivery Charges : " +charge);
	}
	else if (order > 700 && order <= 999)
	{
		charge = "10";
		System.out.println("Order Amount : " +order);
		System.out.println("Delivery Charges : " +charge);
	}
	else
	{
		charge = "Free";
		System.out.println("Order Amount : " +order);
		System.out.println("Delivery Charges : " +charge);	
	}return charge;
	
	}
}



