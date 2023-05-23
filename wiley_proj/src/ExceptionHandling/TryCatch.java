package ExceptionHandling;

public class TryCatch {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,6};
		
		System.out.println("Starting statement");
		
		try {
			System.out.println(arr[3]);
			System.out.println(arr[0]);
			
			System.out.println("Statement 1");
			
			String str = "Raj";
			System.out.println(str.charAt(9));
			
			System.out.println("Statement 2");
			
			int n =8/0;
			System.out.println("Statement 3");
			
		} catch ( ArrayIndexOutOfBoundsException e) {
			
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			e.printStackTrace();
			
		} catch(IndexOutOfBoundsException e) {
			System.out.println("catch 2");
			e.printStackTrace();
			
		} catch(Exception e) {
			System.out.println("catch 3");
			e.printStackTrace();
		}
		
		System.out.println("End Statement");
	}

}
