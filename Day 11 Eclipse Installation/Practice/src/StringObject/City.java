package StringObject;

class Driver {
	Test test = new Test();

	String firstName;
	String lastName;

	public Driver(String firstName) {
		super();
		this.firstName = firstName;
		
	}

}

public class City {
	public static void main(String[] args) {

		String city1 = "RAYAGADA";
		String city2 = "RAYAGADA";
		String city3 = "RAYAGADA";
		String city4 = "RAYAGADA";
		String city5 = "RAYAGADA";
		String city6 = "RAYAGADA";

		System.out.println(city1.equals(city2));
		
		Driver user = new Driver("RAYAGADA");
		Driver user1 = new Driver("RAYAGADA");
		

		System.out.println(user.equals(user1));

	}

}
