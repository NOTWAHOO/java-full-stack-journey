class Product
{

	String productName;
	int price;
	static String shopName = "ABC Store";
	
	public static void main(String args [])
	{
		Product product1 = new Product();
		Product product2 = new Product();	
		Product product3 = new Product();	
		
		product1.productName = "Laptop";
		product1.price = 50000;
				
		System.out.println("Product : " +product1.productName);
		System.out.println("Price : " + product1.price);
		System.out.println("Shop Name : " +shopName);
		
		product2.productName = "Phone";
		product2.price = 30000;
		System.out.println("Product : " +product2.productName);
		System.out.println("Price : " + product2.price);
		System.out.println("Shop Name : " +shopName);
		
		product3.productName = "Headphones";
		product3.price = 5000;
		System.out.println("Product : " +product3.productName);
		System.out.println("Price : " + product3.price);
		System.out.println("Shop Name : " +shopName);
		product1.displayProduct();
	}
		void displayProduct()
	{
		System.out.println("Shop Name : " +shopName);
		
	}
}