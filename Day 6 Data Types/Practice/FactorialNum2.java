class FactorialNum2
{
	public static void main(String args[])
	{
		int a = Integer.parseInt(args[0]);
		
		System.out.println("Factorial Number of : " +a);
		for(int i = 1; i <= a; i++)
		{
		System.out.println("Result of :" +a*i);
		}
		
	}
}