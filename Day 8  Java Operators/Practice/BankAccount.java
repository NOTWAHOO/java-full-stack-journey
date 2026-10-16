class BankAccount
{
	public static void main(String args[])
	{
		String name = args[0];
		int age = Integer.parseInt(args[1]);
		int balance = Integer.parseInt(args[2]);
		int minAge = 18;
		
		System.out.println("Name : " +name);
		System.out.println("Age : " +age);
		System.out.println("Balance : " +balance);
		System.out.println("Eligibility : " +((minAge <= age && 10000  <= balance) ? "Eligible" : "Not Eligible"));
	}
}