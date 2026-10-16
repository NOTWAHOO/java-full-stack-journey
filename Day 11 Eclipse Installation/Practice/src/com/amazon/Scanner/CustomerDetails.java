package com.amazon.Scanner;

import java.util.Scanner;

public class CustomerDetails {

	public static void main(String[] args) {
		System.out.println("Please enter the details for a ready made receipt : ");
		Scanner sc = new Scanner(System.in);
		
		
		
		String name = sc.nextLine();
		System.out.println("Name : " + name);
		
		String phone = sc.nextLine();
		System.out.println("Phone Number : " + phone);
		
		int cost = sc.nextInt();
		System.out.println("Cost : " + cost);
		sc.nextLine();
		String address = sc.nextLine();
		System.out.println("Address : " + address);
		String product = sc.nextLine();
		System.out.println("Product : " + product);

		System.out.println("Name : " + name);
		System.out.println("Phone Number : " + phone);
		System.out.println("Product : " + product);

		System.out.println("Cost : " + cost);
		System.out.println("Address : " + address);

		sc.close();

	}

}
