package com.amazon.ControlFlow;

public class DriverEmployee {

	public static void main(String[] args) {
		Employee employee[] = {new Employee(154, "Stephen Sabar", 14000.0),
		new Employee(14, "Akash Sabar", 1400.0),
		new Employee(15, "Asha Sabar", 140009.0),
		new Employee(54, "Sam Sabar", 140000.0)};
		
		
		
		
		Employee	highestSalary = employee[0];
		
				
		for (int i = 0; i < employee.length; i++)
		{
			if(employee[i].salary > highestSalary.salary)
			{
				highestSalary = employee[i];
			}
		}
		highestSalary.displayEmployee();
		System.out.println("Higesht Salary" +highestSalary.salary);
	}

}
