package com.amazon.Loop;

public class EvenNumber {

	public static void main(String[] args) {
		int num[] = {12,7,19,24,30,15,8};
		
		for(int i = 0; i < num.length; i++)
		{
			if(num[i] % 2 == 0)
			{
				System.out.println("Even number : " +num[i]);
			}
		}

	}

}
