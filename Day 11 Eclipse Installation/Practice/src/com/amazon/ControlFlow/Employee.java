package com.amazon.ControlFlow;

public class Employee {
	int id;
	String name;
	double salary;
	
	Employee(int id, String name, double salary)
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	void displayEmployee()
	{
		System.out.println("Id : " +id);
		System.out.println("Name : " +name);
		System.out.println("Salary : " +salary);
	}

}
