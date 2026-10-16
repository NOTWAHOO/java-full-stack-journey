class Employee
{
	String name = "Stephen";
	int salary = 30000;
	static String company = "ABC Technologies";
	
	public static void main(String args[])
	{
		Employee emp = new Employee();
		System.out.println("Employee name : " +emp.name);
		System.out.println("Salary : " +emp.salary);
		System.out.println("Company name : " +Employee.company);
	Employee.showEmployee();
	emp.showEmployee();
	}
	
	
	public static void showEmployee()
	{	
		Employee emp = new Employee();
		System.out.println("Employee name : " +emp.name);
		System.out.println("Salary : " +emp.salary);
		System.out.println("Company name : " +Employee.company);
	}
}