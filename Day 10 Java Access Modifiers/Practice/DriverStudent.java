//WAP to create a class named Student with:

//Two private variables: name (String) and rollNo (int).

//public methods setName(String newName) and setRollNo(int newRollNo) to assign values.

//A public method displayInfo() to print the student's name and roll number.

//In the main method, create a student, set their details, and print them.


class DriverStudent
{
	public static void main(String args[])
	{
		Student newObj = new Student();
		newObj.setName("Stephen");
		newObj.setRollNo(16848);
		newObj.displayInfo();
	}
}