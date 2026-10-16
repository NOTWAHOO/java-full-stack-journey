package com.amazon.Loop;

public class Student {
	String name;
	int marks;
	Student(String name, int marks)
	{
		this.name = name;
		this.marks = marks;
	}
	void showDetails()
	{
		System.out.println("Name : " +name);
		System.out.println("Marks : " +marks);
	}

}
