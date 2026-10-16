package com.amazon.Scanner;

import java.util.Scanner;

public class DriverStudent {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("How many students? ");
		int size = sc.nextInt();

		// Step 1: Create an array of empty slots with the given size
		Student students[] = new Student[size];

		// Step 2: Fill the array with user input
		for (int i = 0; i < students.length; i++) {
			System.out.println("\n--- Enter details for student " + (i + 1) + " ---");

			System.out.print("Roll No: ");
			int rollNo = sc.nextInt();
			sc.nextLine(); // Clear newline buffer after reading an integer

			System.out.print("Name: ");
			String name = sc.nextLine();

			System.out.print("Marks: ");
			int marks = sc.nextInt();
			sc.nextLine(); // Clear newline buffer

			// Store the new Student directly into slot i
			students[i] = new Student(rollNo, name, marks);
		}

		// Step 3: Run the Champion algorithm
		Student maxStudent = students[0]; // Champion starts at index 0

		for (int i = 1; i < students.length; i++) {
			if (students[i].marks > maxStudent.marks) {
				maxStudent = students[i]; // Update whole object reference
			}
		}

		// Step 4: Display the champion
		System.out.println("\n--- Top Scorer ---");
		maxStudent.displayStudent();

		sc.close();
	}
}