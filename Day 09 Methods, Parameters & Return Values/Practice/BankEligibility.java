class BankEligibility
{
	public static void main(String args[])
	{
	int age = Integer.parseInt(args[0]);
	int balance = Integer.parseInt(args[1]);
	
	System.out.println("Age of the Customer : " +age);
	System.out.println("Balance of the Customer : " +balance);
	
	boolean result = BankEligibility.checkEligibility(age, balance);
	
	System.out.println("Checking Eligibility :" +result);
	
	
	}
	
	static boolean checkEligibility(int age, int balance)
	{
	return (age >= 18 && balance >= 10000) ? true : false;
	}
}