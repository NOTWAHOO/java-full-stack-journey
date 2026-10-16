class BankAccount
{
	String accountHolder;
	int balance;
	static String bankName = "SBI";
	
	public static void main(String args[])
	{
	BankAccount account1 = new BankAccount();
	BankAccount account2 = new BankAccount();
	
	account1.accountHolder = "Stephen Sabar";
	account1.balance = 355469;
	
	account2.accountHolder = "Tapan Kumar Sabar";
	account2.balance = 355545;
	
	System.out.println("Account Holder Name : " +account1.accountHolder);
	System.out.println("Balance : " +account1.balance);
	System.out.println("Bank Name : " +bankName);
	
	System.out.println("Account Holder Name : " +account2.accountHolder);
	System.out.println("Balance : " +account2.balance);
	System.out.println("Bank Name : " +bankName);
	}
}