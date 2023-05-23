package LambdaExp;

public class LambdaClass {

	public static void printThing(Printable thng) {
		 thng.print("Chourasia");
	}

	public static void main(String[] args) {
		PrintProduct pt = new PrintProduct();
//		pt.print();

//		printThing(pt);

//		printThing(() -> System.out.println("Inside Lambda"));
	
//		Printable ptb = ()->System.out.println("Lambda Principle");
//		printThing(ptb);
//		ptb.print();
							
//		Printable ptb = a -> System.out.println("Lambda Principle with args - "+a);

//		Printable ptb = (a,b) -> System.out.println("Lambda Principle with args - "+a*b);
//		ptb.print(9,10);
		
//		Printable ptb = a -> 98;
		
		Printable ptb = s -> {
			System.out.println("Raj " + s);
			return "Raj";
			};
		ptb.sayHi();
		printThing(ptb);
	}
}


