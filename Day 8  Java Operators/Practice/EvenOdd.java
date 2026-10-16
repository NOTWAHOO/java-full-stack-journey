class EvenOdd
{
	public static void main(String args[])
	{
	int num = Integer.parseInt(args[0]);
	
	System.out.println("Number : " +num);
	System.out.println("Result : " +((num % 2 == 0 )? "EVEN" : "ODD"));
	}
}