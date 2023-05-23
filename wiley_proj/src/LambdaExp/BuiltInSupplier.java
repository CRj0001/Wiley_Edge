package LambdaExp;

import java.util.function.Supplier;

public class BuiltInSupplier {

	public static void main(String[] args) {
		Supplier<String> sp = () -> "Hello World";
		System.out.println(sp.get());
	}
}
