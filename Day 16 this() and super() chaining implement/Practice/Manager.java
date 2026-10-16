

public class Manager extends Employee {
	String department;
	
	public Manager(int empID, String name, String department) {
		super(empID, name);
		this.department = department;
	}
	void showManager()
	{
		System.out.println("Department : " +department);
	}
}
