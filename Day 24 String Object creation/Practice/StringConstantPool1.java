
public class StringConstantPool1 {

	public static void main(String[] args) {
		String a = "Hello";
		String b = new String("Hello");

		System.out.println(a == b); // false (different memory locations: SCP vs Heap)
		System.out.println(a.equals(b)); // true (both have identical characters: H-e-l-l-o)

	}

}
