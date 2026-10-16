class ElectricBill
{
	public static void main(String args[])
	{
		String name = args[0];
		int unit = Integer.parseInt(args[1]);
		int unit1 = 200;
		
		System.out.println("Customer Name : " +name);
		System.out.println("Units : " +unit);
		System.out.println("Rate : " +((unit <= 100 && unit <= 200 ) ? "Rs. 2 per unit" : "Rs. 3 per unit"));
		System.out.println("Rate above 200 : " +(unit1 < unit) ? "Rs. 5 per unit" : "Rs. 5 per unit");
		System.out.println("Total Bill : " + (unit*5 - unit));
	}
}