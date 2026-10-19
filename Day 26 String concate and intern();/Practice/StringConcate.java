
public class StringConcate {

	public static void main(String[] args) {
		String name = "Stephen";
		String surname = " Sabar";
		String concate = name + surname;
		System.out.println("Using normal simple concate Method :" +concate);
		String st = name.concat(surname);
		System.out.println("Using Concate Method : " +st);

	}

}
