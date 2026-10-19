
public class DriverStringBuilderSQL {

	public static void main(String[] args) {
		StringBuilderSQL generate = new StringBuilderSQL();
		StringBuilder result = generate.generateQuery(20000, "Stephen Sabar");
		System.out.println(result);
	}

}
