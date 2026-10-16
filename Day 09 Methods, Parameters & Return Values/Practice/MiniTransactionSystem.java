class MiniTransactionSystem
{
	public static void main(String args[])
	{
	int amount = Integer.parseInt(args [0]);
	String senderAccNo = args[1];
	String receiverAccNo = args[2];
	int senderBalance = Integer.parseInt(args [3]);
	
	boolean result = MiniTransactionSystem.doTransaction(amount, senderAccNo, receiverAccNo, senderBalance);
	
	System.out.println("Here are the Statements : " +result);
		
	
	
	}
	
	static boolean doTransaction(int amount, String senderAccNo, String receiverAccNo, int senderBalance)
	{
	System.out.println(" Amount : " +amount + " Sender Account No : " + senderAccNo + " Receiver Account No : " + receiverAccNo + " Sender Balance : " +senderBalance);
		
	return amount > 0 ? true : false;
	
	}
}