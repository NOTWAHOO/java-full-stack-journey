

public class Account {
	
	int minBalance = 1000;
	
	public String openAccount(String name, int initBal) {
		
		//some .... 100 lines of code --> X
		System.out.println("Account.openAccount().....");
		return "Some String Created";
	}

}

class SavingAccounnt extends Account
{	
	// 1. Method name should be same.
	// 2. Type, Order and NUmber of args should be same
	// 3. Return type should be same except covariant
	// 4. Access modifier --> should be same or widen (public --> public, protected --> protected or public)
	
	@Override //you are telling compiler that  I am overriding the method. Please check all the rules.
	public  String openAccount(String surname, int balance)
	{	
		//200 lines of the code --> X+1
		System.out.println("SavingAccounnt.openAccount()........");
		return "Some other String";
	}

}
