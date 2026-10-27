

public class Client {

	public static void main(String[] args) {
		Payment payment = new Payment();
		new PaymentProcessor().doPaymentUpdate(payment);
		
		

	}

}
