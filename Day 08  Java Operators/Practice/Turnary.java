class Turnary
{
		public static void main(String args[])
	{
		String name = args[0];
		int age = Integer.parseInt(args[1]);
		int minAge = 18;
		int maxAge = 60;
		
		System.out.println("Entered name for DL : " +name);
		System.out.println("Entered age to Apply for DL : " +age);
		String message = ((	minAge <= age) && (maxAge >= age)) ? "Allowed" : "Not Allowed";
		System.out.println(message);
	}
}
