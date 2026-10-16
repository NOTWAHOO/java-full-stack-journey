class FundTransfer
{
	public static void main(String args[])
	{
	System.out.println("Starting main()");
	boolean result = FundTransfer.doTransaction(10, " 165499522 " , " 168798955");
	System.out.println("Is txn successful ?" +result);
	System.out.println("Ending main()");
	}
	
	static boolean doTransaction(int amountTobeTxn, String senderAccNo, String receiverAccNo)
	{
	System.out.println("Entered doTransaction");
	System.out.println("Input Received : " +amountTobeTxn+ " " +senderAccNo+ "" +receiverAccNo);
	System.out.println("Exit doTransaction()");
	return true;
	}
}