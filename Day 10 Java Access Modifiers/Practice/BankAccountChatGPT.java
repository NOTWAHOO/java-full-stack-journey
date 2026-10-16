class BankAccountChatGPT
{
	private String accountHolder;
	private int balance;
	
	public void accountDetails(String name)
	{
	accountHolder = name	;
	System.out.println("Account Holder : " +accountHolder);
	}
	
	public void balanceInfo(int money)
	{
	balance =	money ;
	System.out.println("Balance : " +balance);
	
	}
	
	


}