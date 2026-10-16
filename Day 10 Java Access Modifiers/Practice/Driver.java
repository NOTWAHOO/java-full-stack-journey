class Driver
{
	public static void main(String args[])
	{
	System.out.println("Driver.main() START : ");
	
	OrderManagement orderManagement = new OrderManagement();
	
	orderManagement.placeOrder("Laptop");
	System.out.println("Driver.main() END");
	}
}
	