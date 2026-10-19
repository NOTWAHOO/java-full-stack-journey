
import java.util.Scanner;

public class AtmMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 10000.0;

        System.out.println("--- Welcome to the ATM ---");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Exit");
        System.out.print("Enter your choice (1-4): ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Current Balance: Rs. " + balance);
                break;

            case 2:
                System.out.print("Enter amount to deposit: Rs. ");
                double depositAmount = sc.nextDouble();
                if (depositAmount > 0) {
                    balance += depositAmount;
                    System.out.println("Successfully deposited! Updated Balance: Rs. " + balance);
                } else {
                    System.out.println("Invalid deposit amount.");
                }
                break;

            case 3:
                System.out.print("Enter amount to withdraw: Rs. ");
                double withdrawAmount = sc.nextDouble();
                if (withdrawAmount <= 0) {
                    System.out.println("Invalid withdrawal amount.");
                } else if (withdrawAmount <= balance) {
                    balance -= withdrawAmount;
                    System.out.println("Please collect your cash. Remaining Balance: Rs. " + balance);
                } else {
                    System.out.println("Transaction Failed: Insufficient balance!");
                }
                break;

            case 4:
                System.out.println("Thank you for banking with us!");
                break;

            default:
                System.out.println("Invalid selection. Please choose 1 to 4.");
                break;
        }

        sc.close();
    }
}