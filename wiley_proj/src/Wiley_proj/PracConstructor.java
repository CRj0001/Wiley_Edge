package Wiley_proj;

public class PracConstructor {
	
	PracConstructor(){
		this(5,6);
		System.out.println("Cons. with 0 args.");
	}
	
	

	PracConstructor(int a, float b){
		System.out.println("Cons. with int & float args. : "+(a+b));
	}
	

	PracConstructor(int a, int b){
		this(6,7.0f);
		System.out.println("Cons. with int & int args. : "+(a+b));
	}
	
	
	public static void main(String[] args) {
		
		PracConstructor pc = new PracConstructor();
		
	}
}
