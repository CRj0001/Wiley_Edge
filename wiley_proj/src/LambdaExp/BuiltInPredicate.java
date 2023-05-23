package LambdaExp;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class BuiltInPredicate {
	public static void main(String[] args) {
		
		Predicate<Integer> age = (n) -> (n>18);
		
		List<Integer> list = Arrays.asList(23,21,65,2,5,67,8,5);
		
		list.forEach( l -> {
			if(age.test(l)) {
				System.out.println("Adult");
			} else {
				System.out.println("Kid");
			}
		});
		
	}
}
