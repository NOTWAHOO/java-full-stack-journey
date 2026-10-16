class FreeDelivery
{
	public static void main(String args[])
	{
	int amount = Integer.parseInt(args [0]);
		System.out.println("Entered Amount : " +amount);
		
		String result = FreeDelivery.deliveryStatus(amount);
		
		System.out.println("Delivery Charges are : " +result);
	


	
	}
	
	static String deliveryStatus(int amount)
	{
	
	return 500 <= amount ? "Free" : "Chargeable";
	
	}
}