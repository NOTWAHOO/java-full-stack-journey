
public class Car {
	String brand;
	int speed;
	
	public Car()
	{
	brand = "Unknown";
	speed = 0;
	System.out.println("A new car object has been created!");
	}
	
	public void displayDetails()
	{
		System.out.println("Brand : " +brand);
		System.out.println("Speed : " +speed);
	}
}
