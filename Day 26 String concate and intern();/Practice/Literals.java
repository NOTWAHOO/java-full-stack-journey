class Literals
{
	public static void main(String args [])
	{
	String heapStr = new String("Kodewala");
	heapStr = heapStr.intern(); // Reassigning heapStr to the returned SCP address!

	String literalStr = "Kodewala";

	System.out.println(heapStr == literalStr); // true
	System.out.println(literalStr == heapStr); // true
	}
}