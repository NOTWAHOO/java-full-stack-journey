class Employee
{	
	String name;
	int salary;
	static String company = "Microsoft";
	
	public static void main(String args[])
	{
		Employee emp = new Employee();
		Employee emp1 = new Employee();
		
		emp.name = "Stephen Sabar";
		emp.salary = 200000;
		
		emp1.name = "Akash Roshan Sabar";
		emp1.salary = 300000;
		
		System.out.println("Employee Name : " +emp.name);
		System.out.println("Salary : " +emp.salary);
		System.out.println("Company : " +company);
		
		
		System.out.println("Employee Name : " +emp1.name);
		System.out.println("Salary : " +emp1.salary);
		System.out.println("Company : " +company);
	}
}