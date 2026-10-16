//Question 1: Bank Account (Focus on private and public)

//WAP to create a class named BankAccount with:

//A private variable balance (double).

//A public method deposit(double amount) that adds money to the balance.

//A public method showBalance() that prints the current balance.

//In your main method, create an object of BankAccount, deposit 500, and display the balance. //

class DriverCall
{
	public static void main(String args[])
		{
			BankAccount newObj = new BankAccount();
			newObj.add(500);
			newObj.showBalance();
			System.out.println("Balance Deposit Successful END :"  );
		}
}
