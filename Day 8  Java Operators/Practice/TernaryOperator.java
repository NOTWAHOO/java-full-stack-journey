class TernaryOperator
{
		public static void main(String args[])
	{
		String name = args[0];
		int age = Integer.parseInt(args[1]);
		int minAge = 18;
		int maxAge = 60;
		
		System.out.println("Entered name for DL : " +name);
		System.out.println("Entered age to Apply for DL : " +age);
		String message = minAge < age ? "Allowed" : "Not Allowed, Minor";
		System.out.println(message);
	}
}
	