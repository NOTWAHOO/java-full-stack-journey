class LoginValidation
{
	public static void main(String args[])
	{
	System.out.println("Entered main Method()");
	boolean credentials = LoginValidation.login("Stephen Sabar" , "Wfafaffa");
	System.out.println("Passed : " +credentials);	
		
	}
	
	static boolean login(String username, String password)
	{
	System.out.println("Username : " +username+ " Password : " +password);
		
	return true;
	}
}