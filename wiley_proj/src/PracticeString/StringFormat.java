package PracticeString;

import java.util.Arrays;
import java.util.List;

public class StringFormat {
	public static void main(String[] args) {
		
//		String name = "Raj Chourasia";
//		int age = 21;
//		float salary = 18000.345f;
//		
//		System.out.format("%s has salary %d is %f years old", name, age, salary);
	
		List<String> arr = Arrays.asList("Digital Fortress", "Sepians", "One Indian Girl");
		
		for(String str : arr) {
			System.out.printf("%-20s - In stock%n", str);
		}
	
	}
}
