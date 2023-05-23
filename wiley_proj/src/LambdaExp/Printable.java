package LambdaExp;

public interface Printable {
//	void print();
//	int print(int a, int b);
//	int print(int a);
//	void printThing(Printable ptb);

 String print(String s);
 
 default void sayHi() {
	 System.out.println("Hello");
 }
 
 static void sayHello() {
	 System.out.println("Hii");
 }
}
