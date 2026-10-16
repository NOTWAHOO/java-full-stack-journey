package com.amazon.ControlFlow;

public class MovieTicket {
	public double calculateTicketPrice(int age)
	{
		double ticketPrice;
		if (age < 5)
		{
			System.out.println("Age : "+age);
			System.out.println("Ticket Price : Free" );
			ticketPrice = 0;
		}
		else if (age > 5 && age <= 12)
		{
			System.out.println("Age : "+age);
			System.out.println("Ticket Price : $100" );
			ticketPrice = 100;
			
		}
		else if (age > 13 && age <= 59)
		{
			System.out.println("Age : "+age);
			System.out.println("Ticket Price : $200" );
			ticketPrice = 200;
		}
		else
		{
			System.out.println("Age : "+age);
			System.out.println("Ticket Price : $120" );
			ticketPrice = 120;
		}
		return ticketPrice;
	}
	

}
