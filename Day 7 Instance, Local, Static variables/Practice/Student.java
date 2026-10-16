class Student
{	
	String name;
	int marks;
	static String schoolName = "Kodewala";
	
	public static void main(String args[])
	{
		Student student1 = new Student();	
		student1.name = "Stephen";
		student1.marks = 85;
				
		System.out.println("Student 1 name : " +student1.name);
		System.out.println("Marks : " +student1.marks);
		System.out.println("School Name : " +Student.schoolName);
	Student.student2();
	}
	
	
	public static void student2()
	{
		Student student2 = new Student();
		student2.name = "Rahul";
		student2.marks = 90;
		System.out.println("Student 2 name : " +student2.name);
		System.out.println("Marks : " +student2.marks);
		System.out.println("School Name : " +Student.schoolName);
	}
}