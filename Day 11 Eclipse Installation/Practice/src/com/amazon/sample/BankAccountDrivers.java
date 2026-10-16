package com.amazon.sample;

public class BankAccountDrivers {

	public static void main(String[] args) {
		BankAccount user = new BankAccount("Stephen Sabar", 15468.0);
		BankAccount user1 = new BankAccount("Asha Rani Sabar", 15968.0);
		BankAccount user2 = new BankAccount("Akash Roshan Sabar", 15998.0);
		user.displayAccount();
		user1.displayAccount();
		user2.displayAccount();
	}

}
