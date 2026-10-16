class ProductDetails
{
	String product;
	int price;
	static String shopName = "ABC Technologies";
	
	
	public static void main(String args[])
	{
	ProductDetails customer = new ProductDetails();
	ProductDetails customer1 = new ProductDetails();
	ProductDetails customer2 = new ProductDetails();
	customer.product = "Laptop";
	customer.price = 25000;
	
	customer1.product = "Television";
	customer1.price = 35000;
	
	customer2.product = "Samsung S24 Ultra";
	customer2.price = 125000;
	
	customer.displayProduct();
	customer1.displayProduct();
	customer2.displayProduct();
	
	}
	
	void displayProduct()
	{
	System.out.println("Product Name : " +product);
	System.out.println("Cost of the Product : " +price);
	System.out.println("Shop Name : " +shopName);
	}
}