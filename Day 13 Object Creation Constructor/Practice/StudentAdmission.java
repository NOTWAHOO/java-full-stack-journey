
public class StudentAdmission {
	private String name;
	private int rollNo;

	StudentAdmission(String _name, int _rollNo) {
		this.name = _name;
		System.out.println("Name of the Student : " + name);
		this.rollNo = _rollNo;
		System.out.println("Roll No. of the Student : " + rollNo);
	}

	public void printStudent() {
		System.out.println("Name of the Student : " + name);
		System.out.println("Roll No. of the Student : " + rollNo);
	}

}
