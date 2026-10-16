class EvenOdd
{
	public static void main(String args[])
	{
		int number = Integer.parseInt(args[0]);
		System.out.println("Entered number to find if it's Even : " +number);
		boolean result = EvenOdd.isEven(number);
		
		System.out.println("The number is Even :" +result);
		
		
	}
	
	static boolean isEven(int number)
	{
		return number % 2 ==0;
	}
}