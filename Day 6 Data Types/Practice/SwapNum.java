class SwapNum
{
	public static void main(String args[])
	{
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		
		System.out.println("Before swapping the two number :" + a + " and " + b);
		
		int temp = a;
		a = b;
		b = temp;
		
		System.out.println("Here are the result : " + a + " and " + b);
	}
}