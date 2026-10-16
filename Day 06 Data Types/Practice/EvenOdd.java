class EvenOdd
{
	public static void main(String args[])
	{
		int a =Integer.parseInt(args [0]);
		
		System.out.println("Enter a number to find if it's even or odd : ");
		System.out.println("Entered number is : " + a );
		if ( a % 2 == 0)
		{
			System.out.println( a + " It's an Even number" );
		}
		else 
		{
		System.out.println( a + " It's a Odd number");
		}
	}
}