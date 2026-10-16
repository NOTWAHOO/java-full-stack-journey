
class Payment {
	private String accountHolderName;
	private String accountNumber;
	private double balance;

	public Payment(String accountHolderName, String accountNumber, double balance) {
		super();
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public void doDebit(double amount) {
		balance = balance - amount;
	}

	public void doCredit(double amount) {
		if (amount > 0) {
			balance = balance + amount;
		}
	}

	public double getBalance() {
		return balance;
	}

}
