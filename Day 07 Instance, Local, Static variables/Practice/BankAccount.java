class BankAccount
{
	String accountHolder = "Stephen";
	int balance = 50000;
	static String bankName = "SBI";
	
	public static void main(String args[])
	{
		BankAccount account1 = new BankAccount();
		BankAccount account2 = new BankAccount();
		
		System.out.println("Account Holder name : " +account1.accountHolder);
		System.out.println("Balance : " +account2.balance);
		System.out.println("Bank Name : " +BankAccount.bankName);
	}
}