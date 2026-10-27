

 class Deliveryy {
	public void doDelivery() {
		System.out.println("Polymorphism_Delivery.doDelivery()... Delivery ");
	}

}

class ExpressedBee extends Deliveryy {
	@Override
	public void doDelivery() {
		System.out.println("Polymorphism_Delivery.doDelivery()... ExpressedBee");
	}
}

class Ekarte extends Deliveryy {
	@Override
	public void doDelivery() {
		System.out.println("Polymorphism_Delivery.doDelivery()... Ekarte ");
	}
}

class Polymorphism_UP_DOWN{
	public static void main(String[] args) {
		//Deliveryy delivery = new Delivery();
		//Compile time --> it will check the method in Delivery class
		//Runtime --> it will call the method of Delivery class
		//delivery.doDelivery();
		
		Deliveryy del = new ExpressedBee();
		ExpressedBee bee = (ExpressedBee) del;
		bee.doDelivery();
	}
}



