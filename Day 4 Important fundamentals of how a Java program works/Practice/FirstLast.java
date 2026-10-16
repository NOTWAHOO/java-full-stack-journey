class FirstLast
{
	public static void main(String args [])
	{
		if (args.length == 0)
		{
		System.out.println("No arguments provided");
		}
		else
		{
		System.out.println("First Argument" +args[0]);
		System.out.println("Last arguments:" +args[args.length - 1]);
		}
	}
}