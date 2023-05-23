package wiley_learn_oops;


class Vehicle1{
	void start() {
		System.out.println("Starting");
	}
}

class Car1 extends Vehicle1{
	void airbag() {
		System.out.println("Airbag");
	}
}

class Truck extends Vehicle1{
	
	void hydraulicPump(){
		System.out.println("Hydraulic pump");
	}
}
public class HeieaechalInheritance {
	public static void main(String[] args) {
		
		Car1 c =new Car1();
		
		c.airbag();
		c.start();
		
		Truck t = new Truck();
		
		t.hydraulicPump();
		t.start();
	}
}
