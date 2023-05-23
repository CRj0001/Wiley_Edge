package wiley_learn_oops;

class Vehicle{
	void start() {
		System.out.println("Starting");
	}
}

class Car extends Vehicle{
	void airbag() {
		System.out.println("Be safe with Airbag");
	}
}

class SmartCar extends Car{
	void gps() {
		System.out.println("Know location with the help of GPS");
	}
}
public class MultilvlInheritance {
	
	public static void main(String[] args) {	
		SmartCar sc = new SmartCar();

		sc.start();
		sc.airbag();
		sc.gps();
	}
}
