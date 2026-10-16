class OrderManagementView
{	
	private String orderStatus = "Confirmed";
	public void placeOrder(String productName)
	{
	System.out.println("Product : " +productName);
	System.out.println("Product : " +orderStatus);
	}
}