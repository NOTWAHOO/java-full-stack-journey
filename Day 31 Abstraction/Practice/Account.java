
public class Account {
	public boolean openAccount(String name, String address, String pan) {
		connectWithDB();
		validateNameAndAddress(name, address);
		validatePan(pan);
		findAccountByPanCard();
		createUser();
		notifyUser();
		return true;
	}

	private boolean validateNameAndAddress(String name, String address) {
		System.out.println("Account.validateNameAndAddress()... Validating name and address");
		return true;
	}

	private boolean validatePan(String pan) {
		System.out.println("Account.validatePan() ... Validating PAN ");
		return true;
	}

	private void connectWithDB() {
		System.out.println("Account.connectWithDB()... DB Connection ");
	}

	private String createUser() {
		System.out.println("Account.createUser()... Creating user ID ");
		return "Someone's Account created ";
	}

	private int findAccountByPanCard() {
		System.out.println("Account.findAccountByPanCard()");
		return 5;
	}

	private String notifyUser() {
		System.out.println("Account.noString()...");
		return "YES";
	}
}
