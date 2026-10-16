class OrderDetails
{
	public static void main(String args[])
	{
		String productName = args[0];
		int orderID = Integer.parseInt(args[1]);
		String placeBy = args[2];
		String deliveryAddress = args[3];
		
		System.out.println("Product Name : " +productName);
		System.out.println("Order ID : " +orderID);
		System.out.println("Placed By : " +placeBy);
		System.out.println("Delivery Address : " +deliveryAddress);
	}
}
		