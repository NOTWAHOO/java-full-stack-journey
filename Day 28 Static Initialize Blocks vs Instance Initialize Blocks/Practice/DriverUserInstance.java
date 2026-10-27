



public class DriverUserInstance {

	public static void main(String[] args) {

		System.out.println("STARTED ....");

		UserInstance u1 = new UserInstance("Stephen Sabar", "SSw241", "94564687645");
		u1.detailsCandidate();
		UserInstance u2 = new UserInstance("Asha Rani Sabar", "SSw441", "68579873542");
		u2.detailsCandidate();
		System.out.println("Total Live now : " +UserInstance.liveUserCount);

		System.out.println("ENDED...");


	}

}
