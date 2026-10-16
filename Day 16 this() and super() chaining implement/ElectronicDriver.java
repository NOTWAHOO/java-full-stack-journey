
public class ElectronicDriver {

	public static void main(String[] args) {
		ElectronicProduct electronicProduct = new ElectronicProduct("Samsung", 140000 ,"AR1779", 2);
		
		System.out.println(electronicProduct.name);
		System.out.println(electronicProduct.price);
		System.out.println(electronicProduct.productId);
		System.out.println(electronicProduct.warranty);
	}

}
