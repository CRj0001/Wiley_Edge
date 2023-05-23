package wiley_learn_oops;

class Animals {
	void talk() {
		System.out.println("Talking");
	}
}

class Dog extends Animals{
//	void talk() {
//		System.out.println("Barking");
//	}
	
	void talk() {
		System.out.println("Barking");
	}
		
}

public class RunTimePolymorphism {
	public static void main(String[] args) {
		Dog an = new Dog();
		an.talk();
	}
}
