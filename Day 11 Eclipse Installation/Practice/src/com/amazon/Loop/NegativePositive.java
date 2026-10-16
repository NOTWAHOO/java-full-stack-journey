package com.amazon.Loop;

public class NegativePositive {

	public static void main(String[] args) {

		int[] numbers = { -15, 42, -7, 0, 89, -23, 5, -1 };

		for (int i = 0; i < numbers.length; i++) {
			double num = numbers[i];
			if (num < 0 ) {
				continue;
			} 
				System.out.println("Even number : " + num*10);
			}
		}

	}


