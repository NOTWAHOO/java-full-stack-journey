

 class Delivery extends Object {
	public void doDelivery() {
		System.out.println("Polymorphism_Delivery.doDelivery()... Delivery ");
	}

}

class ExpressBee extends Delivery {
	@Override
	public void doDelivery() {
		System.out.println("Polymorphism_Delivery.doDelivery()... ExpressBee ");
	}
}

class Ekart extends Delivery {
	@Override
	public void doDelivery() {
		System.out.println("Polymorphism_Delivery.doDelivery()... Ekart ");
	}
}

 class Polymorphism_Delivery {
	public static void main(String[] args) {
		Delivery delivery = new Delivery();
		//Compile time --> it will check the method in Delivery class
		//Runtime --> it will call the method of Delivery class
		delivery.doDelivery();
	}
}
