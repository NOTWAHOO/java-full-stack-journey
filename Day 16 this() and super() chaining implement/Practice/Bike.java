

public class Bike extends VehicleOpt 
	{
	int engineCC;
	
	Bike(String brand, int engineCC)
	{
		super(brand);
		this.engineCC = engineCC;
	}
	void displayBike()
	{
		System.out.println("Engine CC : " +engineCC);
	}
}
