class Age
{
	public static void main(String args[])
	{
		String name = args[0];
		int age = Integer.parseInt(args[1]);
		int minAge = 18;
		
		System.out.println("Entered name for apply DL : " +name);
		System.out.println("Apply for DL age :" +(minAge < age));
	}
}
		