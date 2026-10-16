class AndOperator
{
	


	public static void main(String args[])
	{
	int age = Integer.parseInt(args[0]);
	int balance = Integer.parseInt(args[1]);
	
	String eligible = (age >= 18) && (balance >= 10000) ? "Eligible" : "Not Eligible";
	System.out.println("Eligible : " +eligible);
	}
}