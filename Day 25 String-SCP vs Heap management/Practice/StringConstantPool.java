
public class StringConstantPool {

	public static void main(String[] args) {
		String s1 = "Java";                   // Line 1
        String s2 = "Java";                   // Line 2
        String s3 = new String("Java");       // Line 3
        String s4 = new String("Python");     // Line 4

        // 1. Comparing References (Memory Addresses) with '=='
        System.out.println(s1 == s2);         // true  (both point to same SCP object)
        System.out.println(s1 == s3);         // false (s1 in SCP, s3 in regular Heap)

        // 2. Comparing Actual Content with '.equals()'
        System.out.println(s1.equals(s3));    // true  (both hold character data "Java")

        // 3. Moving a Heap String to SCP using intern()
        String s5 = s3.intern();
        System.out.println(s1 == s5);         // true  (s5 points to the SCP copy)

	}

}
