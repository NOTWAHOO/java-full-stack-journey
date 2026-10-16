package com.amazon.sample;

public class OnlineRegistration {
	String courseName;
	int durationWeeks;
	double fee;
	
	OnlineRegistration(String courseName, int durationWeeks, double fee) {
	this.courseName = courseName;
	this.durationWeeks = durationWeeks;
	this.fee = fee;
	}
	
	void showCourseDetails()
	{
		System.out.println("Name of the Students : " +courseName);
		System.out.println("DurationWeeks of the Students : " +durationWeeks);
		System.out.println("Students of the fee : " +fee);
	}
	
}
