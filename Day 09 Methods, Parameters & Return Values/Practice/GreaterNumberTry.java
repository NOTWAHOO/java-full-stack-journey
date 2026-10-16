class GreaterNumberTry
{
	public static void main(String args[])
	{
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		System.out.println("First Number is : " +num1);
		System.out.println("Second Number is : " +num2);
		
		int result = GreaterNumberTry.greaterNumber(num1 , num2);
		
		System.out.println("Greater Number is : " +result);
	
	
	}
	
	static int greaterNumber(int num1, int num2)
	{
	return num1 > num1 ? num1 : num2;
	}
}