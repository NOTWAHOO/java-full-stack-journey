package com.amazon.sample1;

public class Invoice extends Object
{
	int amount;
	String itemName;
	String billingAddress;
	String customerId;
	String customerName;
	
	Invoice(int amount, String itemName, String billingAddress, String customerId, String customerName)
	{
		this.amount = amount;
		this.itemName = itemName;
		this.billingAddress = billingAddress;
		this.customerId = customerId;
		this.customerName = customerName;
	}
	
	void displayInvoice()
	{
	System.out.println("Amount : " +amount);	
	System.out.println("Amount : " +itemName);
	System.out.println("Amount : " +billingAddress);
	System.out.println("Amount : " +customerId);
	System.out.println("Amount : " +customerName);
	}
}	
	
	class InvoiceDriver
{
	public static void main(String args[])
	{	
	Invoice inv = new Invoice(180000, "Samsung", "Rayagada Kasturi Nagar9th Lane", "S42L1", "Stephen Sabar" );
	inv.displayInvoice();
	}
	
}











