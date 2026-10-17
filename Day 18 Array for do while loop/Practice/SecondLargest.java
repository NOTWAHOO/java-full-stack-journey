
public class SecondLargest {

	public static void main(String[] args) {
		int marks[] = {68,92,45,88,95,73};
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		
		for(int i = 0; i < marks.length; i++)
		{
			if(marks[i] > largest)
			{
				secondLargest = largest;
				largest = marks[i];
				
			}
			else if (marks[i] > secondLargest && marks[i] != largest)
			{
				secondLargest = marks[i];
			}
		}
		System.out.println("Largest Mark : " +largest);
		System.out.println("Second Largest Mark : " +secondLargest);
		
	}

}
