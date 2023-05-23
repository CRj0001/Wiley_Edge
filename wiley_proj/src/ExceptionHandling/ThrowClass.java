package ExceptionHandling;

public class ThrowClass {

	public static void m1() {
		try {
			m2();
		} catch(InterruptedException ie) {
			ie.printStackTrace();
		}
	}
	
	public static void m2() throws InterruptedException {
		Thread t1 = new Thread();
		t1.sleep(1000);
		System.out.println("Inside m2");
	}
	
	public static void main(String[] args) {
		m1();
	}
	
}
