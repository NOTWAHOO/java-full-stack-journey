package com.amazon.Loop;

public class DriverProduct {

	public static void main(String[] args) {
		Product product0 = new Product(114, "Samsung", 172000);
		Product product1 = new Product(121, "Iphone 18 Pro Max", 178000);
		Product product2 = new Product(112, "Macbook M5 Pro Max", 347000);
		Product product3 = new Product(192, "2nd Hand Macbook", 49000);
		Product product4 = new Product(102, "Macbook Mini", 150000);
		
		
		Product product[] = new Product[5];
		
		product[0] = product0;
		product[1] = product1;
		product[2] = product2;
		product[3] = product3;
		product[4] = product4;
		
		System.out.println("Product which cost more than 50K : ");
		for(int i = 0; i < product.length; i++)
		{
			if(product[i].price > 50000)
			{
				System.out.println("Product ID : " +product[i].id);
				System.out.println("Product Name : " +product[i].name);
				System.out.println("Product Cost : " +product[i].price);
			}
		}
		

	}

}
