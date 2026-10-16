class VariablesCall
{
	int balance = 8000;		//instance variables
	static int value = 600;		//static variables
	public static void main(String args[])
	{
		//Object creating 
		VariablesCall total = new VariablesCall();
		System.out.println("Balance : " +total.balance);
		System.out.println("Value : " +VariablesCall.value);
	
	VariablesCall.doSomething();
	total.doNothing();
	
	}

	
	public static void doSomething()
		{
			System.out.println("Do Something....!");
		}
	
	public void doNothing()
	{
	System.out.println("Do Nothing....!");
	}
}