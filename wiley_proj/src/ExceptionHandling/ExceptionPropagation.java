package ExceptionHandling;

public class ExceptionPropagation {
	
	public static void main(String[] args) {
		try {
			method1();
		} catch(Exception e) {
			System.out.println("Exception caught" + e.getMessage());
		}
	}
	
	public static void method1() throws Exception {
		method2();
	}
	
	public static void method2() throws Exception {
		throw new Exception("Exception occured");
	}
	
}
