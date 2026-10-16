package com.amazon.Loop;

public class DriverBankCustomer {

	public static void main(String[] args) {
		BankCustomer customer1 = new BankCustomer("Stephen Sabar", 18220, "654654841");
		BankCustomer customer2 = new BankCustomer("Asha Sabar", 1820, "65654841");
		BankCustomer customer3 = new BankCustomer("Akash Roshan Sabar", 180020, "6465481");
		BankCustomer customer4 = new BankCustomer("Zeenath Praveen", 1020, "646004841");

		BankCustomer customer[] = new BankCustomer[4];

		customer[0] = customer1;
		customer[1] = customer2;
		customer[2] = customer3;
		customer[3] = customer4;

		for (int index = 0; index < customer.length; index++) {
			if (customer[index].balance < 2000) {
				System.out.println("Customer name : " + customer[index].name);
				System.out.println("Customer balance : " + customer[index].balance);
				System.out.println("Customer Account Number : " + customer[index].account);
			}
		}

	}

}
