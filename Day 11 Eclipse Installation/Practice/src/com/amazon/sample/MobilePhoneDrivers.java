package com.amazon.sample;

public class MobilePhoneDrivers {

	public static void main(String[] args) {
		MobilePhone brand = new MobilePhone("Redmi Note 7", 6, 11000.0);
		MobilePhone brand1 = new MobilePhone("Samsung NEO 2");
		brand.getSpecs();
		brand1.getSpecs();
	}

}
