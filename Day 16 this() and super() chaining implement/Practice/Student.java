

public class Student extends Person {
	int rollNo;

	void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	void displayStudent() {
		System.out.println("Roll No : " + rollNo);
	}
}
