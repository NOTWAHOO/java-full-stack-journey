class FreeDelivery
{
	public static void main(String args [])
	{
		String name = args[0];
		int ammount = Integer.parseInt(args[1]);
		
		System.out.println("Customer name : " +name);
		System.out.println("Order Ammount : " +ammount);
		System.out.println("Delivery : " +((ammount >= 500) ? "Free" : "Chargeable"));
	}
}