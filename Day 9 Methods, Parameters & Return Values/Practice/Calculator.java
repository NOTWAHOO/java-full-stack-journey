class Calculator
{
	public static void main(String args[])
	{
	int a = Integer.parseInt(args[0]);
	int b = Integer.parseInt(args[1]);
		
	System.out.println("Entered two number : " + a + "  " +b);
	
	int additional = Calculator.add(a , b);
	int subtraction = Calculator.subtract(a , b);
	int multiplication = Calculator.multiply(a , b);
	int division = Calculator.divide(a , b);	
	
	System.out.println("Additional :" +additional);
	System.out.println("Subtraction : " + subtraction);
	System.out.println("Multiplication : " +multiplication);
	System.out.println(	"Division : " +division);
				
	}
	
	static int add(int a, int b)
	{
	
	return a + b;
	}
	
	static int subtract(int a, int b)
	{
	
	return a - b;
	}
	static int multiply(int a, int b)
	{
	
	return a * b;
	}
	static int divide(int a, int b)
	{
	
	return a / b;
	}
}