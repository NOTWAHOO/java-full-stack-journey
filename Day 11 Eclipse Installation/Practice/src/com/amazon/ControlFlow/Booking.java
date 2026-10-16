package com.amazon.ControlFlow;

public class Booking {
	public String doBooking (String from, String to, int noOfPax)
	{
		String pnr = null;
		if (noOfPax > 6 )
		{
			System.err.println("As per IRCTC policy, only 6 person are allowed per PNR");
		}
		else
		{
			pnr = "31564564";
			System.out.println("Confirming the booking : " +pnr);
			System.out.println("Status Confirmed : YES");
			System.out.println("SEAT : 42 A1 ");
		}
		return pnr;
	}


}

