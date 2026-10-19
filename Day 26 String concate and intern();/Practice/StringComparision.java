
public class StringComparision {

	public static void main(String[] args) {
		String heapStr = new String("Kodewala");
		String scpStr = heapStr.intern(); // Returns the canonical reference from SCP

		String literalStr = "Kodewala";

		System.out.println(heapStr == literalStr); // false
		System.out.println(scpStr == literalStr);  // true (both point to SCP!)
		System.out.println(heapStr == scpStr);		//false

	}

}
