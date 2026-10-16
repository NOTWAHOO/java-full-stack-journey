class EmployeeEligibility
{
	String name;
	int age;
	int salary;
	static String company = "ABC Technologies";
	
	public static void main(String args[])
	{
	EmployeeEligibility student = new EmployeeEligibility();
	student.name = args[0];
	student.age = Integer.parseInt(args[1]);
	student.salary = Integer.parseInt(args[2]);
	
	String result = ((student.age >= 18) && (student.salary >= 25000)) ? "Eligible" : "Not Eligible";
	student.displayEmployee();
	
	System.out.println("Result : " +result);
	}
	
	void displayEmployee()
	{
	System.out.println("Name of the Employee : " +name);
	System.out.println("Age of the Employee : " +age);
	System.out.println("Salary of the Employee : " +salary);
	System.out.println("Company : " +company);
	}
}