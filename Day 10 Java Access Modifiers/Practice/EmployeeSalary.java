//Question 3: Employee Salary (Adding Simple Logic)

//WAP to create an Employee class with:

//A private variable salary (double).

//A public method setSalary(double amount):

//If amount is greater than 0, set the salary.

//If amount is 0 or negative, print "Invalid salary!".

//A public method getSalary() that prints the salary.

//In the main method, test it once with a positive number and once with a negative number.


class EmployeeSalary
{
	private double salary;
	
	public void setSalary(double amount)
	{
	if (amount > 0)
	{
	salary = amount ;
	System.out.println("Salary set successfully : " +salary);
	}
	else
	{ 
	System.out.println("Invalid salary!");

	}
	}
	public void getSalary()
	{
	
	System.out.println(" Current Salary : " +salary);
	
	}
}