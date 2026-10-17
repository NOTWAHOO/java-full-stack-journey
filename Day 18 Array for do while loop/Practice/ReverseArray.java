
public class ReverseArray {

	public static void main(String[] args) {
		int num[] = { 10, 20, 30, 40, 50 };
		int start = 0;
		int end = num.length - 1;

		while (start < end) {
			int temp = num[start];
			num[start] = num[end];
			num[end] = temp;

			start++;
			end--;
		}
		System.out.println("Reversed Array : ");
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
	}

}
