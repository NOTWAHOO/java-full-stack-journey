class EligibleDL
{
	public static void main(String args [])
	{
		String name = args[0];
		int age = Integer.parseInt(args [1]);
		int minAge = 18;
		
		System.out.println("Name : " +name);
		System.out.println("Age : " +age);
		System.out.println("Eligible : " +((age > minAge)? "YES" : "NO"));
	
	}
}