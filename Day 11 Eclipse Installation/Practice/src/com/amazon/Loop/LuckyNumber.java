package com.amazon.Loop;

import java.util.Scanner;

public class LuckyNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int luckynum = 17;
		int userEntered = 0;
		
		while(userEntered != luckynum)
		{
			System.out.println("Please enter the Lucky Number : " +userEntered);
			userEntered = sc.nextInt();
			
			if(userEntered == luckynum)
			{
				System.out.println("You Won !!! ");
			}
			else
			{
				System.err.println("Please try again...");
			}
			
		}

	}

}
