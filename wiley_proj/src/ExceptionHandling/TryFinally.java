package ExceptionHandling;

public class TryFinally {
	
	public static void main(String[] args) {
		
		try {
			try {
				System.out.println("Nested try");
				System.out.println(7/0);
			}catch(Exception e) {
				e.printStackTrace();
				System.out.println("Nested catch");
			} finally {
				System.out.println("Nested finally");
			}
			System.out.println("Raj");
			System.out.println(5/0);
			//System.exit(0);
		} catch(Exception e) {
			try {
				System.out.println("Nested catch try");
				System.out.println(7/0);
			}catch(Exception ei) {
				ei.printStackTrace();
				System.out.println("Nested catch catch");
			} finally {
				System.out.println("Nested finally catch");
			}
			e.printStackTrace();
		//	System.exit(0);
		} finally {
			try {
				System.out.println("Nested try finally");
				System.out.println(7/0);
			}catch(Exception e) {
				e.printStackTrace();
				System.out.println("Nested catch finally");
			} finally {
				System.out.println("Nested finally finally");
			}
		//	System.out.println(7/0);
			System.out.println("Inside Finally");
		}
		
		System.out.println("End Statement");
	}

}
