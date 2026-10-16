package com.amazon.ControlFlow;

public class HotelBooking {
	public double calculateAmount(double roomPrice, int nights)
	{
		double total = roomPrice * nights;
		
		double discount;
		
		if(roomPrice < 5000)
		{	
			
			discount = roomPrice - (roomPrice * 0)/100;
			System.out.println("Room Price : " +roomPrice);
			System.out.println("Nights : " +nights);
			System.out.println("Total : " +total);
			System.out.println("0% Discount");
			System.out.println("Final Amount : " +(total - (total - discount)));
		}
		else if (roomPrice > 5000 && roomPrice <= 9999)
		{
			
			discount = roomPrice - (roomPrice * 10)/100;
			System.out.println("Room Price : " +roomPrice);
			System.out.println("Nights : " +nights);
			System.out.println("Total : " +total);
			System.out.println("10% Discount");
			System.out.println("Final Amount : " +(total - (total - discount)));
		}
		else if (roomPrice > 10000 && roomPrice <= 19999)
		{
			
			discount = roomPrice - (roomPrice * 15)/100;
			System.out.println("Room Price : " +roomPrice);
			System.out.println("Nights : " +nights);
			System.out.println("Total : " +total);
			System.out.println("10% Discount");
			System.out.println("Final Amount : " +(total - (total - discount)));
		}
		else
		{
			
			discount = roomPrice - (roomPrice * 20)/100;
			System.out.println("Room Price : " +roomPrice);
			System.out.println("Nights : " +nights);
			System.out.println("Total : " +total);
			System.out.println("10% Discount");
			System.out.println("Final Amount : " +(total - (total - discount)));
		}
		return discount;
		
	}

}
