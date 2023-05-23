package LambdaExp;

//@FunctionalInterface

@FunctionalInterface
interface Maths {
	
	int calc(int a);
}

public class FunctionalInterfaceEx {

	public static void main(String[] args) {
		
		Maths th = a -> a*10;
		
		System.out.println(th.calc(5));
	}
}
