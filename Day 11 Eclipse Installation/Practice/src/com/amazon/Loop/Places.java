package com.amazon.Loop;



public class Places {

	public static void main(String[] args) {
		String[] indianCities = { "Ahmedabad", "Agra", "Amritsar", "Bengaluru", "Bhopal", "Bhubaneswar", "Chandigarh",
				"Chennai", "Coimbatore", "Dehradun", "Delhi", "Gwalior", "Hyderabad", "Indore", "Jaipur", "Jamshedpur",
				"Kochi", "Bhubaneswar", "Lucknow", "Bhubaneswar", "Madurai", "Mumbai", "Nagpur", "Patna", "Bhubaneswar",
				"Raipur", "Ranchi", "Surat", "Thiruvananthapuram", "Udaipur", "Varanasi", "Bhubaneswar",
				"Visakhapatnam" };

		for (int i = 0; i < indianCities.length; i++) {
			String cities = indianCities[i];
			
			if (cities.equals("Bhubaneswar")) {
				
				System.out.println("Yes it's a part of the cities : Bhubaneswar ");
				break;
			}
			
				
			}
			
		}

	}


