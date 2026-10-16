//WAP to create a class named Student with:

//Two private variables: name (String) and rollNo (int).

//public methods setName(String newName) and setRollNo(int newRollNo) to assign values.

//A public method displayInfo() to print the student's name and roll number.

//In the main method, create a student, set their details, and print them.


class Student
{
	private String name;
	private int rollNo;
	
	public void setName (String newName)
	{
	name = newName;
	
		
	
	
	}
	public void setRollNo(int newRollNo)
	{
	rollNo = newRollNo;
	
	
	
	}
	
	public void displayInfo()
	{
	System.out.println("Student name : " + name);
	System.out.println("Roll No :" + rollNo);
	
	}
}