package LambdaExp;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class BuiltInBiFunction {

	
	public static void main(String[] args) {
		
		UnaryOperator<Integer> un = n -> n^1;
		System.out.println(un.apply(5));
		
		BinaryOperator<Integer> bn = (n,m) -> n*m;
		System.out.println(bn.apply(5,5));
	}
	
}
