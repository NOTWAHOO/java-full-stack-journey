

public class Inheritance_DelhiveryPartner extends Object {
	// func
	public void doDelivery() {
		System.out.println("Inheritance_DelhiveryPartner.doDelivery()");
	}

	class XpressBee extends Inheritance_DelhiveryPartner {
		// can reuse here + can override the method of parent class
		@Override
		public void doDelivery() {
			System.out.println("Inheritance_DelhiveryPartner.XpressBee.doDelivery()");
		}
	}

	class Ekart extends XpressBee {

	}
}
