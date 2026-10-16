
public class EmployeeDriver {

	public static void main(String[] args) {
		int emp1 = Integer.parseInt(args[0]);
		double sal = Integer.parseInt(args[1]);
		Employee emp = new Employee(emp1,sal);
		emp.showSlip();

	}

}
