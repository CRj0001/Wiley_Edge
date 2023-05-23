package wiley_learn_oops;

class Vehicle2{
	void start() {
		System.out.println("Starting");
	}
}

class ElectricVehicle extends Vehicle2{
	void run() {
		System.out.println("run with battery");
	}
}

class PetrolVehicle extends Vehicle2{
	void run() {
		System.out.println("with petrol");
	}
}

class Bike extends PetrolVehicle{
	void wheels() {
		System.out.println("Two wheeler");
	}
}

class HeroHonda extends Bike{
	void brand() {
		System.out.println("Hero Honda");
	}
}

public class HybridInheritance {
	
	public static void main(String[] args) {
		
		HeroHonda c = new HeroHonda();
		
		c.brand();
		c.wheels();
		c.run();
		c.start();
	}
}
