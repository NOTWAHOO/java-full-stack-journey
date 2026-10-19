
public class SCP_HEAP {

	public static void main(String[] args) {
		String heapStr = new String("Stephen Sabar");
		String scpStr = heapStr.intern(); // Returns the canonical reference from SCP

		String literalStr = "Stephen Sabar";

		System.out.println(heapStr == literalStr); // false
		System.out.println(scpStr == literalStr); // true (both point to SCP!)

	}

}
