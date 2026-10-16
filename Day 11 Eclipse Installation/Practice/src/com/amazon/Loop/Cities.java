package com.amazon.Loop;

public class Cities {

	public static void main(String[] args) {
		
	
		String cities[] = new String[7];
		
		cities[0] = "Rayagada";
		cities[1] = "Sambaleswar";
		cities[2] = "Bissamcuttack";
		cities[3] = "Chennai";
		cities[4] = "Srinagar";
		cities[5] = "Sambalpur";
		cities[6] = "Kolkata";
	
		for (int i = 0; i < cities.length; i++ )
		{
			if (cities[i].startsWith("S"))
			{
			System.out.println("Cities : " +cities[i]);
			}

		}

 	}
}
