public class Employee {

	private int empId;
	private double salary;

	Employee(int _empId, double _salary) {
		this.empId = _empId;

		this.salary = _salary;

	}

	public void showSlip() {
		System.out.println("Employee ID : " + empId);
		System.out.println("Salary : " + salary);

	}
}
