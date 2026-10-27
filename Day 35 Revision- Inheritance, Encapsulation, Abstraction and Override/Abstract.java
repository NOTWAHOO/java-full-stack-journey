package OOPs_Revision;

public class Abstract {

	private int balance;

	// public int balance;
	// this method will modify the balance
	public void credit() {

		// check the balance of sender
		checkBalance();
		// check the pin of sender
		validatePin("a6s5d4f");
		// debit the amount credit
		// the amount --> 0 --> 100

		System.out.println("Encapsulation.credit().... doing fund transfer  ");
	}

	private int checkBalance() {
		System.out.println("Encapsulation.checkBalance()");
		return 7835;
	}

	private boolean validatePin(String userId) {
		System.out.println("Encapsulation.validatePin()");
		return true;

	}
}
