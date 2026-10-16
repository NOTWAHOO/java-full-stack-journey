package StringObject;

public class Test {

	public static void main(String[] args) {

		// Create a String Object
		String firstName = "Stephen"; // object created in SCP --> firstName's address --> xyz432
		String lastName = "Stephen"; // object with content "Stephen" already created
										// and lastName will refer to existing object.
										// lastName is also pointing to address xyz432

		System.out.println(firstName == lastName); // == will compare the address of an object

	}

}
