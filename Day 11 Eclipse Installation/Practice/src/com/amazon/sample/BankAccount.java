package com.amazon.sample;

public class BankAccount {
	static int nextId = 1001;
	int accountNumber;
	String holderName;
	double balance;

	BankAccount(String holderName, double balance) {
		this.holderName = holderName;
		this.balance = balance;
		this.accountNumber = nextId;
		nextId++;
	}
	void displayAccount()
	{
		System.out.println("Account Number : " +accountNumber);
		System.out.println("Holder Name : " +holderName);
		System.out.println("Balance : " +balance);
	}

}
