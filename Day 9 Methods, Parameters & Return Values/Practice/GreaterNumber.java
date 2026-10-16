class GreaterNumber
{
	public static void main(String args[])
	{
	int num1 = Integer.parseInt(args[0]);	
	int num2 = Integer.parseInt(args[1]);	
	System.out.println("First Number : " +num1);
	System.out.println("Second Number : " +num2);
	int result = GreaterNumber.greaternumber(num1 , num2);
	
	System.out.println("Greater number is : " +result);
	
		
	}
	
	static int greaternumber(int num1, int num2)
	{
		return num1 > num2 ? num1 : num2;
	}
}