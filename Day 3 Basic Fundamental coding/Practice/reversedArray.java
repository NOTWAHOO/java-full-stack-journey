import java.util.Scanner;

class ReverseArray
{
	public static void main (String args [])
	{
		int[] arr = {1,2,3,4,5};
		int[] reversed = IntStream.range(0, arr.length)
			.map(i -> arr[arr.length -1 -i])
			.toArray();
			
		System.out.println(Arrays.toString(reversed));
	}
}