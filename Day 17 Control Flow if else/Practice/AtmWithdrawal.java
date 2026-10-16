public class AtmWithdrawal {

	public static void main(String[] args) {

		double accountBalance = 25000;
		System.out.println("Current Accout Balance : Rs. " + accountBalance);
		System.out.println("Enter withdrawal amount : ");
		double amount = Double.parseDouble(args[0]);

		if (amount <= 0) {
			System.out.println("Invalid amount! Please enter a positive value. ");
		} else if (amount > accountBalance) {
			System.out.println("Transaction Failed: Insufficient balance");
		} else if (amount % 100 != 0) {
			System.out.println("Transaction Failed: Amount must be in multiples of 100");
		} else {
			accountBalance = accountBalance - amount;
			System.out.println("withdrawal successfull : Rs. " + amount);
			System.out.println("Remaining Balance : Rs. " + accountBalance);
		}

	}

}
