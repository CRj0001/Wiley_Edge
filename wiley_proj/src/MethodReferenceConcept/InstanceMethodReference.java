package MethodReferenceConcept;

interface Person {
	void speak();
}

public class InstanceMethodReference {

	public void sayHello() {
		System.out.println("Hello");
	}
	

	public void sayHii() {
		System.out.println("Hii");
	}
	
	public static void main(String[] args) {
		Person p = (new InstanceMethodReference())::sayHello;
		p.speak();
		
		Thread t1 = new Thread((new InstanceMethodReference()::sayHii));
		t1.start();
	}
}
