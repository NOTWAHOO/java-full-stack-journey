

public class MobilePhone {
	String brand;
	int ram;
	double price;

	MobilePhone(String brand, int ram, double price) {
		this.brand = brand;
		this.ram = ram;
		this.price = price;
	}

	MobilePhone(String brand) {
		this.brand = brand;
		this.ram = 4;
		this.price = 9999.0;

	}
	void getSpecs()
	{
		System.out.println("Brand : " +brand);
		System.out.println("RAM : " +ram);
		System.out.println("Price : " +price);
	}
}
