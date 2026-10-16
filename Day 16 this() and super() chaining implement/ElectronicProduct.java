

public class ElectronicProduct extends Product{
	int warranty;
	
	public ElectronicProduct(String name, int price, String productId,int warranty)
	{
		super(name, price, productId);
		this.warranty = warranty;
	}

}
