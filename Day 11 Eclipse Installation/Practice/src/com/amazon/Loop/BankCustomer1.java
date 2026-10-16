package com.amazon.Loop;

public class BankCustomer1 {
	
	String name;
	double balances;
	
	public BankCustomer1(String name, double balances) {
		super();
		this.name = name;
		this.balances = balances;
	}
	void showDetails()
	{
		System.out.println("Name of the Richest Customer  : " +name);
		System.out.println("Balance holding : " +balances);
		
	}
	
	

}
