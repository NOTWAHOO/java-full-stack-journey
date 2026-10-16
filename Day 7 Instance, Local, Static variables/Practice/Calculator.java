
class Calculator
{	
	static int number = 100;
	int value = 50;
	
	public static void main(String args[])
	{
		Calculator call = new Calculator();	
		System.out.println("Value : " +call.value);
		Calculator.showStatic();
		call.showInstance();
	}
	
		public static void showStatic()
		{
			System.out.println("Number : " +number);
		}
		
		public void showInstance()
		{
			Calculator call = new Calculator();
			System.out.println("Value : " +call.value);
		}
	
	
}

	