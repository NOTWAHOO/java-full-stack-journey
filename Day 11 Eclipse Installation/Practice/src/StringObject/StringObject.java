package StringObject;

public class StringObject {

	public static void main(String[] args) {
		String s1 = "Stephen";	// SCP --> 1234waqe
		String s2 = new String ("Stephen"); 	//one object in scp + one in heap --> 124asd

		String s3 = new String ("Stephen");
		String s4 = new String ("Stephen");
		System.out.println(s3 == s4);
		System.out.println(s3.equals(s4));
	}

}
