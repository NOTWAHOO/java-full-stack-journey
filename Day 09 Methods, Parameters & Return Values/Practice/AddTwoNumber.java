class AddTwoNumber
{
	public static void main(String args[])
	{
	int num1 = Integer.parseInt(args[0]);
	int num2 = Integer.parseInt(args[1]);	
	System.out.println("First Number : " +num1);
	System.out.println("Second Number : " +num2);
	int addNum = AddTwoNumber.add(num1,num2);
	System.out.println("Result : " +addNum);
	}
	
	static int add(int num1, int num2)
	{
	System.out.println(" First Number : " +num1+ " Second Number : " +num2 );
	return num1+num2;
	
	}
}