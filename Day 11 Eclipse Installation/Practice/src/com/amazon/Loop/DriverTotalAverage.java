package com.amazon.Loop;

public class DriverTotalAverage {

	public static void main(String[] args) {
		int scores[] = new int[5];
		scores[0] = 85;
		scores[1] = 92;
		scores[2] = 78;
		scores[3] = 64;
		scores[4] = 89;

		int total = 0;

		for (int i = 0; i < scores.length; i++) {
			total = total + scores[i];
		}
		double average = total / scores.length;
		System.out.println("Total Marks : " + total);
		System.out.println("Average Score : " + average);

	}

}
