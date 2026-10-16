package com.amazon.Scanner;

public class Switch {

	public static void main(String[] args) {
		Switch switch1 = new Switch();
		int day = Integer.parseInt(args[0]);

		switch1.identifyDay(day);

	}

	public void identifyDay(int number) {
		switch (number) {
		case 1:
			System.out.println("MONDAY");

			break;
		case 2:
			System.out.println("TUESDAY");

			break;
		case 3:
			System.out.println("WEDNESDAY");

			break;
		case 4:
			System.out.println("THURSDAY");

			break;
		case 5:
			System.out.println("FRIDAY");

			break;
		case 6:
			System.out.println("SATURDAY");

			break;

		case 7:
			System.out.println("SUNDAY");

			break;

		default:
			System.err.println("Please enter the correct number between [1-7] : ");
			break;
		}
	}

}
