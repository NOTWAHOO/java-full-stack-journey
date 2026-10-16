import java.util.Scanner;

public class VotingEligibility {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Age to verify if you're eligible for voting...");
		int age = sc.nextInt();
		sc.nextLine();
		
		if (age >= 18) {
			System.out.println("Age is : " + age + " Eligibile for voting");
		} else {
			System.out.println("Age is : " + age + " NOT-Eligibile for voting");
		}
		sc.close();

	}

}