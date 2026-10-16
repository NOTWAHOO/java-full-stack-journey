package com.amazon.ControlFlow;

public class TripPlanner {
	public String suggestPlan(String src, String destination, int budget) {
		String suggestion = null;
		if (budget <= 1000) {
			System.out.println("Budget : " + budget);
			suggestion = "You can be in home only!!!";
			System.out.println(suggestion);
		} else if (budget > 1000 && budget <= 3000) {
			System.out.println("Budget : " + budget);
			suggestion = "You can visit with in city like lal bagh etc... or you can watch movie near by";
			System.out.println(suggestion);
		} else if (budget > 3000 && budget <= 5000) {
			System.out.println("Budget : " + budget);
			suggestion = "You can hire a taxi and visit near by places like Mysore etc...";
			System.out.println(suggestion);
		} else {
			System.out.println("Budget : " + budget);
			suggestion = "You can visit Goa!!!";
			System.out.println(suggestion);
		}
		return suggestion;
	}

}
