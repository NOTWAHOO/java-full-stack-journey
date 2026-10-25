

public class Client {

	public static void main(String[] args) {
		GoldSubscription goldSubscription = new GoldSubscription();
		new SubscriptionHandler().doUpgrade(goldSubscription);

	}

}
