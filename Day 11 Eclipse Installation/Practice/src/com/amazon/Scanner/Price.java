package com.amazon.Scanner;

import java.util.Scanner;

public class Price {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int price = 0;

		System.out.println("Please enter the price... ");

		if (sc.hasNextInt()) {
			price = sc.nextInt();
		} else {
			System.out.println("Please enter the price in correct format..");
		}
		System.out.println("The Price : " + price);
		sc.close();

	}

}
