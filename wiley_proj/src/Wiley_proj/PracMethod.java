package Wiley_proj;


class Test{
	static int  sum(int a, int b) {
		int ans = a+b;
		return ans;
		
	}
}

public class PracMethod {
	
	void sum(int a, int b) {
		int ans = a+b;
		System.out.println("Sum in instance method : "+ans);
		
		this.sub(20, 10);
		
	}
	
	void sub(int a, int b) {
		int ans = a-b;
		System.out.println("Subtraction in instance method : "+ans);
	}
	
//	static void mult(int a, int b) { 
//		int ans = a*b;
//		System.out.println("Mult in static method : "+ans);
//	}
	
	static int mult(int a, int b) { 
		int ans = a*b;
		System.out.println("Mult in static method : "+ans);
		return ans;
		
	}
	 
	public static void main(String[] args) {
		int ans = mult(10, 20);
		System.out.println("mult is : "+ans);
		
		PracMethod obj = new PracMethod();
		
		obj.sum(10, 20);
		
		System.out.println(Test.sum(50, 60));
	}
}
