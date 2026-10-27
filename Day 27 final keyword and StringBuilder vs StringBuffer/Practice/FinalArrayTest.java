

public class FinalArrayTest {
	public static void main(String[] args) {
		final int[] marks = { 85, 90, 78 };

		marks[1] = 99; // Changing value at index 1

		System.out.println("marks[1]: " + marks[1]);

		// marks = new int[]{ 10, 20, 30 }; // Line X
	}
}

	

	/*core uses of final Keyword
		final variable prevents Re-assignment (Constant)
  		final Method : Prevents Method Overriding 
  		final Class : Prevents Inheritance
  
  		what final protects:
	  	It prevents marks from pointing to a different array  in memory.
	   	example : marks = new int[]{ 10, 20, 30 }; // ❌ COMPILE ERROR! Cannot reassign reference!
  		
  		what final does NOT protect:
	  	It does not make the contents inside the array immutable.
	  	marks[1] = 99; // ✅ 100% VALID! We are modifying elements, not the reference.
  
  
  	GOLDEN RULE FOR final
  		for primitives (final int x = 10;): the value cannot change.
  		for objects & arrays (final int [] arr/ final student s ):The reference address cannot change,
  		but the internal state/ elements can still be modified.
	 	*/