class Reverse
{
	public static void main(String args[])
	{
	String word = args[0];
	String reverse = new StringBuilder(word).reverse().toString();
	System.out.println(reverse);
	}
}