package com.amazon.Scanner;

public class MaxPrices {

	public static void main(String[] args) {
		
		        int prices[] = { 120, 45, 300, 15, 80 };

		        // Step 1: Start champion with the first number
		        int max = prices[0]; 

		        // Step 2: Loop through the remaining numbers
		        for (int i = 1; i < prices.length; i++) {
		            
		            // Check if current price is GREATER than current max
		            if (prices[i] > max) {
		                max = prices[i]; // Update the champion!
		            }
		        }

		        // Step 3: Print once after loop finishes
		        System.out.println("Highest Price : " + max);
		    }
		}