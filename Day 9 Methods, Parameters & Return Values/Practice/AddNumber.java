class AddNumber
{
	public static void main(String args[])
	{
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
			
		System.out.println("Entered number are :" +num1);
		System.out.println("Entered number are :" +num2);
		
		int sum = AddNumber.calculateNumber (num1 , num2);
		
		System.out.println("Sum of two number are : " +sum);
		
		
	}
	
	static int calculateNumber( int num1 , int num2 )
	{
		return num1 + num2;
	}
}