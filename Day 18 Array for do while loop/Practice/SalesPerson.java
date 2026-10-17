
public class SalesPerson {
	int empId;
	String name;
	int unitsSold;
	double commissionPerUnit;

	public SalesPerson(int empId, String name, int unitsSold, double commissionPerUnit) {
		super();
		this.empId = empId;
		this.name = name;
		this.unitsSold = unitsSold;
		this.commissionPerUnit = commissionPerUnit;
	}

	double calculateTotalCommission() {
		return unitsSold * commissionPerUnit;
	}

	void displayDetails() {
		System.out.println("Employee ID : " + empId);
		System.out.println("Employee Name : " + name);
		System.out.println("Employee UnitsSold  : " + unitsSold);
		System.out.println("Employee Commission Per Unit : " + commissionPerUnit);
	}

}
