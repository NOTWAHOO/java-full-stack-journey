package com.amazon.Loop;

public class DriverBankCustomer1 {

	public static void main(String[] args) {
		BankCustomer1 bankCustomer[] = {
				new BankCustomer1("Stephen Sabar", 140056.92),
				new BankCustomer1("Akash Roshan Sabar", 10056.92),
				new BankCustomer1("Asha Rani Sabar", 140956.92),
				new BankCustomer1("Milan Sabar", 14067.92),
				new BankCustomer1("Santunu Sabar", 14006.92),
		};
		
		BankCustomer1 richest = bankCustomer[0];
		
		for(int i = 0; i < bankCustomer.length; i++)
		{
			if(bankCustomer[i].balances  > richest.balances)
			{
				richest = bankCustomer[i];
			}
		}
		

	}

}
