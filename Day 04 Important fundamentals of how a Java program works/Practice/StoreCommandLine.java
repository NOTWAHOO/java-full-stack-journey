class StoreCommandLine
{
	public static void main(String args [])
	{
		int count = args.length;
		
		System.out.println("number of arguments:" +count);
		for (String arg : args)
		{
			System.out.println("Argument:" +arg);
		}
	}
}
	