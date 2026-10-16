package com.amazon.sample;

class SuperUser extends Object {

}

public class ConstructorExtends extends SuperUser {
	String userName;
	String userId;
	String mobile;

	ConstructorExtends(String userName, String userId, String mobile) {
		this();
		this.userName = userName;
		this.userId = userId;
		this.mobile = mobile;
	}

	ConstructorExtends() {
		System.out.println("user no arguments...");
	}

	void displayStudent() {
		System.out.println("User Name : " + userName);
		System.out.println("User ID : " + userId);
		System.out.println("User Mobile : " + mobile);
	}
}
