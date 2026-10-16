package com.amazon.Loop;

public class BankCustomer {
	String name;
	int balance;
	String account;

	BankCustomer(String name, int balance, String account) {
		this.name = name;
		this.balance = balance;
		this.account = account;
	}

	public void doShowCustomer() {

		System.out.println("Customer Name :" + name);
		System.out.println("Balance : " + balance);
		System.out.println("Account : " + account);
	}

}
