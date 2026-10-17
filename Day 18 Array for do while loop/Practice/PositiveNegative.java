
public class PositiveNegative {

	public static void main(String[] args) {
		int num[] = { 12, -7, 19, -4, 0, 25, -11, 8 };
		int negative = 0;
		int positive = 0;
		int positiveSum = 0;

		for (int i = 0; i < num.length; i++) {
			if (num[i] > 0) {
				positive++;
				positiveSum += num[i];

			} else if (num[i] < 0) {
				negative++;
			}
		}
		System.out.println("Total Positive Number : " + positive);
		System.out.println("Sum of Positive Number : " + positiveSum);
		System.out.println("Total Negative Number : " + negative);
	}

}
