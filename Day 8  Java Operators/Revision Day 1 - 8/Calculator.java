class Calculator
{
	static int number = 100;
	int value = 50;
	
	public static void main(String agrs[])
	{
	Calculator numb = new Calculator();	
	
	Calculator.showstatic();
	numb.showInstance();
	}
	
	static void showstatic()
	{
	System.out.println("Number : " + number);
	}
	
	void showInstance()
	{
	System.out.println("Number : " + value);
	}
}