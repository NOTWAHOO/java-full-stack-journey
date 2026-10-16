import java.util.Scanner;

class IfElse
{
		public static void main(String args [])
	{
		System.out.print("Emter the age");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int age = integer.parseInt(s);
		
		if (age >= 18)
		{
		System.out.println("Input your fav food:");
		String food = sc.nextLine();
		if (food.equals("pizza"))
		{
			System.out.println("Mine Too");
		}
		
		else
		{
		System.out.println("Not mine");
		}
		
		}
	}
}