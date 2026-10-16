class FundTransfer
{
  
  public static void main(String args[])
  {
	System.out.println(" Starting main()");
	
	  // Calling the method and passing the values(input)
    boolean result = FundTransfer.doTransaction(10, "987654321" , "1234567890");
    boolean result1 = FundTransfer.doTransaction(100, "234567" , "987654");
	boolean result2 = FundTransfer.doTransaction(120, "098765" , "123456789");
	
	System.out.println("Is txn successful ? "+ result);
	
	System.out.println(" Ending main()");
  }
  
  // 
 static boolean doTransaction(int amountToBetxn, String senderAccNo, String recAccNo)
  {
	 System.out.println(" Entered doTransaction()");
	  
	 System.out.println(" Input Received "+ amountToBetxn +" "+ senderAccNo +" "+recAccNo ); 
	 // some biz logic which will perform the transaction. 
	 
    System.out.println(" Exit doTransaction()");
     return true;	 
  }
  
  
  
}