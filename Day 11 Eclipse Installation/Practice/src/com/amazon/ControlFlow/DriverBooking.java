package com.amazon.ControlFlow;

public class DriverBooking {

	public static void main(String[] args) {
		Booking booking = new Booking();
		String pnr = booking.doBooking("RGDA","DELHI",5);
		System.out.println("PNR : " +pnr);
	}

}
