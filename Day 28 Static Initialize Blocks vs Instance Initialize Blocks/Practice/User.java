

public class User {
	String name;
	String serialNo;
	String phoneNumber;

	static {
		System.out.println("Campus Selection Process : ");
	}

	public User(String name, String serialNo, String phoneNumber) {
		this.name = name;
		this.serialNo = serialNo;
		this.phoneNumber = phoneNumber;
	}

	{
		System.out.println("Candidate participation Details are here : ");
	}

	void detailsCandidate() {
		System.out.println("Name : " + name);
		System.out.println("Serial No : " + serialNo);
		System.out.println("Phone Number : " + phoneNumber);
	}

}
