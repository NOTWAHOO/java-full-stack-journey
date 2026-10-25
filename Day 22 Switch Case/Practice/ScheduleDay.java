
import java.util.Scanner;

public class ScheduleDay {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 to 7 to find your Study subject schedule : ");
		int dayNum = sc.nextInt();
		sc.nextLine();
		
		switch(dayNum)
		{
		case 1:
			System.out.println(" Day 1 is schedule for Mathematics Monday : Thank you");
			break;
		case 2:
			System.out.println(" Day 2 is schedule for Chemistry Tuesday : Thank you");
			break;
		case 3:
			System.out.println(" Day 3 is schedule for Biology Wednesday : Thank you");
			break;
		case 4:
			System.out.println(" Day 4 is schedule for History Thursday : Thank you");
			break;
		case 5:
			System.out.println(" Day 5 is schedule for Physics Friday : Thank you");
			break;
		case 6:
			System.out.println(" Day 6 is schedule for English Saturday : Thank you");
			break;
		case 7:
			System.out.println(" Day 7 is schedule for Revision what you study Mon to Sat. Thank you");
			break;
			default:
				System.err.println("Please enter 1 to 7 to find subject schedule to the Days. Thank you");
				break;
			
		}
		sc.close();
	}

}
