package Wiley_proj;

public class PracStaticBlock {
	
	static {
		System.out.println("Inside static block");
	}
	
	static {
		System.out.println("Static block 2");
	}
	
	{
		System.out.println("Inside instance block");
	}
	
	PracStaticBlock() {
		System.out.println("Inside constructor");
	}
	
	public static void main(String[] args) {
		
		new PracStaticBlock();
		new PracStaticBlock();
		new PracStaticBlock();
		
	}
}
