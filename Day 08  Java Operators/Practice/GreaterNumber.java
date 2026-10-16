class GreaterNumber
{
	public static void main(String args[])
	{
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		
		System.out.println("First number : " +num1);
		System.out.println("Second number : " +num2);
		System.out.println("Greater number : " +((num1 >= num2) ? "First number is Greater" : "Second Number is Greater"));
	}
}