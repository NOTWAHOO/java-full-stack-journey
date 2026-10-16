class PrivateDriver
{
	public static void main(String args[])
	{
	System.out.println("Driver.main() START : ");
	
	PrivateOrderManagement order = new PrivateOrderManagement();
	
	order.placeOrder("Laptop");
	System.out.println("Driver.main() END");
	}
}