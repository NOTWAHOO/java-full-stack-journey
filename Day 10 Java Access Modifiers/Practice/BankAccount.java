//Question 1: Bank Account (Focus on private and public)

//WAP to create a class named BankAccount with:

//A private variable balance (double).

//A public method deposit(double amount) that adds money to the balance.

//A public method showBalance() that prints the current balance.

//In your main method, create an object of BankAccount, deposit 500, and display the balance.  //

class BankAccount
{
	private double balance;
	
	public void add (double amount)
		{
		System.out.println("Started : ");
		balance = balance + amount;
		System.out.println("Balance available : " +balance);
		}
		
		public void showBalance()
		{
			System.out.println("Available Balance : " +balance);
		}
}
