package Wiley_proj;

public class PracVar {
	
	static String name = "Raj";
	int ins = 1;
	int var = 10;
	int var2 = 20;
	
	void sum() {
		int var = 100;
		int var2 = 200;
		
		System.out.println("Sum of local vars : "+(var+var2));
		System.out.println("Sum of Instance vars : "+(this.var+this.var2));
	}
	public static void main(String[] args) {
		int loc = 2;
		
		PracVar obj = new PracVar();
		
		//this.ins;
		System.out.println("Local variable loc : " + loc);
		System.out.println("Instance variable loc : " + obj.ins);
		System.out.println("Static variable name : " + name);
		
		obj.sum();
	}
}
