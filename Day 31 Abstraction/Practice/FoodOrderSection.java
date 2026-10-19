

public class FoodOrderSection {
	int totalOrder;

	public boolean placeOrder(String name, String address, String phoneNumber, String payment, int totalOrder) {
		this.totalOrder = totalOrder;
		paymentDone(payment);
		UserDetails(name, address, phoneNumber);
		atleastOrder(totalOrder);
		return true;
	}
	//core Functionalites
	private boolean paymentDone(String payment) {
		System.out.println("FoodOrderSection.paymentDone().... Verifying Payments");
		return true;
	}

	private boolean UserDetails(String name, String address, String phoneNumber) {
		System.out.println("FoodOrderSection.UserDetails()... User Details Name, Address, Phone Number :");
		return true;
	}

	private int atleastOrder(int totalOrder) {
		for (int i = 0; i < totalOrder; i++) {
			if (totalOrder >= 1) {
				System.out.println("FoodOrderSection.atleastOrder()... Verifying total Order " +(i+1));
				
			} else {
				System.err.println("Order not completed ...!!!! ");
			}
		}
		return 1;

	}

}
