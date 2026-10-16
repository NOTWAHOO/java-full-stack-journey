package com.amazon.Inheritance;

public class Employee {
	int empID;
	String name;

	public Employee(int empID, String name) {
		this.empID = empID;
		this.name = name;

	}
	void showEmployee()
	{
		System.out.println("ID : " +empID);
		System.out.println("Name : " +name);
	}
}
