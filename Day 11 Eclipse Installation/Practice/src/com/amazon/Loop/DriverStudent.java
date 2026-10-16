package com.amazon.Loop;

public class DriverStudent {

	public static void main(String[] args) {
		Student student0 = new Student("Stephen Sabar", 10);
		Student student1 = new Student("Akash Sabar", 600);
		Student student2 = new Student("Asha Rani Sabar", 900);
		
		
		Student student[] = new Student[3];
		student[0] = student0;
		student[1] = student1;
		student[2] = student2;
		
		
		for(int i = 0; i < student.length; i++)
		{
			if(student[i].marks > 50)
			{
				System.out.println("Passed candidate : " +student[i].name);
				System.out.println("Passed candidate : " +student[i].marks);
			}
		}
		

	}

}
