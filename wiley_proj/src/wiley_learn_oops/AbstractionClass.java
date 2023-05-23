package wiley_learn_oops;

abstract class Test1 {
	
	{
		System.out.println("Test 1 instance block");
	}

	static{
		System.out.println("Test 1 static block");
	}
	
	abstract void abc();
	
	public static void main(String[] a) {
		System.out.println("Inside Test1 main");
		for(String str : a) {
			System.out.println(str);
		}
	}
	
	void xyz() {
		System.out.println("Inside Test1 xyz");
	}
	
	Test1(){
		System.out.println("Test1 constructor");
	}
}

class Test2 extends Test1{
	
	{
		System.out.println("Test 2 instance block");
	}
	
	static{
		System.out.println("Test 2 static block");
	}
	
	void abc() {
		System.out.println("Inside Test2 abc");
	}
	
	Test2(){
		super();
		System.out.println("Test2 constructor");
	}
}

public class AbstractionClass {
	
	public static void main(String[] args) {

		Test2 t2 = new Test2();
		
		t2.abc();
		t2.xyz();

		Test1.main(args);
		
	}
}
