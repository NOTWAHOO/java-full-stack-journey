package com.amazon.Scanner;

public class DriverCombineBoth {

	public static void main(String[] args) {
		CombineBoth combine[] = { new CombineBoth(128, "Samsung Laptop", 240000),
				new CombineBoth(118, "Dell XPS Laptop", 740000), new CombineBoth(148, "Razor Blade Laptop", 250000),
				new CombineBoth(168, "Macbook M5 Laptop", 220000) };

		CombineBoth cheapProduct = combine[0];
		CombineBoth expensiveProduct = combine[0];

		for (int i = 0; i < combine.length; i++) {
			if (combine[i].cost < cheapProduct.cost) {
				cheapProduct = combine[i];

			}
			if (combine[i].cost > expensiveProduct.cost) {
				expensiveProduct = combine[i];

			}
		}
		System.out.println("-------Cheapest Product------");
		cheapProduct.doShowDetails();
		System.out.println("-------Expensive Product------");
		expensiveProduct.doShowDetails();
	}

}
