public class Final_Methods {
	public final void Account() {
		System.out.println("Standard RBI verification protocol :");
	}

}
/*
 * class SavingAccount extends Final_Methods
 * 
 * @Override { public void verifyAccount() {
 * System.out.println("Account Verification is pending : "); } }
 */

		/* Important rules */
		/*
		 * when we use final in method it prevent method @Override. if a parent class
		 * has a method marked as final, a child class cannot override (@Override)it. It
		 * locks down the implementation.
		 */