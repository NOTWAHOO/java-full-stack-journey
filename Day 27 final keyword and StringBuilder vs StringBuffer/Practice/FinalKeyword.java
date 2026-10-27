class FinalKeyword
{
	public static void main (String args [])
	{

		final int UPI_LIMIT = 100000;	//variable name should be in UPPER CASE (UPI_LIMIT)//
		//UPI_LIMIT = 200000; // ❌ Compile Error: Cannot assign a value to a final variable
		System.out.println(UPI_LIMIT);
	}
}