class PassFail
{
	public static void main(String args[])
	{
		String name = args[0];
		int marks = Integer.parseInt(args[1]);
		System.out.println("Name of the Student : " +name);
		String result = (marks >= 40) ? "Pass" : "Fail";
		System.out.println("Result : " +result);
	}
}