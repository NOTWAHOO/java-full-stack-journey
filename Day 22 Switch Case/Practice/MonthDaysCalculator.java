
import java.util.Scanner;

public class MonthDaysCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month number (1-12): ");
        int month = sc.nextInt();

        switch (month) {
            // Months with 31 days (grouped together without break)
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("This month has 31 days.");
                break;

            // Months with 30 days
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("This month has 30 days.");
                break;

            // February
            case 2:
                System.out.println("This month has 28 days (non-leap year).");
                break;

            default:
                System.out.println("Invalid month number! Please enter between 1 and 12.");
                break;
        }

        sc.close();
    }
}