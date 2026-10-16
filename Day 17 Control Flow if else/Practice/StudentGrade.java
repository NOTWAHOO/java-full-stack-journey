import java.util.Scanner;

public class StudentGrade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your total marks out of 100");
		int marksEarned = sc.nextInt();
		
		if ( marksEarned>=90  )
		{
			System.out.println("Result : Grade A ");
		}
		else if(marksEarned >= 75)
		{
			System.out.println("Result : Grade B ");
		}
		else if(marksEarned >= 50)
		{
			System.out.println("Result : Grade c ");
		}
		else
		{
			System.out.println("Result : Failed. Please appear for supplementary exams. ");
		}
		

	}

}
