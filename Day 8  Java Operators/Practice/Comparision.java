class Comparision
{
	public static void main(String args[])
	{
		int minAge = 18;
		String name = args[0];
		int age = Integer.parseInt(args[1]);
		
		System.out.println("Apply for DL : " +name);
		System.out.println("Allowed to apply for DL : " +(minAge < age));
	}
}