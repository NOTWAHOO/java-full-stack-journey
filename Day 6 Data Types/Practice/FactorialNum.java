class FactorialNum
{
	public static void main(String args[])
	{
		int a = Integer.parseInt(args [0]);
		
		System.out.println("Enter a number to find the Factorial of it : ");
		
		for (int i = 1; i <= a; i++  )
		{
			System.out.println("Factorial of : " + a*i);
		}
	}
}