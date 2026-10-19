
class Account {
	public void openAccount(String userID, String email) {
		System.out.println("Account.openAccount()");
	}

}

class SavingAccount extends Account {
	@Override //changing the super class method's functionalities.
	public void openAccount(String userID, String email) {
		System.out.println("SavingAccount.openAccount()");
	}
}

class SeniorCitizenAccount extends SavingAccount {
	@Override
	public void openAccount(String userID, String email) {
		System.out.println("SeniorCitizenAccount.openAccount()");
	}
}

class PensionAccount extends SeniorCitizenAccount {
	@Override
	public void openAccount(String userID, String email) {
		System.out.println("PensionAccount.openAccount()");
	}
}

class DriverAccount {

	public static void main(String[] args) {
		PensionAccount account = new PensionAccount();
		account.openAccount("ID4987", "stephensabar@gmail.com");
		
	}

}
