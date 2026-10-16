package com.amazon.sample;

public class OnlineRegistrationDrivers {

	public static void main(String[] args) {
		OnlineRegistration course = new OnlineRegistration("Java Full Stack", 12, 4999.0);
		OnlineRegistration course1 = new OnlineRegistration("Python", 6, 2499.0);
		course.showCourseDetails();
		course1.showCourseDetails();
	}

}
