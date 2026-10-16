class OrOperator
{
	public static void main(String args[])
	{
	int totalcost =Integer.parseInt(args[0]);
	 
	String user = (totalcost >= 500) ? "Special Delivery" : "Normal Delivery";
	System.out.println("User is : " +user);
	}
}