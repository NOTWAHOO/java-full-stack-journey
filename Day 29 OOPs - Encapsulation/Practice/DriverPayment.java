
public class DriverPayment {

	public static void main(String[] args) {
		Payment user = new Payment("Stephen Sabar", "ACC798954", 1324654.45);
		user.doCredit(800.99);
		System.out.println(user.getBalance());
		user.doDebit(400.45);
		System.out.println(user.getBalance());

	}

}
