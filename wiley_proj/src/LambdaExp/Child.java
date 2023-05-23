package LambdaExp;

@FunctionalInterface
public interface Child extends Parent{
//	void Dance();
	void speak();
	
	static void sing() {
		
	}
	
	//It can have abstract methods of object classes
	
	String toString();
	int hashCode();
	boolean equals(Object o);
}
