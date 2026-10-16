class ProductDetails
{
	public static void main(String args[])
	{
	String productName = args[0];
	int price = Integer.parseInt(args[1]);
	
	String productName1 = args[2];
	int price1 = Integer.parseInt(args[3]);
	
	String productName2 = args[4];
	int price2 = Integer.parseInt(args[5]);
	
	ProductDetails.displayProduct(productName, price);	
	ProductDetails.displayProduct(productName1, price1);
	ProductDetails.displayProduct(productName2, price2);
	
	}
	
	static void displayProduct(String productName, int price)
	{
	System.out.println("Product name : " + productName);
	System.out.println("Product Price : " +price);
	
		
	}
}