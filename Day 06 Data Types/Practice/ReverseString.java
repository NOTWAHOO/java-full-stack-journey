class ReverseString
{
	public static void main(String args[])
	{
		String a = args[0];
		String b = "";
		
		System.out.println("Enter a word to reverse it : " +a);
		for (int i = a.length() - 1; i >= 0 ; i--)
		{
		b = b + a.charAt(i);
		}
		System.out.println("Result: " +b);
				
	}
}