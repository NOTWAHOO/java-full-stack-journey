class InstanceMethod
{
	String name;
	int marks;

	public static void main(String args[])
	{
	InstanceMethod student = new InstanceMethod();
	
	student.name = "Stephen Sabar";
	student.marks = 400;
	
	
	student.displayStudent();
		
	}
	
	void displayStudent()
	{
	System.out.println("Name of the student : " + name);
	System.out.println("Mark of the student : " + marks);
	}
}