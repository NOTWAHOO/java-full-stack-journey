import java.util.Scanner;

class Loops
{ 
	public static void main (String args[])
	{
		int [] arr = {1,18,46,96,5};
		String [] names = new String [5];
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < names.length; i++)
			{
			System.out.println("Input :");
			String input = sc.nextLine();
			names[i] = input;
			}
	}
}
	