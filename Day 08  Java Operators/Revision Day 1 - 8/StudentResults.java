class StudentResults
{
	String name;
	int marks;
	static String schoolName = "Ravenshaw University";

	public static void main(String args[])
	{
	StudentResults student = new StudentResults();
	student.name = args[0];
	student.marks = Integer.parseInt(args [1]);
	
	student.displayResult();
		
	}
	void displayResult()
	{
	System.out.println("Name of the Student : " +name ); 
	System.out.println("Marks of the Student : " +marks );
	System.out.println("School Name of the Student : " +schoolName);
	}
}