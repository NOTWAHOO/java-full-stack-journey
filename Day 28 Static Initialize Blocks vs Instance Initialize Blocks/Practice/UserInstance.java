

public class UserInstance {
	
	static int liveUserCount = 0;

	
		String name;
		String serialNo;
		String phoneNumber;
		
		public UserInstance(String name, String serialNo, String phoneNumber)
		{
			
			this.name = name;
			this.serialNo = serialNo;
			this.phoneNumber = phoneNumber;
		}
		static
		{
			System.out.println("Campus Selection Process : ");
		}

		{
			liveUserCount = liveUserCount + 1;
		}
		{
			System.out.println("Candidate participation Details are here : ");
		}

		void detailsCandidate()
		{
			System.out.println("Name : " + name);
			System.out.println("Serial No : " + serialNo);
			System.out.println("Phone Number : " + phoneNumber);
		}

	}

