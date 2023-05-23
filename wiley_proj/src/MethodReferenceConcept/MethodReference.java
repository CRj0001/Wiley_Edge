package MethodReferenceConcept;


interface Dog{
	void bark();
}
public class MethodReference {
	
	static void walk() {
		System.out.println("Dog is walking.");
	}
	
	static void run() {
		System.out.println("Dog is running.");
	}
	
	public static void main(String[] args) {
		Dog d = MethodReference::walk;
		d.bark();
		
		Thread t1 = new Thread(MethodReference::run);
		t1.start();
	}
}
