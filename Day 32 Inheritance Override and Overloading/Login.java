

public class Login {
	//works with in the class
	//You have multiple version of same method
	//same method name
	// Order of args, number of args and type of args should be different
	
	public void doLogin(String mobile, int otp)
	{
		System.out.println("Login.doLogin(String mobile, int otp)....");
	}
	public String doLogin(String email, String password)
	{
		System.out.println("Login.doLogin(String email, String password)....");
		return "Some value";
	}
	public void doLogin(String gmail)
	{
		System.out.println("Login.doLogin(String gmail)....");
	}

}
