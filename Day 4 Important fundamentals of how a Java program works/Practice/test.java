class FrstLast
{
	public static void main(String args[])
	{
		if (args.length == 0)
		{
			System.out.println("Total String Entered 0");
		}
		else
		{
			System.out.println("First number is : " +args[0]);
			System.out.println("Last number is : " +args[args.length - 1]);
		}
	}
}