package com.amazon.Inheritance;

public class DriverEmployeeManager {

	public static void main(String[] args) {
		Manager manager = new Manager(101, "Stephen Sabar", "IT Department");
		manager.showEmployee();
		manager.showManager();
	}

}
