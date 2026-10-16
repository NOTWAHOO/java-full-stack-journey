import java.util.Scanner;

class DriverStudent {
	public static void main(String args[])

	{
		Scanner sc = new Scanner(System.in);
		System.out.println("How many students? ");
		int n = sc.nextInt();
		sc.nextLine();
		Student student[] = new Student[n];

		for (int i = 0; i < n; i++) {
			System.out.println("\n--- Enter details for Student " + (i + 1) + " ---");
			
			System.out.println("Student Roll No:? ");
			String rollNo = sc.nextLine();

			System.out.println("Student Name? ");
			String name = sc.nextLine();

			System.out.println("Student Marks :? ");
			int marks = sc.nextInt();
			sc.nextLine();

			student[i] = new Student(rollNo, name, marks) ;
		}
			Student max = student[0];
			for(int i =1; i < student.length;i++ )
			{
			if (student[i].marks > max.marks) {
				max = student[i];
			}
		}
		System.out.println("--- Top Scorer ---");
		max.displayStudent();
		sc.close();
	}
}