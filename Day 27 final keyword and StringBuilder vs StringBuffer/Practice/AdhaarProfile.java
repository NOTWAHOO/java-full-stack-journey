

public class AdhaarProfile {
	final long adhaarNumber;
	String holderName;

	public AdhaarProfile(long adhaarNumber, String holderName) {
		super();
		this.adhaarNumber = adhaarNumber;
		this.holderName = holderName;
	}

	public void displayDetails() {
		System.out.println(adhaarNumber);
		System.out.println(holderName);
	}

}
