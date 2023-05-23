package LambdaExp;

import java.util.function.BiConsumer;
import java.util.function.Consumer;


public class BuiltInConsumer {
	public static void main(String[] args) {
		Consumer<String> cns = (a) -> System.out.println(a);
		cns.accept("Raj Chourasia");
		
		BiConsumer<String, String> bcns = (a,b) -> {
			System.out.println(a+ " "+b);
		};
		bcns.accept("Wiley", "Edge");
	}
}
