class DriverAccessTest
{
	public static void main(String args[])
	{
	AccessTest obj = new AccessTest();
	obj.internal(10);
	
	System.out.println(obj.b);
	System.out.println(obj.c);
	System.out.println(obj.d);
	
	}


}