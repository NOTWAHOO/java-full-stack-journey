package com.amazon.Scanner;

public class DriverBook {

	public static void main(String[] args) {
		Book book[] = { new Book(101, "Java Core Mastery", 1500, 450.0), new Book(102, "Python Automation", 800, 550.0),
				new Book(103, "Cloud & DevOps Handbook", 2200, 399.0),
				new Book(104, "Data Structures in C++", 1200, 499.0) };

		Book topEarner = book[0];

		for (int i = 1; i < book.length; i++) {
			if (book[i].calculateTotalEarnings() > topEarner.calculateTotalEarnings()) {
				topEarner = book[i];
			}

		}
		System.out.println("--- Best Selling Book by Earnings ---");
		topEarner.displayBookDetails();
	}

}
