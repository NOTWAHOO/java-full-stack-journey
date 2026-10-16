class FundTransferModify
{
	public static void main(String args[])
	{
	int amountToBetxn = Integer.parseInt(args[0]);
	String senderAccNo = args[1];
	String recAccNo = args[2];

	System.out.println("Amount to be transfered : " +amountToBetxn);
	System.out.println("Sender Account Number : " +senderAccNo);
	System.out.println("Reciever Account Number : " +recAccNo);
	
	boolean result = FundTransferModify.doTransaction(amountToBetxn, senderAccNo, recAccNo);
	
	System.out.println("Fund Transfered : " +result);
	
		
		
		
	}
	
	static boolean doTransaction(int amountToBetxn, String senderAccNo, String recAccNo)
	{
	System.out.println("Amount to be transfered : " +amountToBetxn+ " Sender Account Number : " +senderAccNo+ " Reciever Account Number : " + recAccNo);
	return true;
	
	}
}