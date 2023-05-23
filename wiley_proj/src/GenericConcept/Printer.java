package GenericConcept;

public class Printer<T extends Animal> {

	T val;
	
	Printer(T val) {
		this.val = val;
	}
	
	public void print() {
		System.out.println(val);
	}
}
