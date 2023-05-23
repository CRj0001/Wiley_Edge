package LambdaExp;

import java.util.HashMap;
import java.util.function.Function;

public class BuiltinFunction {

	static HashMap<Integer, String> emp = new HashMap<>();
	
	public static void add(int id, String name) {
		if(emp.containsKey(id)) {
			System.out.println("Employee exists");
			return;
		}
		emp.put(id, name);
	}
	
	public static void main(String[] args) {
		
		Function<Integer, String> get = (s) -> {
			if(emp.containsKey(s))
				return emp.get(s);
			return "Invalid Id";
		};
		
		add(123,"Raj");
		add(223,"sahil");
		add(323,"Ritik");
		add(423,"Arpita");
		add(523,"Priya");
		
		System.out.println(get.apply(123));
		System.out.println(get.apply(1233));

	}
}
