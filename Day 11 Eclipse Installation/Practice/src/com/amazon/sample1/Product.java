package com.amazon.sample1;

public class Product {

	String productName;
	String price;
	String description;
	String quantity;

	public Product(String _productName, String _description, String _price, String _quantity) {
		this.productName = _productName;
		System.out.println("Product Name : " + productName);
		this.description = _description;
		System.out.println("Description of the Prodcut : " + description);
		this.price = _price;
		System.out.println("Cost of the Product : " + price);
		this.quantity = _quantity;
		System.out.println("Quantity of the item : " + quantity);
	}

	public Product(String _productName, String _description) {
		this.productName = _productName;
		System.out.println("Product Name : " + productName);
		this.description = _description;
		System.out.println("Description of the Prodcut : " + description);

	}

	public Product() {
		System.out.println("Product with no Attributes");
	}
}
