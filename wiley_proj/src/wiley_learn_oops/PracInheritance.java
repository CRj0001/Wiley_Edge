package wiley_learn_oops;


class Animal{
	
	void eat() {
		System.out.println("Eating");
	}
	
	void sleep() {
	System.out.println("Sleeping");	
	}
}

class Cat extends Animal{
	void meow() {
		System.out.println("Meow");
	}
}
public class PracInheritance {
	
	public static void main(String[] args) {
		Cat c = new Cat();
		c.eat();
		c.sleep();
		c.meow();
	}

}
