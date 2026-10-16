class PassFail
{
	public static void main(String args[])
	{
		String name = args[0];
		int marks = Integer.parseInt(args[1]);
		
		System.out.println("Student name : " +name);
		System.out.println("Marks : " +marks);
		System.out.println("Result : " +((marks >=40) ? "PASS" : "FAIL"));
	}
}