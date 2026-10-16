class Student
{
	String rollNo;
	String name;
	int marks;
	
	Student(String rollNo, String name, int marks)
	{
	this.rollNo = rollNo;
	this.name = name;
	this.marks = marks;
	}
	
	void displayStudent()
	{
		System.out.println("Roll No. : " +rollNo);
		System.out.println("Name : " +name);
		System.out.println("Marks : " +marks);
	}
}